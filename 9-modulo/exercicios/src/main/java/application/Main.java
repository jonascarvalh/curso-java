package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt(); sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double depositAmount = sc.nextDouble();
            account = new Account(number, holder, depositAmount);
        } else {
            account = new Account(number, holder);
        }

        System.out.println("Account data: ");
        System.out.println(account);

        System.out.print("Enter a deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        System.out.println(account);

        System.out.print("Enter a withdraw amount: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println(account);

        sc.close();
    }
}