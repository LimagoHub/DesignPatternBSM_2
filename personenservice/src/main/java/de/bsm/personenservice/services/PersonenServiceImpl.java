package de.bsm.personenservice.services;

import de.bsm.personenservice.persistence.Person;
import de.bsm.personenservice.persistence.PersonenRespository;

public class PersonenServiceImpl {
	
	private final PersonenRespository repository;
	
	
	
	public PersonenServiceImpl(PersonenRespository repository) {
		super();
		this.repository = repository;
	}



	// Bei allen Fehlern soll eine PersonenserviceException ausgelöst werden
	// parameter darf nicht null ok
	// vorname darf nicht null sein
	// vorname muss min 2 Zeichen haben
	// nachname darf nicht null sein
	// nachname muss min 2 Zeichen haben
	// Attila ist nicht erlaubt
	// speichern in Datenbank 
	
	public void speichern(Person person) throws PersonenServiceException {
		try {
			checkPerson(person);
			repository.save(person);
		} catch (RuntimeException e) {
			
			throw new PersonenServiceException("Der Datenbankdienst ist nicht bereit.", e);
		}
	}



	private void checkPerson(Person person) throws PersonenServiceException {
		validatatePerson(person);
		businessCheck(person);
	}



	private void businessCheck(Person person) throws PersonenServiceException {
		if(person.getVorname().equals("Attila")) throw new PersonenServiceException("Antipath");
	}



	private void validatatePerson(Person person) throws PersonenServiceException {
		if(person == null) throw new PersonenServiceException("Parameter darf nicht null sein.");
		if(person.getVorname()==null || person.getVorname().length() < 2) throw new PersonenServiceException("Vorname muss min. 2 Zeichen haben.");
		if(person.getNachname()==null || person.getNachname().length() < 2) throw new PersonenServiceException("Nachname muss min. 2 Zeichen haben.");
	}

}
