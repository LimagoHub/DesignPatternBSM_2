package de.main;

import de.composite.AbstractNode;
import de.composite.Leaf;
import de.composite.Node;

public class Main {

	public static void main(String[] args) {
		Node root = new Node("Root");
		
		Node e1_1 = new Node("E1_1");
		root.append(e1_1);
		
		Node e1_2 = new Node("E1_2");
		root.append(e1_2);
		
		Leaf e2_1 = new Leaf("E2_1");
		e1_1.append(e2_1);
		
		Node e2_2 = new Node("E2_2");
		e1_1.append(e2_2);
		
		Leaf e2_3 = new Leaf("E2_3");
		e1_2.append(e2_3);
		
		Node e2_4 = new Node("E2_4");
		e1_2.append(e2_4);
		
		travers(root);
		//e1_1.print();
		
	}
	
	public static void travers(AbstractNode node) { // Statt der travers, eine Printmethode im AbstractNode
		System.out.println(node);
		for (AbstractNode child : node.getChildren()) {
			travers(child);
		}
	}

}
