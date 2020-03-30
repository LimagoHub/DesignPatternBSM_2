package de.firma;

import java.util.ArrayList;
import java.util.List;

import de.mitarbeiter.AbstractMitarbeiter;
import de.mitarbeiter.visitors.MitarbeiterVisitor;

public class Firma {
	
	private List<AbstractMitarbeiter> mitarbeiters = new ArrayList<>();

	public boolean add(AbstractMitarbeiter e) {
		return mitarbeiters.add(e);
	}

	public boolean remove(AbstractMitarbeiter o) {
		return mitarbeiters.remove(o);
	}
	
	public void print() {
		mitarbeiters.forEach(System.out::println);
	}
	
	public void iterate(MitarbeiterVisitor visitor) {
		
		visitor.init();
		for (AbstractMitarbeiter mitarbeiter : mitarbeiters) {
			//visitor.visit(mitarbeiter);
			mitarbeiter.accept(visitor);
		}
		visitor.destroy();
	}

}
