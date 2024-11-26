package orderhistory;

import java.util.Stack;

public class OrderHistory {

	private Order order;
    private Stack<String> history;

    public OrderHistory(Order order) {
        this.order = order;
        history = new Stack<>();
    }

    // Método para salvar o estado do pedido
    public void saveState() {
        history.push(order.getOrderDetails());
    }

    // Método para desfazer (reverter para o estado anterior)
    public void undo() {
        if (!history.isEmpty()) {
            String previousState = history.pop();
            System.out.println("Undo: Restoring order to: " + previousState);
        } else {
            System.out.println("No previous state to undo.");
        }
    }

    // Método para refazer (não implementado corretamente, pois não usamos Memento)
    public void redo() {
        System.out.println("Redo functionality not implemented yet.");
    }
}
