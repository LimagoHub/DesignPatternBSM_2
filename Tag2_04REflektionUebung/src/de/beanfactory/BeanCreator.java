package de.beanfactory;

import java.lang.reflect.Method;
import java.util.Scanner;

public class BeanCreator {
	
	private static final String PREFIX = "set";
	
	public Object createAndFillBean(String fullQualifiedClassName) {
		
		try (Scanner scanner = new Scanner(System.in)){
			Object object = Class.forName(fullQualifiedClassName).newInstance();
			
			for(Method method : object.getClass().getDeclaredMethods()) {
				if(method.getName().startsWith(PREFIX)) {
					System.out.printf("Bitte geben Sie einen Wert für %s ein\n", method.getName().substring(PREFIX.length()));
					method.invoke(object, scanner.nextLine());
				}
			}
			
			return object;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}

}
