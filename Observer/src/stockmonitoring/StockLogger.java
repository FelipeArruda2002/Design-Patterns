package stockmonitoring;

public class StockLogger implements Subscriber {

	@Override
	public void update(Product product) {
		System.out.println("Estoque atualizado: " + product.getName() + " -> " + product.getStock());
	}

}
