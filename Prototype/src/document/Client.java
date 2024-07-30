package document;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		PrototypeRegistration registrar = PrototypeRegistration.getInstance();
		
		Contract contract = new Contract();
		contract.setName("Contrato 1");
		contract.setVisibility("Publico");
		contract.setFormat("PDF");
		
		registrar.addPrototype(contract);
		
		Contract contract2 = (Contract) registrar.getPrototype("PDF-" + "Publico");
		contract2.setName("Contrato 3");
		contract2.setVisibility("Privado");
		registrar.addPrototype(contract2);
		
		Contract contract3 = (Contract) registrar.getPrototype("PDF-" + "Privado");
		contract3.setName("Contrato III");
		
		System.out.println(contract);
		System.out.println(contract2);
		System.out.println(contract3);

	}

}
