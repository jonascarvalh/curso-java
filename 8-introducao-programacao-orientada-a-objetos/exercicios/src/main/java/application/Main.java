package application;

import entities.Employee;
import entities.Rectangle;
import entities.Student;

public class Main {
    public static void main(String[] args) {

        exercise1();
        System.out.println();
        exercise2();
        System.out.println();
        exercise3();
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
}