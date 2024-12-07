package stockmonitoring;

public class Main {
    public static void main(String[] args) {
        // Criando os produtos
        Product laptop = new Product("Laptop", 50);
        Product smartphone = new Product("Smartphone", 30);

        // Atualizando o estoque
        laptop.updateStock(45);
        laptop.updateStock(10); // Deve disparar um alerta quando o padrão Observer for implementado

        smartphone.updateStock(25);
        smartphone.updateStock(5); // Deve disparar um alerta quando o padrão Observer for implementado
    }
}
