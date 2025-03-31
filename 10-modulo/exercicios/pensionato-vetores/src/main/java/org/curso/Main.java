package org.curso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rooms will be rended? ");
        int qtyRooms = scanner.nextInt(); scanner.nextLine();

        int QTY_ROOMS = 9;

        String[] names  = new String[QTY_ROOMS];
        String[] emails = new String[QTY_ROOMS];

        for (int i = 0; i < qtyRooms; i++) {
            System.out.printf("Rent #%d: \n", i + 1);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int roomPos = scanner.nextInt(); scanner.nextLine();

            names[roomPos]  = name;
            emails[roomPos] = email;
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < QTY_ROOMS; i++) {
            if (names[i] != null) {
                System.out.printf("%d: %s, %s\n", i, names[i], emails[i]);
            }
        }

    }
}