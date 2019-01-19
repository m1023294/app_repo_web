package test.com.mindtree;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import main.com.mindtree.TestApp;

public class TestAppTest {

	@Test
	public void testGetNames() {
		TestApp testApp=new TestApp();
		assertEquals(Arrays.asList("Niranjan", "Bhanu", "Vishwa"), testApp.getNames());
	}
}	
