package application;

import entities.Account;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        // Dois objetos do mesmo tipo mais genérico possam apontar para objetos de tipos específicos diferentes
        // resultando em comportamentos diferentes conforme o tipo específico
        Account acc1 = new Account(1001, "Jonas", 1000.0);
        Account acc2 = new SavingsAccount(1002, "Igor", 1000.0, 0.01);

        acc2.withdraw(200.0);
        acc1.withdraw(200.0);

        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
    }
}