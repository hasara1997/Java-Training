package chainofResponsibility;

import java.util.ArrayList;

public class User {
	
	private String email;
	private String password;
	private String type;
	private ArrayList<String> priviledgeList = new ArrayList<>();
	
	public User(String email, String password) {
		this.email = email;
		this.password = password;
		
		switch(password) {
		
		case "aaa":
			this.type = "Admin";
			break;
			
		case "eee":
			this.type = "Employee";
			break;
			
		case "ccc":
			this.type = "Customer";
			break;
			
		case "":
			this.type = "Visitor";
			break;
			
			default:
				System.out.println("Invalid User");
			}
		
	}
	
	public void setPriviledgeList(ArrayList<String> priviledgeList) {
		this.priviledgeList = priviledgeList;
	}
	
	public String getType() {
		return type;
	}
	
	public ArrayList<String> getPriviledgeList(){
		return priviledgeList;
	}

}
