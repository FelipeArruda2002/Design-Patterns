package person.builder;

import java.util.Date;

import person.Person;

public interface PersonBuilder {
	
	PersonBuilder withName(String name);
	PersonBuilder withAdress(String adress);
	PersonBuilder withBirthDate(Date birthDate);
	PersonBuilder withCpf(String cpf);
	PersonBuilder withCnpj(String cnpj);
	PersonBuilder withCorporateReason(String corporateReason);
	void reset();
	Person build();

}
