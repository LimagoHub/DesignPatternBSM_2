package de.mitarbeiter.visitors;

import de.mitarbeiter.Gehaltsempfänger;
import de.mitarbeiter.Lohnempfänger;

public class PrintVisitor implements MitarbeiterVisitor {

	@Override
	public void visit(Gehaltsempfänger gehaltsempfänger) {
		System.out.println(gehaltsempfänger);

	}

	@Override
	public void visit(Lohnempfänger lohnempfänger) {
		System.out.println(lohnempfänger);

	}

}
