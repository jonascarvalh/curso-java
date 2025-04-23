package org.example;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int vectorSize = sc.nextInt();

        Product[] vector = new Product[vectorSize];

        for (int i = 0; i < vector.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vector[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i].getPrice();
        }

        double avg = sum / vectorSize;
        System.out.printf("AVERAGE PRICE = %.2f", avg);
    }

}