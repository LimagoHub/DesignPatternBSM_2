package de.mitarbeiter;

import de.mitarbeiter.visitors.MitarbeiterVisitor;

public abstract class AbstractMitarbeiter {
	
	private String name;

	
	public AbstractMitarbeiter() {
		this("John");
	}
	public AbstractMitarbeiter(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AbstractMitarbeiter [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	public abstract void accept(MitarbeiterVisitor visitor);
	

}
