package test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.mindtree.main.TestApp;

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
