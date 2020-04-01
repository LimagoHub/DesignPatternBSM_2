package de.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node extends AbstractNode { // KontoGruppe ist container für KontoGruppen und Konten. Hat kein saldo
	
	private List<AbstractNode> children = new ArrayList<>();

	public Node(String label) {
		super(label);
		
	}
	
	
	@Override
	public List<AbstractNode> getChildren() {
		return Collections.unmodifiableList(children);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Node [getLabel()=");
		builder.append(getLabel());
		builder.append("]");
		return builder.toString();
	}

	public void append(AbstractNode node) {
		node.setParent(this);
		children.add(node);
	}
	
	public void remove(AbstractNode node) {
		node.setParent(null);
		children.remove(node);
	}
	
	
}
