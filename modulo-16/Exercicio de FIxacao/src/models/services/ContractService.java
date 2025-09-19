package models.services;

import models.entities.Contract;
import models.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        Double installmentBaseValue = contract.getTotalValue() / 3;

        LocalDate dueDate = contract.getDate();
        for (int i = 1; i <= months; i++) {
            Double installmentValue = calculateInstallmenteValue(installmentBaseValue, i);

            dueDate = dueDate.plusMonths(1);
            Installment installment = new Installment(dueDate, installmentValue);
            contract.getInstallments().add(installment);
        }

    }

    private Double calculateInstallmenteValue(Double installmentBaseValue, int i) {
        Double interest = onlinePaymentService.interest(installmentBaseValue, i);
        Double installmentValue = installmentBaseValue + interest;
        installmentValue = installmentValue + onlinePaymentService.paymentFee(installmentValue);
        return installmentValue;
    }
}

