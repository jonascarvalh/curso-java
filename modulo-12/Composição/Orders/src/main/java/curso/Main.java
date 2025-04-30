package curso;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter birthDayFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Client data
        String name = "Alex Green";
        String email = "alex@gmail.com";
        String birthDate = "15/03/1985";

        Client client = new Client(name, email, LocalDate.parse(birthDate, birthDayFormat));

        // Order Data
        String status = "PROCESSING";

        Integer itemsOrder = 2;

        Order order = new Order();
        order.setStatus(OrderStatus.valueOf(status));
        order.setClient(client);

        for (int i = 0; i < itemsOrder; i++) {
            System.out.printf("Enter #%d item data:\n", (i+1));
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt(); sc.nextLine();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.setMoment(LocalDateTime.now());
            order.addItem(orderItem);
        }

        System.out.println(order);
    }
}