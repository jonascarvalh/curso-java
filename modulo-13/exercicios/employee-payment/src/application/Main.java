package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<Employee>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < n; i++) {
            validateAndSaveEmployeeInfo(i, sc, employees);
        }

        showEmployeePayment(employees);
    }

    private static void validateAndSaveEmployeeInfo(int i, Scanner sc, List<Employee> employees) {
        System.out.println("Employee #" + (i + 1) + " data: ");

        System.out.print("Outsourced (y/n)?: ");
        char outsourced = sc.next().charAt(0);

        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Hours: ");
        int hours = sc.nextInt();
        sc.nextLine();

        System.out.print("Value per hour: ");
        double valuePerHour = sc.nextDouble();

        if (outsourced == 'y') {
            System.out.print("Additional charge: ");
            double additionalCharge = sc.nextDouble();
            employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
        } else {
            employees.add(new Employee(name, hours, valuePerHour));
        }
    }

    private static void showEmployeePayment(List<Employee> employees) {
        System.out.println("PAYMENTS");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - $ " + employee.payment());
        }
    }
}