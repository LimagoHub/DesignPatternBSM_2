package de.bsm.personenservice.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import de.bsm.personenservice.persistence.Person;
import de.bsm.personenservice.persistence.PersonenRespository;
import static org.mockito.Mockito.*;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class PersonenServiceImplTest {
	@Mock
	private PersonenRespository repositoryMock;
	@Mock
	private List<String> antipathenMock;
	
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

	@Test
	public void speichern_wrongNachnameNull_throwsPersonenServiceException() throws Exception {
		try {
			Person person = new Person("John", null);
			objectUnderTest.speichern(person);
			Assert.fail("Upps");
		} catch (PersonenServiceException e) {
			Assert.assertEquals("Nachname muss min. 2 Zeichen haben.", e.getMessage());
		}
	}

	@Test
	public void speichern_wrongNachnameZuKurz_throwsPersonenServiceException() throws Exception {
		try {
			Person person = new Person("John", "D");
			objectUnderTest.speichern(person);
			Assert.fail("Upps");
		} catch (PersonenServiceException e) {
			Assert.assertEquals("Nachname muss min. 2 Zeichen haben.", e.getMessage());
		} 
	}
 
	@Test
	public void speichern_wrongVorname_throwsPersonenServiceException() throws Exception {
		try {
			// Arrange
			when(antipathenMock.contains(anyString())).thenReturn(true);
			
			Person person = new Person("John", "Doe");
			
			// Action
			objectUnderTest.speichern(person);
			
			
			
			Assert.fail("Upps");
		} catch (PersonenServiceException e) {
			Assert.assertEquals("Antipath", e.getMessage());
			
		}
		verify(antipathenMock,times(1)).contains("John");
	}

	@Test
	public void speichern_RuntimeExceptionInUnderlyingService_throwsPersonenServiceException() throws Exception {
		try {
			
			
			// Wenn eine Methode den Rückgabewert "void" hat und eine Exception simuliert werden soll
			doThrow(new ArrayIndexOutOfBoundsException()).when(repositoryMock).save((Person) anyObject());
			
			// Methode nicht "void" ist und eine Exception simuliert werden soll
			when(antipathenMock.contains(anyString())).thenReturn(false);
			
			Person person = new Person("John", "Doe");
			objectUnderTest.speichern(person);
			Assert.fail("Upps");
		} catch (PersonenServiceException e) {
			Assert.assertEquals("Der Datenbankdienst ist nicht bereit.", e.getMessage());
		}
	}

	@Test
	public void speichern_HappyDay_PersonIsSaved() throws Exception {
		
			when(antipathenMock.contains(anyString())).thenReturn(false);
					
			Person person = new Person("John", "Doe");
			objectUnderTest.speichern(person);
			verify(repositoryMock).save(person);
	}

}
