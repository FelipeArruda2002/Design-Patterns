package orderhistory;

public class Main {
 
	public static void main(String[] args) {
        // Criar um pedido
        Order order = new Order();

        // Gerenciador de histórico para o pedido
        OrderHistory orderHistory = new OrderHistory(order);

        // Adicionar itens ao pedido e salvar estados
        System.out.println("1. Adicionando itens ao pedido...");
        order.addItem("Notebook");
        order.addItem("Mouse");
        System.out.println("Estado atual: " + order.getOrderDetails());
        orderHistory.saveState();

        // Atualizar status do pedido e salvar estados
        System.out.println("\n2. Atualizando status...");
        order.updateStatus("Enviado");
        System.out.println("Estado atual: " + order.getOrderDetails());
        orderHistory.saveState();

        // Adicionar mais itens (sem salvar o estado)
        System.out.println("\n3. Adicionando mais itens (sem salvar o estado)...");
        order.addItem("Teclado");
        System.out.println("Estado atual: " + order.getOrderDetails());

        // Desfazer a última alteração
        System.out.println("\n4. Desfazendo a última alteração...");
        orderHistory.undo();
        System.out.println("Estado atual após desfazer: " + order.getOrderDetails());

        // Tentar refazer (não implementado)
        System.out.println("\n5. Tentando refazer...");
        orderHistory.redo();
    }
}