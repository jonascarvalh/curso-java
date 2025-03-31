package org.curso;

import entities.Rent;

import java.util.Scanner;

public class Main {

    static int QTY_ROOMS = 10;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rooms will be rended? ");
        int qtyRooms = scanner.nextInt(); scanner.nextLine();

        Rent[] rentVect = new Rent[QTY_ROOMS];

        for (int i = 0; i < qtyRooms; i++) {
            System.out.printf("Rent #%d: \n", i + 1);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int roomPos = scanner.nextInt(); scanner.nextLine();

            Rent rent = new Rent(name, email);
            rentVect[roomPos] = rent;
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < QTY_ROOMS; i++) {
            if (rentVect[i] != null) {
                System.out.printf("%d: %s, %s\n", i, rentVect[i].getName(), rentVect[i].getEmail());
            }
        }

    }
}