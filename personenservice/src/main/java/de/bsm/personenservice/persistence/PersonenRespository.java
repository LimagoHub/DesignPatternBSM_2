package de.bsm.personenservice.persistence;

import java.util.List;

public interface PersonenRespository {
	
	
	public void save(Person p);
	public void update(Person p);

	public void remove(Person p);
	Person findById(String id);
	List<Person> findAll();
}
