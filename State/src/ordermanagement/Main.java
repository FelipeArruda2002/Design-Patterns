package ordermanagement;

public class Main {
	
    public static void main(String[] args) {
        Order order = new Order("12345");

        System.out.println("Initial State: " + order.getState().getName());
        
        order.pay();
        order.ship();
        order.complete();

        System.out.println("Final State: " + order.getState().getName());

        // Test invalid transitions
        order.cancel();
    }
}
