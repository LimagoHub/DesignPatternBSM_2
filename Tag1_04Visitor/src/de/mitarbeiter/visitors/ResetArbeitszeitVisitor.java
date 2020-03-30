package de.mitarbeiter.visitors;

import de.mitarbeiter.Lohnempf�nger;

public class ResetArbeitszeitVisitor extends AbstractMitarbeiterVisitor {
	
	@Override
	public void visit(Lohnempf�nger lohnempf�nger) {
		lohnempf�nger.setArbeitszeit(0);
	}

}
