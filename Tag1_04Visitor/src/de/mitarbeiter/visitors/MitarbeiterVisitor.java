package de.mitarbeiter.visitors;

import de.mitarbeiter.Gehaltsempf�nger;
import de.mitarbeiter.Lohnempf�nger;

public interface MitarbeiterVisitor {
	void init();
	void destroy();
	void visit(Gehaltsempf�nger gehaltsempf�nger);
	void visit(Lohnempf�nger lohnempf�nger);

}
