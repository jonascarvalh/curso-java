package application;

import model.entities.Account;
import model.exceptions.BusinessException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        sc.nextLine();

        System.out.print("Holder: ");
        String holder = sc.nextLine();

        System.out.print("Initial Balance: ");
        Double initialBalance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, initialBalance, withdrawLimit);

        System.out.print("Enter amount for withdraw: ");
        Double withdrawAmount = sc.nextDouble();

        try {
            account.withdraw(withdrawAmount);
            System.out.print("New Balance: " + account.getBalance());
        } catch (BusinessException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error.");
        }

        sc.close();
    }
}