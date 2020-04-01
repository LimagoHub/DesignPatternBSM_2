package de.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.composite.vistors.BankVisitor;

public class KontoGruppe extends AbstractBankNode { // KontoGruppe ist container für KontoGruppen und Konten. Hat kein saldo
	
	private List<AbstractBankNode> children = new ArrayList<>();

	public KontoGruppe(String label) {
		super(label);
		
	}
	
	
	@Override
	public List<AbstractBankNode> getChildren() {
		return Collections.unmodifiableList(children);
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("KontoGruppe [getLabel()=");
		builder.append(getLabel());
		builder.append("]");
		return builder.toString();
	}


	public void append(AbstractBankNode node) {
		node.setParent(this);
		children.add(node);
	}
	
	public void remove(AbstractBankNode node) {
		node.setParent(null);
		children.remove(node);
	}
	
	@Override
	public void accept(BankVisitor visitor) {
		visitor.visit(this);
		
	}
}
