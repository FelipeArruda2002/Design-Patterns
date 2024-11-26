package orderhistory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items;
    private String status;

    public Order() {
        items = new ArrayList<>();
        status = "Pendente";
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public String getOrderDetails() {
        return "Status: " + status + ", Items: " + items.toString();
    }

    // Método para salvar o estado do pedido (sem usar Memento)
    public OrderSnapshot save() {
        System.out.println("Saving current order: " + getOrderDetails());
        return new OrderSnapshot(items, status, LocalDate.now());
    }
    
    public void restore(OrderSnapshot orderSnapshot) {
    	this.items = orderSnapshot.getItems();
    	this.status = orderSnapshot.getStatus();
    }
}
