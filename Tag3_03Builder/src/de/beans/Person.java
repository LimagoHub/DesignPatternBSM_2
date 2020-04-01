package de.beans;

public class Person {
	
	private String anrede="Frau", vorname="Erika", nachname="Mustermann", ort="Frankfurt", strasse="Zeil";
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Person(String anrede, String vorname, String nachname, String ort, String strasse) {
		super();
		this.anrede = anrede;
		this.vorname = vorname;
		this.nachname = nachname;
		this.ort = ort;
		this.strasse = strasse;
	}




	public String getAnrede() {
		return anrede;
	}

	public void setAnrede(String anrede) {
		this.anrede = anrede;
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

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	
	public static PersonBuilder builder() {
		return new PersonBuilder();
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [anrede=");
		builder.append(anrede);
		builder.append(", vorname=");
		builder.append(vorname);
		builder.append(", nachname=");
		builder.append(nachname);
		builder.append(", ort=");
		builder.append(ort);
		builder.append(", strasse=");
		builder.append(strasse);
		builder.append("]");
		return builder.toString();
	}



	public static class PersonBuilder {
		private final Person person = new Person();
		
		//String anrede, String vorname, String nachname, String ort, String strasse
		
		
		
		public PersonBuilder anrede(String anrede) {
			person.setAnrede(anrede);
			return this;
		}
		public PersonBuilder vorname(String vorname) {
			person.setVorname(vorname);
			return this;
		}
		public PersonBuilder nachname(String nachname) {
			person.setNachname(nachname);
			return this;
		}
		public PersonBuilder ort(String ort) {
			person.setOrt(ort);
			return this;
		}
		public PersonBuilder strasse(String strasse) {
			person.setStrasse(strasse);
			return this;
		}
		
		public Person build() {
			return person;
		}
	}

}
