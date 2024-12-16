package ordermanagement;

public class Order {
    private String orderId;
    private String state;

    public Order(String orderId) {
        this.orderId = orderId;
        this.state = "Created"; // Estado inicial
    }

    public String getOrderId() {
        return orderId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void pay() {
        if ("Created".equals(state)) {
            setState("Paid");
            System.out.println("Order " + orderId + " has been paid.");
        } else {
            System.out.println("Cannot pay order in state: " + state);
        }
    }

    public void cancel() {
        if ("Created".equals(state) || "Paid".equals(state)) {
            setState("Cancelled");
            System.out.println("Order " + orderId + " has been cancelled.");
        } else {
            System.out.println("Cannot cancel order in state: " + state);
        }
    }

    public void ship() {
        if ("Paid".equals(state)) {
            setState("Shipped");
            System.out.println("Order " + orderId + " has been shipped.");
        } else {
            System.out.println("Cannot ship order in state: " + state);
        }
    }

    public void complete() {
        if ("Shipped".equals(state)) {
            setState("Completed");
            System.out.println("Order " + orderId + " has been completed.");
        } else {
            System.out.println("Cannot complete order in state: " + state);
        }
    }
}
