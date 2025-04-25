package curso;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = scanner.nextLine();
        Department department = new Department(departmentName);

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Level: ");
        String level = scanner.nextLine();

        System.out.print("Base salary: ");
        double salary = scanner.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, department);

        System.out.print("How many contracts to this worker? ");
        int qtyContracts = scanner.nextInt(); scanner.nextLine();

        for (int i = 0; i < qtyContracts; i++) {
            System.out.printf("Enter contract #%d data: \n", (i+1));
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scanner.next());

            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = scanner.nextInt(); scanner.nextLine();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year  = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        scanner.close();
    }
}