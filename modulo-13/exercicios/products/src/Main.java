import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt(); sc.nextLine();

        List<Product> products = validateAndSaveProducts(n, sc, dateFormat);
        showProducts(products);
    }

    private static void showProducts(List<Product> products) {
        System.out.println("PRICE TAGS");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }
    }

    private static List<Product> validateAndSaveProducts(int n, Scanner sc, SimpleDateFormat dateFormat) throws ParseException {
        List<Product> products = new ArrayList<Product>();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0); sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble(); sc.nextLine();

            switch (ch) {
                case 'c':
                    products.add(new Product(name, price));
                    break;
                case 'i':
                    System.out.print("Customs fee: ");
                    double fee = sc.nextDouble();
                    products.add(new ImportedProduct(name, price, fee));
                    break;
                case 'u':
                    System.out.print("Manufacture Date (DD/MM/YYYY): ");
                    String manufactureDate = sc.nextLine();
                    Date date = dateFormat.parse(manufactureDate);
                    products.add(new UsedProduct(name, price, date));
                    break;
                default:
                    System.out.print("Unknown choice: " + ch);
                    break;
            }

        }
        return products;
    }
}