package person.builder;

import java.util.Date;

import person.Person;

public class PersonBuilderImpl implements PersonBuilder {

	private Person person;
	
	@Override
	public void reset() {
		this.person = new Person();
	}
	
	@Override
	public PersonBuilder withName(String name) {
		this.person.setName(name);
		return this;
	}

	@Override
	public PersonBuilder withAdress(String adress) {
		this.person.setAddress(adress);
		return this;
	}

	@Override
	public PersonBuilder withBirthDate(Date birthDate) {
		this.person.setBirthDate(birthDate);
		return this;
	}

	@Override
	public PersonBuilder withCpf(String cpf) {
		this.person.setCpf(cpf);
		return this;
	}

	@Override
	public PersonBuilder withCnpj(String cnpj) {
		this.person.setCnpj(cnpj);
		return this;
	}

	@Override
	public PersonBuilder withCorporateReason(String corporateReason) {
		this.person.setCorporateReason(corporateReason);
		return this;
	}
	
	@Override
	public Person build() {
		return this.person;
	}
	
}
