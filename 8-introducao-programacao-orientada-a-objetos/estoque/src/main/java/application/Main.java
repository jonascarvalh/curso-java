package application;

import entities.Product;

public class Main {
    public static void main(String[] args) {

        String name = "TV";
        double price = 900.00;
        int quantity = 10;

        Product product = new Product();
        product.name = name;
        product.price = price;
        product.quantity = quantity;

        int addStock = 5;
        product.addProducts(addStock);
        System.out.println("Product data: " + product.name + ", $ " + product.price + ", " + product.quantity + " units, Total: $ " + product.totalValueInStock());

        int removeStock = 3;
        product.removeProducts(removeStock);
        System.out.println("Product data: " + product.name + ", $ " + product.price + ", " + product.quantity + " units, Total: $ " + product.totalValueInStock());

    }
}