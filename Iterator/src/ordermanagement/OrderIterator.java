package ordermanagement;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class OrderIterator implements Iterator<Order> {
    private OrderRepository orderRepository;
    private int position = 0;

    public OrderIterator(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public boolean hasNext() {
        return position < orderRepository.getOrders().size();
    }

    @Override
    public Order next() {
        return orderRepository.getOrders().get(position++);
    }

    // Métodos adicionais para filtragem
    public List<Order> getOrdersByStatus(OrderStatus status) {
        return orderRepository.getOrders().stream()
            .filter(order -> order.getStatus().equals(status))
            .collect(Collectors.toList());
    }

    public List<Order> getOrdersByDate(LocalDate date) {
        return orderRepository.getOrders().stream()
            .filter(order -> order.getOrderDate().equals(date))
            .collect(Collectors.toList());
    }

    public int getOrderCountByStatus(OrderStatus status) {
        return (int) orderRepository.getOrders().stream()
            .filter(order -> order.getStatus().equals(status))
            .count();
    }
}

