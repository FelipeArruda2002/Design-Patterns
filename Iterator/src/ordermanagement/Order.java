package ordermanagement;

import java.time.LocalDate;

public class Order {
    private String id;
    private OrderStatus status;
    private LocalDate orderDate;

    public Order(String id, OrderStatus status, LocalDate orderDate) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
    }

    public String getId() {
        return id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
