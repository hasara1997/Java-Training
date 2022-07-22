package builder;
import builder.Employee;

public class BuilderApplication {

	public static void main(String[] args) {
		
		Employee.Builder builder = new Employee.Builder("1"); 
		Employee employee1 = builder.build();
		System.out.println(employee1);
		
		Employee employee2 = new Employee.Builder("2").department("HR").build();
		System.out.println(employee2);

	}

}
