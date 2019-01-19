package test.com.mindtree;
import static org.JUnit.Assert.*;

import org.JUnit.Test;

import main.com.mindtree.TestApp;

public class TestAppTest {

	@Test
	public void testGetNames() {
		TestApp testApp=new TestApp();
		String firstName=testApp.getNames().get(0);
		assertEquals("Niranjan", firstName);
		String secondName=testApp.getNames().get(1);
		assertEquals("Bhanu", secondName);
	}
}	
