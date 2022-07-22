package prototype;

public class EmpApplication {

	public static void main(String[] args) {
		
		Registry reg = new Registry();
		
		ContractEmp e1 = (ContractEmp) reg.getEmployee(EmpType.CONTRACT);
		System.out.println("e1 ID ----> "+e1.getId());
		
		ContractEmp e2 = (ContractEmp) reg.getEmployee(EmpType.CONTRACT);
		System.out.println("e1 ID ----> "+e2.getId());
		
		e2.setId(5);
		
		System.out.println("\n\nAfter changing the e2 id value");
		
		System.out.println("e1 ID ----> "+e1.getId());
		System.out.println("e1 ID ----> "+e2.getId());

	}

}
