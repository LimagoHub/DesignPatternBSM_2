package de.tiere;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Schwein implements Serializable, Cloneable{
	
	
	
	private String name;
	private int gewicht;
	
	public Schwein() {
		this("nobody");
	}
	
	public Schwein(String name) {
		setName(name);
		setGewicht(10);
	}

	public String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public int getGewicht() {
		return gewicht;
	}

	private void setGewicht(int gewicht) {
		
		this.gewicht = gewicht;
		
	}
	
	public void fressen() {
		setGewicht(getGewicht() + 1);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Schwein [name=");
		builder.append(name);
		builder.append(", gewicht=");
		builder.append(gewicht);
		builder.append("]");
		return builder.toString();
	}
	
	
	@Override
	public Schwein clone() {
		try {
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(byteArrayOutputStream);
			out.writeObject(this);
			out.close();
			
			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
			ObjectInputStream in = new ObjectInputStream(byteArrayInputStream);
			
			Schwein retval = (Schwein) in.readObject();
			
			in.close();
			return retval;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	public SchweineMemento getMemento() {
		return new MySchweineMemento(name, gewicht);
	}
	
	
	public void setMemento(SchweineMemento schweineMemento) {
		MySchweineMemento memento = (MySchweineMemento) schweineMemento;
		setName(memento.getName());
		setGewicht(memento.getGewicht());
	}
	
	private static class MySchweineMemento implements SchweineMemento{
		private final String name;
		private final int gewicht;
		
		public MySchweineMemento(String name, int gewicht) {
			super();
			this.name = name;
			this.gewicht = gewicht;
		}

		public String getName() {
			return name;
		}

		public int getGewicht() {
			return gewicht;
		}
		
	}

}
