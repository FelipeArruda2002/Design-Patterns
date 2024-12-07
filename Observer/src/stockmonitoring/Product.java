package stockmonitoring;


public class Product {
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
        System.out.println("Estoque atualizado: " + name + " -> " + stock);
        // Lógica de notificação será implementada ao aplicar o padrão Observer
    }
}

