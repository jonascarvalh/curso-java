package application;

import models.entities.Contract;
import models.services.ContractService;
import models.services.PaypalService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Número: ");
        int contractNumber = input.nextInt(); input.nextLine();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(input.nextLine(), dtf);

        System.out.print("Valor do contrato: ");
        double value = input.nextDouble();

        System.out.print("Entre com o número de parcelas: ");
        int installmentsNumber = input.nextInt(); input.nextLine();

        Contract contract = new Contract(contractNumber, date, value);
        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, installmentsNumber);
        showAllInstallments(installmentsNumber, contract);
    }

    private static void showAllInstallments(int installmentsNumber, Contract contract) {
        for (int i = 0; i < installmentsNumber; i++) {
            String dueDate = contract.getInstallments().get(i).getDueDate().format(dtf);
            System.out.println(dueDate + " - " + contract.getInstallments().get(i).getAmount());
        }
    }
}