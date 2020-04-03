package de.bsm.zusammenfassung;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class MyServiceTest {
	private static final int ANY_NEGATIVE_VALUE = -13;
	@Mock
	private IDepedency depedencyMock;
	@InjectMocks
	private MyService objectUnderTest;
	
	@Test
	public void f_test() {
		
		
		// Action
		objectUnderTest.f();
		
		// Assertion
		Mockito.verify(depedencyMock).bar(2.0, 3.0);
		
	}

	@Test
	public void f_test2() {
		
		// Arrange (Mock wird auf bestimmtes Verhalten programmiert)
		when(depedencyMock.bar(anyDouble(), anyDouble())).thenReturn(1000);
		
		// Action
		final int ergebnis = objectUnderTest.f();
		
		// Assertion
				
		assertEquals(-1, ergebnis);
		Mockito.verify(depedencyMock).bar(2.0, 3.0);  // Optional
		
	}


	@Test
	public void f_test3() {
		
		// Arrange (Mock wird auf bestimmtes Verhalten programmiert)
		when(depedencyMock.bar(anyDouble(), anyDouble())).thenReturn(ANY_NEGATIVE_VALUE);
		
		// Action
		final int ergebnis = objectUnderTest.f();
		
		// Assertion
				
		assertEquals(1, ergebnis);
		Mockito.verify(depedencyMock).bar(2.0, 3.0);  // Optional
		
	}

	@Test
	public void f_unexpectedRuntimeExceptionInUnderlyingService_throwsRuntimeException() {
		
		try {
			// Arrange (Mock wird auf bestimmtes Verhalten programmiert)
			when(depedencyMock.bar(anyDouble(), anyDouble())).thenThrow(new ArithmeticException());
			
			// Action
			final int ergebnis = objectUnderTest.f();
			fail("Upps");
		} catch (RuntimeException e) {
			assertEquals("Fehler in der Dependency", e.getMessage());
			assertTrue( e.getCause() instanceof ArithmeticException);
		}
		
		
		verify(depedencyMock, times(1)).bar(2.0, 3.0);  // Optional
		
	}


	@Test
	public void g_test1() {
		// Arrange
		doNothing().when(depedencyMock).foo(anyString()); // Optional
		
		// Action
		objectUnderTest.g();
		
		// Assertion
		verify(depedencyMock).foo("Hausboot");
	}
	
	@Test(expected = RuntimeException.class)
	public void g_test2() {
		// Arrange
		doThrow(new ArithmeticException()).when(depedencyMock).foo(anyString());
		
		// Action
		objectUnderTest.g();
		
	
	}
	
}
