package de.composite.vistors;

import de.composite.Konto;
import de.composite.KontoGruppe;

public interface BankVisitor {
	
	void init();
	void destroy();
	
	void visit(KontoGruppe kontoGruppe);
	void visit(Konto konto);
	
	

}
