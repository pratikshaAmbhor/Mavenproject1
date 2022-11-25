package TestngProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class TestNGBeforeMethod {
	@Test
	public void testCase() {
		System.out.println("test case");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("................Before Method.................");
	}
	
	@BeforeMethod
	public void beforeMethod1() {
		System.out.println("^^^^^^^^^^^^^Before Method1 output^^^^^^^^^^^^^^^");
	}

	
	@Test
	public void testCase2() {
		System.out.println("test case 2");
	}
	
	@Test
	public void testCase3() {
		System.out.println("test case 3");
	}

}
