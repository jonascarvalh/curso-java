package entities;

import entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private static DateTimeFormatter momentFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static DateTimeFormatter birthDayFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDateTime moment;
    private OrderStatus status;
    private List<OrderItem> ordersItems = new ArrayList<>();
    private Client client;

    public Order() {
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        ordersItems.add(item);
    }

    public void removeItem(OrderItem item) {
        ordersItems.remove(item);
    }

    public Double total() {
        Double sum = 0.0;
        for (OrderItem orderItem : ordersItems) {
            sum += orderItem.subTotal();
        }

        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: " + moment.format(momentFormat) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client.getName() + " (" + client.getBirthDate().format(birthDayFormat) + ")" + " - " + getClient().getEmail() + "\n");

        sb.append("Order items: \n");
        for (OrderItem orderItem : ordersItems) {
            sb.append(orderItem.getProduct().getName());
            sb.append(", $" + String.format("%.2f", orderItem.getPrice()));
            sb.append(", Quantity: " + orderItem.getQuantity());
            sb.append(", Subtotal: $ " + String.format("%.2f", orderItem.subTotal()) + "\n");
        }
        sb.append("Total price: $ " + String.format("%.2f", this.total()));
        return sb.toString();
    }
}
