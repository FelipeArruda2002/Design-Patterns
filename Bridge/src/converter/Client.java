package converter;

import converter.converters.CSVConverter;
import converter.converters.Converter;
import converter.converters.JsonConverter;
import converter.employees.Employee;
import converter.employees.ITGuy;
import converter.employees.ProjectManager;

public class Client {

	public static void main(String[] args) {
		Converter jsonConverter = new JsonConverter();
		Converter csvConverter = new CSVConverter();
		
		Employee itGuy = new ITGuy("Felipe", 22, 10.000);
		Employee projectManager = new ProjectManager("Lucas", 24, 11.000);
		
		System.out.println(jsonConverter.getEmployeeFormated(itGuy));
		System.out.println(jsonConverter.getEmployeeFormated(projectManager));
		System.out.println(csvConverter.getEmployeeFormated(itGuy));
		System.out.println(csvConverter.getEmployeeFormated(projectManager));
	}

}
