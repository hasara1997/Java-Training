package chainofResponsibility;

import java.util.ArrayList;

public class Admin extends UserHandler{

	private ArrayList<String> priviledges = new ArrayList<>();

	@Override
	public ArrayList<String> applyPriviledge(User user) {
		
		priviledges.addAll(user.getPriviledgeList());
		priviledges.add("Manage Users");
		
		
		user.setPriviledgeList(priviledges);
		
		System.out.println("Add admin privilidges");
		
		return user.getPriviledgeList();
	}
}
