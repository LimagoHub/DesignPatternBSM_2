package de.bsm.personenservice.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import de.bsm.personenservice.persistence.Person;
import de.bsm.personenservice.persistence.PersonenRespository;


@RunWith(MockitoJUnitRunner.class)
public class PersonenServiceImplTest {
	@Mock
	private PersonenRespository repositoryMock;
	@InjectMocks
	private PersonenServiceImpl objectUnderTest;
	
	@Test
	public void speichern_wrongParameterNull_throwsPersonenServiceException() throws Exception {
		try {
			objectUnderTest.speichern(null);
			Assert.fail("Upps");
		} catch (PersonenServiceException e) {
			Assert.assertEquals("Parameter darf nicht null sein.", e.getMessage());
		}
	}

	@Test
	public void speichern_wrongVornameNull_throwsPersonenServiceException() throws Exception {
		try {
			Person person = new Person(null, "Doe");
			objectUnderTest.speichern(person);
			Assert.fail("Upps");
		} catch (PersonenServiceException e) {
			Assert.assertEquals("Vorname muss min. 2 Zeichen haben.", e.getMessage());
		}
	}

	@Test
	public void speichern_wrongVornameZuKurz_throwsPersonenServiceException() throws Exception {
		try {
			Person person = new Person("J", "Doe");
			objectUnderTest.speichern(person);
			Assert.fail("Upps");
		} catch (PersonenServiceException e) {
			Assert.assertEquals("Vorname muss min. 2 Zeichen haben.", e.getMessage());
		}
	}

}
