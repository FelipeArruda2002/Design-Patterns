package documentprocessing;

//FinancialReport.java
public class FinancialReport extends Document {
	
 public FinancialReport(String title, String status) {
     super(title, status);
 }

 @Override
 public void process() {
     System.out.println("Processing financial report: " + getTitle());
     // Simulação de processamento
     setStatus("Processed");
 }
}

