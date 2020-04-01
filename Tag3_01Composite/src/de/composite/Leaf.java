package de.composite;

public class Leaf extends AbstractNode { // Konto besteht label und saldo

	public Leaf(String label) {
		super(label);
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Leaf [getLabel()=");
		builder.append(getLabel());
		builder.append("]");
		return builder.toString();
	}
	
	

}
