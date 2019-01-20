package test.com.mindtree;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import main.com.mindtree.TestApp;

public class TestAppTest {

	@Test
	public void testGetNames1() {
		TestApp testApp=new TestApp();
		assertEquals(Arrays.asList("Niranjan", "Bhanu", "Vishwa"), testApp.getNames1());
	}
	
	@Test
	public void testGetNames2() {
		TestApp testApp=new TestApp();
		assertEquals(Arrays.asList("Niranjan", "Bhanu", "Vishwa"), testApp.getNames2());
	}
	
	@Test
	public void testGetNames3() {
		TestApp testApp=new TestApp();
		assertEquals(Arrays.asList("Niranjan", "Bhanu", "Vishwa"), testApp.getNames3());
	}
	
	@Test
	public void testGetNames4() {
		TestApp testApp=new TestApp();
		assertEquals(Arrays.asList("Niranjan", "Bhanu", "Vishwa"), testApp.getNames4());
	}
	
}	
