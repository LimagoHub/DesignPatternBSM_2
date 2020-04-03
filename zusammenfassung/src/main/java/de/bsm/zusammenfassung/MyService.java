package de.bsm.zusammenfassung;

public class MyService {
	
	private final IDepedency depedency;

	public MyService(IDepedency depedency) {
		this.depedency = depedency;
	}
	
	public int f() {
		try {
			double x = 1 + 1;
			double y = 1 + 2;
			
			if( depedency.bar(x, y) >= 0)
				return -1;
			else
				return 1;
		} catch (Exception e) {
			throw new RuntimeException("Fehler in der Dependency", e);
		}
		
	}
	
	public void g() {
		
		try {
			String s = "Haus" + "boot";
			
			depedency.foo(s);
		} catch (RuntimeException e) {
			throw new RuntimeException("Fehler in der Dependency", e);
		}
		
	}

}
