package de.mitarbeiter.visitors;

import de.mitarbeiter.Gehaltsempf�nger;
import de.mitarbeiter.Lohnempf�nger;

public abstract class AbstractMitarbeiterVisitor implements MitarbeiterVisitor {
	
	
	

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Gehaltsempf�nger gehaltsempf�nger) {
		// Ok

	}

	@Override
	public void visit(Lohnempf�nger lohnempf�nger) {
		// Ok
	}

}
