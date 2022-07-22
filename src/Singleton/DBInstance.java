package Singleton;

public class DBInstance {
	
	private static volatile DBInstance dbInstance;
	
	private DBInstance() {
		if(dbInstance != null) {
			throw new RuntimeException("Please use getDBInstance method");
		}
	}
	
	public static DBInstance getDBInstance() {
		if(dbInstance == null) {
			synchronized (DBInstance.class) {
				if(dbInstance == null) {
					dbInstance = new DBInstance();
				}
			}
		}
		return dbInstance;
	}
		
//	public static DBInstance getDBInstance() {
//		if (dbInstance == null) {
//			synchronized (DBInstance.class) {
//				if(dbInstance == null) {
//				dbInstance = new DBInstance();
//				}
//			}
//		}
//		return dbInstance;
//	}
//	}

}
