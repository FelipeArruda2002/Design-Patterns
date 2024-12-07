package stockmonitoring;

public class StockAlert implements Subscriber {

	@Override
	public void update(Product product) {
		if (product.getStock() < 20) {
			System.out.println("[Alerta] - Estoque do produto '" + product.getName() + "' está abaixo de 20 unidades!!");
		}
	}

}
