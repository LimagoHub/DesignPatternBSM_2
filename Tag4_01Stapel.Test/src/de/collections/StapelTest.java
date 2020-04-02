package de.collections;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StapelTest {
	
	
	private Stapel objectUnderTest;
	
	@Before
	public void setUp() {
		objectUnderTest = new Stapel();
	}

	@Test
	public void isEmpty_beiLeeremStapel_returnsTrue () {
		
		
		// Action
		boolean ergebnis = objectUnderTest.isEmpty();
		
		
		// Assertion
		assertTrue(ergebnis);
	}

	@Test
	public void isEmpty_beiNichtLeeremStapel_returnsFalse () throws Exception{
		// Arrange
		
		objectUnderTest.push(new Object());
		
		// Action
		boolean ergebnis = objectUnderTest.isEmpty();
		
		
		// Assertion
		assertFalse(ergebnis);
	}

	@Test
	public void isEmpty_beiWiederLeeremStapel_returnsTrue() throws Exception{
		// Arrange
		
		objectUnderTest.push(new Object());
		objectUnderTest.pop();
		
		// Action
		boolean ergebnis = objectUnderTest.isEmpty();
		
		
		// Assertion
		assertTrue(ergebnis);
	}

	@Test
	public void push_FillUptoLimit_noExceptionIsThrown() throws Exception{
		fillUpToLimit();
	
	}

	@Test(expected = StapelException.class)
	public void push_Overflow_throwsStapelException() throws Exception{
		fillUpToLimit();
	
		objectUnderTest.push(new Object());
	}

	@Test
	public void push_Overflow_throwsStapelException_version2() throws Exception{
		try {
			// Arrange
			fillUpToLimit();

			objectUnderTest.push(new Object());
			fail("StapelException wurde erwartet, hat aber nicht ausgelöst!");
			
		} catch (StapelException e) {
			assertEquals("Overflow", e.getMessage());
		}
	}

	private void fillUpToLimit() throws StapelException {
		for (int i = 0; i < 10; i++) {
			objectUnderTest.push(new Object());
		}
	}

}
