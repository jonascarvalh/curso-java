package org.curso;

import entities.Employee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("How many employees will be registered? ");
        int qtyEmployees = sc.nextInt(); sc.nextLine();

        ArrayList<Employee> employees = new ArrayList<Employee>();

        for (int i = 0; i < qtyEmployees; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.print("Id: ");
            int id = sc.nextInt(); sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int employeeId = sc.nextInt(); sc.nextLine();

        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble(); sc.nextLine();

        Employee employee = employees.stream().filter(x -> x.getId() == employeeId).findFirst()
                .orElse(null);

        increaseSalaryEmployee(percentage, employee);
        showList(employees);
    }

    public static void increaseSalaryEmployee(double percentage, Employee employee) {
        if (employee != null) {
            employee.increaseSalary(percentage);
        } else {
            System.out.println("This employee id does not exist!");
        }
    }

    public static void showList(ArrayList<Employee> employees) {
        System.out.println("List of employees:");
        for (Employee emp : employees) {
            System.out.printf("%d, %s, %.2f\n", emp.getId(), emp.getName(), emp.getSalary());
        }
    }
}