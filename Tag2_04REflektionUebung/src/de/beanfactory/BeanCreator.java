package de.beanfactory;

import java.util.Scanner;

public class BeanCreator {
	
	// return null bei Fehler. Keine Exception
	
	private Scanner scanner = new Scanner(System.in);
	
	public Object createAndFillBean(String fullQualifiedClassName) {
		
		// erfüllt bean Konvention
		// alle Setter sind String
		// 1. Instanz erzeugen
		// 2. befüller der Felder über Setter
		
		//String eingabe = scanner.next();
		
		return null;
	}

}
