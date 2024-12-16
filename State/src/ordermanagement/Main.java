package ordermanagement;

public class Main {
	
    public static void main(String[] args) {
        Order order = new Order("12345");

        System.out.println("Initial State: " + order.getState());
        
        order.pay();
        order.ship();
        order.complete();

        System.out.println("Final State: " + order.getState());

        // Test invalid transitions
        order.cancel();
    }
}
