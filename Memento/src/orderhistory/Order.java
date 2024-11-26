package orderhistory;

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
    public void save() {
        // Implemente a lógica de salvar o estado do pedido, mas sem usar o padrão Memento
        System.out.println("Saving current order: " + getOrderDetails());
    }
}
