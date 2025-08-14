package model.entities;

import model.exceptions.BusinessException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void withdraw(Double amount) {
        if (amount > withdrawLimit) {
            throw new BusinessException("The amount exceeds the limit.");
        }

        if (amount > balance) {
            throw new BusinessException("Not enough balance.");
        }

        balance = balance - amount;
    }
}
