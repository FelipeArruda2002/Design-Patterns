package converter.converters;

import converter.employees.Employee;

public class CSVConverter implements Converter {

	public String getEmployeeFormated(Employee emp) {
		return String.format("%s;%d;%.2f", 
				emp.getName(),
				emp.getAge(),
				emp.getSalary());
	}

}
