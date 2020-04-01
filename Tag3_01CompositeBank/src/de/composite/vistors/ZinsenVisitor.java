package de.composite.vistors;

import de.composite.Konto;

public class ZinsenVisitor extends AbstractKontoVisitor {
	
	private final double zinssatz;
	
	
	
	public ZinsenVisitor(double zinssatz) {
		super();
		this.zinssatz = zinssatz;
	}



	@Override
	public void visit(Konto konto) {
		konto.setSaldo(konto.getSaldo() * (1+zinssatz));
	}

}
