package de.main;

import de.firma.Firma;
import de.mitarbeiter.Gehaltsempfänger;
import de.mitarbeiter.Lohnempfänger;
import de.mitarbeiter.visitors.PrintVisitor;
import de.mitarbeiter.visitors.ResetArbeitszeitVisitor;
import de.mitarbeiter.visitors.StatistikVisitor;

public class Main {

	public static void main(String[] args) {
		Firma firma = new Firma();
		
		firma.add(new Gehaltsempfänger("Müller"));
		firma.add(new Gehaltsempfänger("Mayer"));
		firma.add(new Lohnempfänger("Hinz"));
		firma.add(new Lohnempfänger("Kunz"));
		firma.add(new Gehaltsempfänger("Schmidt"));
		
		//firma.print();
		
		firma.iterate(new PrintVisitor());
		

		firma.iterate(new StatistikVisitor());
		
		
		
		firma.iterate(new PrintVisitor());
	}

}
