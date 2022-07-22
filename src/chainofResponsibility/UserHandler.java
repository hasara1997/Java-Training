package chainofResponsibility;

import java.util.ArrayList;

public abstract class UserHandler {
	
	//this is the successor, it says what is next
	protected UserHandler successor;
	
	public void setSuccessor(UserHandler successor) {
		this.successor = successor;
	}
	
	//This is the method used to handle the request
	public abstract ArrayList<String> applyPriviledge(User user);

}
