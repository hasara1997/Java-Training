package builder;


public class Employee {

	private final String id;
	private final String name;
	private final String department;
	
	public Employee(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.department = builder.department;
	}
	
	static class Builder {
		
		//same properties
		private String id;
		private String name;
		private String department;
		
		//build() method
		public Employee build() {
			return new Employee(this);
		}
		
		public Builder(String id) {
			this.id = id;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
			
		}
		
		public Builder department(String department) {
			this.department = department;
			return this;
			
		}
	}
	
	public String toString() {
		return " Employee [id=" + id +", name=" + name +", department=" + department + "] ";
	}
	
}
