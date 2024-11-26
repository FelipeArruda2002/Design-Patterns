package orderhistory;

import java.util.Stack;

public class OrderHistory {

    private Stack<OrderSnapshot> undoStack;
    private Stack<OrderSnapshot> redoStack;

    public OrderHistory() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    // Método para salvar o estado do pedido
    public void saveState(Order order) {
        undoStack.push(order.save());
        redoStack.clear();
    }

    // Método para desfazer (reverter para o estado anterior)
    public void undo(Order order) {
        if (!undoStack.isEmpty()) {
            OrderSnapshot snapshot = undoStack.pop();
            redoStack.add(snapshot);
            order.restore(snapshot);
            System.out.println("Undo: Restoring order to: " + snapshot.getSnapshotDetails());
        } else {
            System.out.println("No previous state to undo.");
        }
    }
    // Método para refazer (não implementado corretamente, pois não usamos Memento)
    public void redo(Order order) {
        if (!redoStack.isEmpty()) {
        	OrderSnapshot snapshot = redoStack.pop();
            order.restore(snapshot); 
        	System.out.println("Redo: Restoring order to: " + snapshot.getSnapshotDetails());
        } else {
        	System.out.println("No previous state to redo.");
        }
    }
}
