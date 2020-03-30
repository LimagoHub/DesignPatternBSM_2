package de.mitarbeiter.visitors;

import de.mitarbeiter.Gehaltsempfänger;
import de.mitarbeiter.Lohnempfänger;

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
	public void visit(Gehaltsempfänger gehaltsempfänger) {
		// Ok

	}

	@Override
	public void visit(Lohnempfänger lohnempfänger) {
		// Ok
	}

}
