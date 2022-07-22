package chainofResponsibility;

import java.util.ArrayList;

public class Employee extends UserHandler{
	
	private ArrayList<String> priviledges = new ArrayList<>();

	@Override
	public ArrayList<String> applyPriviledge(User user) {
		
		priviledges.addAll(user.getPriviledgeList());
		priviledges.add("Manage Content");
		
		user.setPriviledgeList(priviledges);
		
		System.out.println("Add employee privilidges");
		
		if(user.getType().equals("Employee")) {
			return user.getPriviledgeList();
		}
		
		return successor.applyPriviledge(user);
	}

}
