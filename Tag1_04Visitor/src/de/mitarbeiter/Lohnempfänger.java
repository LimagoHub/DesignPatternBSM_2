package de.mitarbeiter;

import de.mitarbeiter.visitors.MitarbeiterVisitor;

public class Lohnempf�nger extends AbstractMitarbeiter {

	
	private double stundenlohn=10.0, arbeitszeit = 40;
	public Lohnempf�nger() {
		// TODO Auto-generated constructor stub
	}

	public Lohnempf�nger(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public double getStundenlohn() {
		return stundenlohn;
	}

	public void setStundenlohn(double stundenlohn) {
		this.stundenlohn = stundenlohn;
	}

	public double getArbeitszeit() {
		return arbeitszeit;
	}

	public void setArbeitszeit(double arbeitszeit) {
		this.arbeitszeit = arbeitszeit;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lohnempf�nger [stundenlohn=");
		builder.append(stundenlohn);
		builder.append(", arbeitszeit=");
		builder.append(arbeitszeit);
		builder.append(", getName()=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	}

	
	@Override
	public void accept(MitarbeiterVisitor visitor) {
		visitor.visit(this);
		
	}
}
