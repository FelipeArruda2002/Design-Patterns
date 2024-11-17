package ordermanagement;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        OrderRepository orderRepository = new OrderRepository();

        orderRepository.addOrder(new Order("001", OrderStatus.PENDING_PAYMENT, LocalDate.of(2023, 9, 10)));
        orderRepository.addOrder(new Order("002", OrderStatus.PAID, LocalDate.of(2023, 9, 12)));
        orderRepository.addOrder(new Order("003", OrderStatus.SHIPPED, LocalDate.of(2023, 9, 15)));
        orderRepository.addOrder(new Order("004", OrderStatus.DELIVERED, LocalDate.of(2023, 9, 18)));
        orderRepository.addOrder(new Order("005", OrderStatus.PENDING_PAYMENT, LocalDate.of(2023, 10, 1)));

        Iterator<Order> iterator = orderRepository.createIterator();

        System.out.println("Iterating through orders:");
        while (iterator.hasNext()) {
            Order order = iterator.next();
            System.out.println(order.getId() + " - " + order.getStatus());
        }

        OrderIterator orderIterator = (OrderIterator) iterator;
        System.out.println("\nOrders with status PENDING_PAYMENT:");
        orderIterator.getOrdersByStatus(OrderStatus.PENDING_PAYMENT).forEach(order -> System.out.println(order.getId()));

        System.out.println("\nOrder count with status PAID:");
        System.out.println(orderIterator.getOrderCountByStatus(OrderStatus.PAID));
    }
}


