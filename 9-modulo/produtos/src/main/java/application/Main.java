package application;

import entities.Product;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String name = "TV";
        double price = 900.00;
//        int quantity = 10;

        Product product = new Product(name, price);

        System.out.println("Product data: " + product);

        int addStock = 5;
        product.addProducts(addStock);
        System.out.println("Updated data: " + product);

        int removeStock = 3;
        product.removeProducts(removeStock);
        System.out.println("Updated data: " + product);
    }
}