package de.singleton;

public class MySingleton {
	
	// Eager
	private static final MySingleton instance  = new MySingleton();
	
	static {
		System.out.println("Statischer Konstruktor");
	}
	
	public synchronized static MySingleton getInstance() {
//		if(instance == null) { // Lazy
//			instance = new MySingleton();
//		}
		return instance;
	}


	private MySingleton() {
		
	}
	
	
	public void log(String message) {
		System.out.println(message);
	}

}
