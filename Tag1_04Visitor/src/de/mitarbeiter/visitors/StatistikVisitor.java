package de.mitarbeiter.visitors;

import de.mitarbeiter.Gehaltsempfänger;
import de.mitarbeiter.Lohnempfänger;

public class StatistikVisitor extends AbstractMitarbeiterVisitor {
	
	private int gehaltsempfängercounter = 0;
	private int lohnempfängercounter = 0;
	
	@Override
	public void init() {
		gehaltsempfängercounter = 0;
		lohnempfängercounter = 0;
	}
	
	@Override
	public void destroy() {
		System.out.println(this);
	}
	
	
	@Override
	public void visit(Gehaltsempfänger gehaltsempfänger) {
		gehaltsempfängercounter ++;
	}
	@Override
	public void visit(Lohnempfänger lohnempfänger) {
		lohnempfängercounter ++;
	}
	public int getGehaltsempfängercounter() {
		return gehaltsempfängercounter;
	}
	public int getLohnempfängercounter() {
		return lohnempfängercounter;
	}
	public int getTotal() {
		return lohnempfängercounter + gehaltsempfängercounter;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StatistikVisitor [gehaltsempfängercounter=");
		builder.append(gehaltsempfängercounter);
		builder.append(", lohnempfängercounter=");
		builder.append(lohnempfängercounter);
		builder.append(", getTotal()=");
		builder.append(getTotal());
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
