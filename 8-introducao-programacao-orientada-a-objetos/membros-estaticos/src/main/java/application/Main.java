package application;

import util.Calculator;

public class Main {
    public static void main(String[] args) {

        double radius = 3.0;

        Calculator calculator = new Calculator();
        double c = calculator.circumference(radius);
        double v = calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calculator.PI);
    }
}