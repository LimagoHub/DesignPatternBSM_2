package de.composite;

import de.composite.vistors.BankVisitor;

public class Konto extends AbstractBankNode { // Konto besteht label und saldo

	
	private double saldo = 100;
	
	
	
	public Konto(String label) {
		super(label);
		
	}
	
	

	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Konto [saldo=");
		builder.append(saldo);
		builder.append(", getLabel()=");
		builder.append(getLabel());
		builder.append("]");
		return builder.toString();
	}



	@Override
	public void accept(BankVisitor visitor) {
		visitor.visit(this);
		
	}



	
	
	

}
