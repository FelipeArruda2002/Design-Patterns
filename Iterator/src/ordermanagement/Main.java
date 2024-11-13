package ordermanagement;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        OrderCollection orderCollection = new OrderCollection();

        orderCollection.addOrder(new Order("001", OrderStatus.PENDING_PAYMENT, LocalDate.of(2023, 9, 10)));
        orderCollection.addOrder(new Order("002", OrderStatus.PAID, LocalDate.of(2023, 9, 12)));
        orderCollection.addOrder(new Order("003", OrderStatus.SHIPPED, LocalDate.of(2023, 9, 15)));
        orderCollection.addOrder(new Order("004", OrderStatus.DELIVERED, LocalDate.of(2023, 9, 18)));
        orderCollection.addOrder(new Order("005", OrderStatus.PENDING_PAYMENT, LocalDate.of(2023, 10, 1)));

        // Teste as funcionalidades após implementar o padrão Iterator
    }
}

