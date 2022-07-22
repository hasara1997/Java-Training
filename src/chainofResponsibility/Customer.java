package chainofResponsibility;

import java.util.ArrayList;

public class Customer extends UserHandler {
	
	private ArrayList<String> priviledges = new ArrayList<>();

	@Override
	public ArrayList<String> applyPriviledge(User user) {
		
		priviledges.addAll(user.getPriviledgeList());
		priviledges.add("Update Profile");
		priviledges.add("See Content");
		
		user.setPriviledgeList(priviledges);
		
		System.out.println("Add customer privilidges");
		
		if(user.getType().equals("Customer")) {
			return user.getPriviledgeList();
		}
		
		return successor.applyPriviledge(user);
	}

}
