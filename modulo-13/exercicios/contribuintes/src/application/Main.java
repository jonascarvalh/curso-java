package application;

import entities.Company;
import entities.Individual;
import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<Person>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int qtyTaxPayers = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < qtyTaxPayers; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data: ");

            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0); sc.nextLine();

            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Annual income: ");
            Double annualIncome = sc.nextDouble();

            switch (ch) {
                case 'i':
                    System.out.print("Health expenditures: ");
                    double healthExpenditures = sc.nextDouble();
                    persons.add(new Individual(name, annualIncome, healthExpenditures));
                    break;
                case 'c':
                    System.out.print("Number of Employees: ");
                    int numOfEmployees = sc.nextInt(); sc.nextLine();
                    persons.add(new Company(name, annualIncome, numOfEmployees));
                    break;
                default:
                    System.out.println("Invalid input. Try again.");
                    break;
            }
        }

        Double totalTax = 0.0;
        System.out.println("TAXES PAID:");
        for (Person person : persons) {
            System.out.printf("%s: $ %.2f\n", person.getName(), person.paidTax());
            totalTax += person.paidTax();
        }

        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTax));
    }
}