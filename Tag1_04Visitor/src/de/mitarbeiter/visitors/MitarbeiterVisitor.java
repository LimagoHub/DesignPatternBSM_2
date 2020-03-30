package de.mitarbeiter.visitors;

import de.mitarbeiter.Gehaltsempfänger;
import de.mitarbeiter.Lohnempfänger;

public interface MitarbeiterVisitor {
	void init();
	void destroy();
	void visit(Gehaltsempfänger gehaltsempfänger);
	void visit(Lohnempfänger lohnempfänger);

}
