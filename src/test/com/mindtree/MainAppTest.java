package test.com.mindtree;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import main.com.mindtree.MainApp;

public class MainAppTest {

	@Test
	public void testGetNames() {
		MainApp mainApp=new MainApp();
		assertEquals("Niranjan", mainApp.getNames().get(1));
	}
}	
