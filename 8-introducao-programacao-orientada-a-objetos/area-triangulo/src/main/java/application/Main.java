package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle triangleX, triangleY;
        triangleX = new Triangle();
        triangleY = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        triangleX.sideA = sc.nextDouble();
        triangleX.sideB = sc.nextDouble();
        triangleX.sideC = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        triangleY.sideA = sc.nextDouble();
        triangleY.sideB = sc.nextDouble();
        triangleY.sideC = sc.nextDouble();

        double p = (triangleX.sideA + triangleX.sideB + triangleX.sideC) / 2.0;
        double areaX = Math.sqrt(p * (p - triangleX.sideA) * (p - triangleX.sideB) * (p - triangleX.sideC));

        p = (triangleY.sideA + triangleY.sideB + triangleY.sideC) / 2.0;
        double areaY = Math.sqrt(p * (p - triangleY.sideA) * (p - triangleY.sideB) * (p - triangleY.sideC));

        System.out.printf("Area of triangle X: %.4f%n", areaX);
        System.out.printf("Area of triangle Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }

}