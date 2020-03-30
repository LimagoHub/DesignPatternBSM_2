package de.main;

import de.firma.Firma;
import de.mitarbeiter.Gehaltsempf�nger;
import de.mitarbeiter.Lohnempf�nger;
import de.mitarbeiter.visitors.PrintVisitor;
import de.mitarbeiter.visitors.ResetArbeitszeitVisitor;
import de.mitarbeiter.visitors.StatistikVisitor;

public class Main {

	public static void main(String[] args) {
		Firma firma = new Firma();
		
		firma.add(new Gehaltsempf�nger("M�ller"));
		firma.add(new Gehaltsempf�nger("Mayer"));
		firma.add(new Lohnempf�nger("Hinz"));
		firma.add(new Lohnempf�nger("Kunz"));
		firma.add(new Gehaltsempf�nger("Schmidt"));
		
		//firma.print();
		
		firma.iterate(new PrintVisitor());
		

		firma.iterate(new StatistikVisitor());
		
		
		
		firma.iterate(new PrintVisitor());
	}

}
