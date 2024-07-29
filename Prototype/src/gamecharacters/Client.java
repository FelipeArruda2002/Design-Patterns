package gamecharacters;

public class Client {

	public static void main(String[] args) {
		Mage mage = new Mage();
		mage.setName("R10 do Barcelona");
		mage.setLevel("1");
		
		Mage mage2 = (Mage) mage.clonar();
		mage2.setName("R10 aposentado");
		
		System.out.println(mage);
		System.out.println(mage2);
	}
}
