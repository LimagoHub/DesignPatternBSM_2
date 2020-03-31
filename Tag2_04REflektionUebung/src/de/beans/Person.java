package de.beans;

import java.io.Serializable;

public class Person implements Serializable{
	
	private String vorname, nachname;
	
	public Person() {
		this("John","Doe");
	}

	public Person(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	
	

}
