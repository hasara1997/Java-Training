package chainofResponsibility;

public class CORApplication {

	public static void main(String[] args) {
	
		Visitor visitor = new Visitor();
		Customer customer = new Customer();
		Employee employee = new Employee();
		Admin admin = new Admin();
		
		visitor.setSuccessor(customer);
		customer.setSuccessor(employee);
		employee.setSuccessor(admin);
		
		User user1 = new User("abc@gmail.com","eee");
		System.out.println("User priviledges are ---------->"+ visitor.applyPriviledge(user1));

	}

}
