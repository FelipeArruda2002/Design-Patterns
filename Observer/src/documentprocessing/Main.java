package documentprocessing;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de documentos
        Document financialReport = new FinancialReport("Relatório Financeiro - Q3", "Em análise");
        Document meetingMinutes = new MeetingMinutes("Ata da Reunião do Conselho", "Em revisão");
        Document contract = new Contract("Contrato de Prestação de Serviços", "Pendente de assinatura");

        // Processando os documentos
        financialReport.process();
        System.out.println("Status do documento: " + financialReport.getTitle() + " -> " + financialReport.getStatus());

        meetingMinutes.process();
        System.out.println("Status do documento: " + meetingMinutes.getTitle() + " -> " + meetingMinutes.getStatus());

        contract.process();
        System.out.println("Status do documento: " + contract.getTitle() + " -> " + contract.getStatus());
    }
}
