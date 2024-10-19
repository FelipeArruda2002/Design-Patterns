package packaging;

public class Client {

	public static void main(String[] args) {
		  // Criando produtos
        Product product1 = new Product("Product 1", 100);
        Product product2 = new Product("Product 2", 200);
        
        // Criando caixas
        Box smallBox = new Box();
        smallBox.addItem(product1);

        Box largeBox = new Box();
        largeBox.addItem(product2);
        largeBox.addItem(smallBox);

        // Criando pedido
        Order order = new Order();
        order.addItem(largeBox);
        order.addItem(product1);

        // Calculando o preço total
        System.out.println("Preço total do pedido: " + order.calculateTotalPrice());
	}

}
