package application;

import entities.Triangle;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Triangle triangleX, triangleY;
        triangleX = new Triangle();
        triangleY = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        triangleX.sideA = 3.00;
        triangleX.sideB = 4.00;
        triangleX.sideC = 5.00;

        System.out.println("Enter the measures of triangle Y: ");
        triangleY.sideA = 7.50;
        triangleY.sideB = 4.50;
        triangleY.sideC = 4.02;

        double areaX = triangleX.surface();
        double areaY = triangleY.surface();

        System.out.printf("Area of triangle X: %.4f%n", areaX);
        System.out.printf("Area of triangle Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
    }

}