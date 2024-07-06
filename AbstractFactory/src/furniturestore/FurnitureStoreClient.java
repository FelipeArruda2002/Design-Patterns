package furniturestore;

import java.util.Scanner;

import furniturestore.abs.factory.FurnitureFactory;
import furniturestore.abs.product.Chair;
import furniturestore.abs.product.CoffeTable;
import furniturestore.abs.product.Sofa;
import furniturestore.concrete.factory.ArtDecoFactory;
import furniturestore.concrete.factory.ModernFactory;
import furniturestore.concrete.factory.VictorianFactory;

public class FurnitureStoreClient {
	
	public static void main(String[] args) {
		FurnitureFactory abstractFactory = null;
		Chair chair;
		CoffeTable coffeTable;
		Sofa sofa;
		
		System.out.println("What style of furniture do you want to purchase? \r\n"
				+ "(1) ArtDeco\r\n"
				+ "(2) Modern\r\n"
				+ "(3) Victorian");
		
		Scanner sc = new Scanner(System.in);
		
		int chosenOption = sc.nextInt();
		switch(chosenOption) {
		case 1:
			abstractFactory = new ArtDecoFactory();
			break;
		case 2:
			abstractFactory = new ModernFactory();
			break;
		case 3:
			abstractFactory = new VictorianFactory();
			break;
		default:
			break;
		}
		sc.close();
		
		chair = abstractFactory.createChair();
		coffeTable = abstractFactory.createCoffeTable();
		sofa = abstractFactory.createSofa();
		
		System.out.println("Does the chair have legs? " + chair.hasLegs());
		chair.sitOn();
		
		System.out.println("Does the sofa have legs? " + sofa.hasLegs());
		sofa.sitOn();
		
		System.out.println("What is the width and length of the coffee table? " + coffeTable.getWidth() + " wide by " + coffeTable.getLength() + " long");
		
		
	}

}
