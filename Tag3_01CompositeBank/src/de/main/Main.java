package de.main;

import de.composite.AbstractBankNode;
import de.composite.Konto;
import de.composite.KontoGruppe;

public class Main {

	public static void main(String[] args) {
		KontoGruppe root = new KontoGruppe("Root");
		
		KontoGruppe e1_1 = new KontoGruppe("E1_1");
		root.append(e1_1);
		
		KontoGruppe e1_2 = new KontoGruppe("E1_2");
		root.append(e1_2);
		
		Konto e2_1 = new Konto("E2_1");
		e1_1.append(e2_1);
		
		KontoGruppe e2_2 = new KontoGruppe("E2_2");
		e1_1.append(e2_2);
		
		Konto e2_3 = new Konto("E2_3");
		e1_2.append(e2_3);
		
		KontoGruppe e2_4 = new KontoGruppe("E2_4");
		e1_2.append(e2_4);
		
		
		//root.print();

		root.iterate(new PrintVisitor());
	}
	
	

}
