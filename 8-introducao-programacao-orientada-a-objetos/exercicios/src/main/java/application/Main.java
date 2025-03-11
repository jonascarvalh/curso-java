package application;

import entities.Employee;
import entities.Rectangle;
import entities.Student;
import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        exercise1();
        System.out.println();
        exercise2();
        System.out.println();
        exercise3();
        System.out.println();
        exercise4();
    }

    public static void exercise1() {

        Rectangle rectangle = new Rectangle();
        rectangle.height = 4.00;
        rectangle.width = 3.00;

        System.out.println("Surface: " + rectangle.surface());
        System.out.println("Perimeter : " + rectangle.perimeter());
        System.out.println("Diagonal : " + rectangle.diagonal());
    }

    public static void exercise2() {

        Employee employee = new Employee();
        employee.name = "João Silva";
        employee.grossSalary = 6000.00;
        employee.tax = 1000.00;

        System.out.println("Employee: " + employee);
        employee.increaseNetSalary(10.0);
        System.out.println("Updated data: " + employee);
    }

    public static void exercise3() {

        Student student = new Student();
        student.name = "Alex Green";
        student.grade1 = 27.00;
        student.grade2 = 31.00;
        student.grade3 = 32.00;
        System.out.println(student);

        Student student2 = new Student();
        student2.name = "Alex Green";
        student2.grade1 = 17.00;
        student2.grade2 = 20.00;
        student2.grade3 = 15.00;
        System.out.println(student2);
    }

    public static void exercise4() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();

        System.out.print("How to many dollars will be bought? ");
        double dollars = sc.nextDouble();

        System.out.print("Amount to be paid in reais = " + CurrencyConverter.convert(price, dollars));
        sc.close();
    }
}