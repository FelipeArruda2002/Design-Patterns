package person;

import java.text.ParseException;
import java.util.Scanner;

import person.builder.PersonBuilderImpl;
import person.director.Director;

public class Client {
	
	public static void main(String[] args) throws ParseException {
		Director director = new Director(new PersonBuilderImpl());
		Person person;
		
		System.out.println("Which option do you want?\r\n"
				+ "(1) Register an individual\r\n"
				+ "(2) Legal entity registration");
		
		Scanner sc = new Scanner(System.in);
		int chosenOption = sc.nextInt();
		sc.close();
		
		switch(chosenOption) {
		case 1:
			person = director.buildPhysicaPerson();
			System.out.println(person.toString());
			break;
		case 2:
			person = director.buildLegalPerson();
			System.out.println(person.toString());
			break;
		default:
			break;
		}
	}

}
