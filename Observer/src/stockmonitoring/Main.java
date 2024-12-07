package stockmonitoring;

public class Main {
    public static void main(String[] args) {
    	StockAlert alert = new StockAlert();
    	StockLogger logget = new StockLogger();
    	
        // Criando os produtos
        Product laptop = new Product("Laptop", 50);
        laptop.addSubscribers(logget, alert);
        
        Product smartphone = new Product("Smartphone", 30);
        smartphone.addSubscribers(logget, alert);

        // Atualizando o estoque
        laptop.updateStock(45);
        laptop.updateStock(10); // Deve disparar um alerta quando o padrão Observer for implementado

        smartphone.updateStock(25);
        smartphone.updateStock(5); // Deve disparar um alerta quando o padrão Observer for implementado
    }
}
