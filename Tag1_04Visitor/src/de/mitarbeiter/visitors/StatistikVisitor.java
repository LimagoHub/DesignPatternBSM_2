package de.mitarbeiter.visitors;

import de.mitarbeiter.Gehaltsempf�nger;
import de.mitarbeiter.Lohnempf�nger;

public class StatistikVisitor extends AbstractMitarbeiterVisitor {
	
	private int gehaltsempf�ngercounter = 0;
	private int lohnempf�ngercounter = 0;
	
	@Override
	public void init() {
		gehaltsempf�ngercounter = 0;
		lohnempf�ngercounter = 0;
	}
	
	@Override
	public void destroy() {
		System.out.println(this);
	}
	
	
	@Override
	public void visit(Gehaltsempf�nger gehaltsempf�nger) {
		gehaltsempf�ngercounter ++;
	}
	@Override
	public void visit(Lohnempf�nger lohnempf�nger) {
		lohnempf�ngercounter ++;
	}
	public int getGehaltsempf�ngercounter() {
		return gehaltsempf�ngercounter;
	}
	public int getLohnempf�ngercounter() {
		return lohnempf�ngercounter;
	}
	public int getTotal() {
		return lohnempf�ngercounter + gehaltsempf�ngercounter;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StatistikVisitor [gehaltsempf�ngercounter=");
		builder.append(gehaltsempf�ngercounter);
		builder.append(", lohnempf�ngercounter=");
		builder.append(lohnempf�ngercounter);
		builder.append(", getTotal()=");
		builder.append(getTotal());
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
