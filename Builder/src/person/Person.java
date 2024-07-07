package person;

import java.util.Date;

public class Person {

	private String name;
	private String address;

	private String cpf;
	private Date birthDate;
	private String cnpj;
	private String corporateReason;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCorporateReason() {
		return corporateReason;
	}

	public void setCorporateReason(String corporateReason) {
		this.corporateReason = corporateReason;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Name: " + this.name);
		sb.append("\n");
		sb.append("Adress: " + this.address);
		sb.append("\n");
		
		if (this.getCpf() != null) {
			sb.append("CPF: " + this.cpf);
			sb.append("\n");
		}
		
		if (this.getBirthDate() != null) {
			sb.append("Birth Date: " + this.birthDate);
			sb.append("\n");
		}
		
		if (this.getCnpj() != null) {
			sb.append("CNPJ: " + this.cnpj);
			sb.append("\n");
		}
		
		if (this.getCorporateReason() != null) {
			sb.append("Corporate Reason: " + this.corporateReason);
			sb.append("\n");
		}
		
		return sb.toString();
	}

}
