package de.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractBankNode {
	
	private String label;
	private AbstractBankNode parent = null;
	
	public AbstractBankNode(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public AbstractBankNode getParent() {
		return parent;
	}

	public void setParent(AbstractBankNode parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AbstractNode [label=");
		builder.append(label);
		builder.append(", parent=");
		builder.append(parent);
		builder.append("]");
		return builder.toString();
	}
	
	
	public List<AbstractBankNode> getChildren() {
		return Collections.emptyList();
	}
	
	public void print() {
//		System.out.println(this);
//		getChildren().forEach(child->child.print());
		
//		for(Iterator<AbstractBankNode> it = iterator(); it.hasNext();)
//			System.out.println(it.next());
		
		Iterator<AbstractBankNode> it = iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	
	public Iterator<AbstractBankNode> iterator() {
		List<AbstractBankNode> list = new ArrayList<>();
		iteratorImpl(list);
		return list.iterator();
	}
	
	private void iteratorImpl(List<AbstractBankNode> list) {
		list.add(this);
		for (AbstractBankNode child : getChildren()) {
			child.iteratorImpl(list);
		}
	}
}
