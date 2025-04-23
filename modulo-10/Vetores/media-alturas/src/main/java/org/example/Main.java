package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int vectorSize = 3;
        double[] vector = new double[vectorSize];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<vectorSize; i++) {
            vector[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < vectorSize; i++) {
            sum += vector[i];
        }
        double avg = sum / vectorSize;
        System.out.printf("AVERAGE_RATE: %.2f", avg);

        sc.close();
    }

}