package documentprocessing;

public class Main {
    public static void main(String[] args) {
        AuditSystem auditSystem = new AuditSystem();
        NotificationSystem notificationSystem = new NotificationSystem();
    	
    	// Criando instâncias de documentos
        Document financialReport = new FinancialReport("Relatório Financeiro - Q3", "Em análise");
        
        Document meetingMinutes = new MeetingMinutes("Ata da Reunião do Conselho", "Em revisão");
        meetingMinutes.addSubscriber(notificationSystem);
        
        Document contract = new Contract("Contrato de Prestação de Serviços", "Pendente de assinatura");
        contract.addSubscriber(auditSystem);
        // Processando os documentos
        financialReport.process();
        System.out.println("Status do documento: " + financialReport.getTitle() + " -> " + financialReport.getStatus());

        meetingMinutes.process();

        contract.process();
    }
}
