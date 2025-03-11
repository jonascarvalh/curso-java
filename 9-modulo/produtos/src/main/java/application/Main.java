package application;

import entities.Product;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String name = "TV";
        double price = 900.00;
        int quantity = 10;

        Product product = new Product(name, price, quantity);
        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());

        product.setPrice(1000.00);
        System.out.println("Updated price: " + product.getPrice());

        System.out.println("Product data: " + product);

        int addStock = 5;
        product.addProducts(addStock);
        System.out.println("Updated data: " + product);

        int removeStock = 3;
        product.removeProducts(removeStock);
        System.out.println("Updated data: " + product);
    }
}