package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry{
	
	private Map<EmpType,Employee> emp = new HashMap<>();
	
	public Registry() {
		registerObj();
	}

	private void registerObj() {
		
		ContractEmp con = new ContractEmp();
		
		con.setId(2);
		con.setName("Kasun");
		con.setNumOfExp(5);
		con.setContractTimeInMonths(2);
		con.setSkills(new String[] {"java","C","C#"});
		
		PermenantEmp per = new PermenantEmp();
		
		per.setId(1);
		per.setName("Namal");
		per.setNumOfExp(5);
		per.setBenefits(true);
		per.setSkills(new String[] {"React","C","C#"});
		
		emp.put(EmpType.CONTRACT, con);
		emp.put(EmpType.PERMENANT, per);
		
		public Employee getEmployee(EmpType empType){
			Employee employee = null;
			
			try {
				employee = (Employee) emp.get(empType).clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			
			return employee;
			
		}
		
	}
}
