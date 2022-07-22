package Singleton;

public class Application {

	public static void main(String[] args) {
		DBInstance dbInstance =  DBInstance.getDBInstance();
		System.out.println(dbInstance);
		
		DBInstance dbInstance2 =  DBInstance.getDBInstance();
		System.out.println(dbInstance);
		
		
		

	}

}
