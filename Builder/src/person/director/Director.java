package person.director;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import person.Person;
import person.builder.PersonBuilder;

public class Director {
	
	private PersonBuilder builder;
	
	public Director(PersonBuilder builder) {
		this.builder = builder;
	}

	public Person buildPhysicaPerson() throws ParseException {
		this.builder.reset();
		this.builder.withName("João Silva");
		this.builder.withAdress("Rua das Flores, 123");
		this.builder.withCpf("123.456.789-00");
		this.builder.withBirthDate(new SimpleDateFormat("yyyy-mm-dd").parse("2000-12-15"));
		return this.builder.build();
	}

	public Person buildLegalPerson() {
		this.builder.reset();
		this.builder.withName("Empresa XYZ Ltda");
		this.builder.withAdress("Avenida Central, 456");
		this.builder.withCnpj("12.345.678/0001-99");
		this.builder.withCorporateReason("XYZ Comércio e Serviços");
		return this.builder.build();
	}
	
}
