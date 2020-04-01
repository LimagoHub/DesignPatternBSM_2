package de.composite.vistors;

import de.composite.Konto;
import de.composite.KontoGruppe;

public class SummenVisitor extends AbstractKontoVisitor {
	
	private double summe;

	@Override
	public void init() {
		summe = 0;

	}

	@Override
	public void destroy() {
		System.out.println(summe);

	}

	
	@Override
	public void visit(Konto konto) {
		summe += konto.getSaldo();

	}

}
