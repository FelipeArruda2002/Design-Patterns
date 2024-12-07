package stockmonitoring;

public class Product extends Subject {
	private String name;
	private int stock;

	public Product(String name, int stock) {
		this.name = name;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public int getStock() {
		return stock;
	}

	public void updateStock(int newStock) {
		this.stock = newStock;
		notifySubscribers(this);
	}
}
