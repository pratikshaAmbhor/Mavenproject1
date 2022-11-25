package TestngProgram;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class TestngAfterMethod {
	@Test
	public void TestCases() {
		System.out.println("Test Cases");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@@@@@@@@@@@@@@@=After Method=@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
	@Test
	public void TestCases1() {
		System.out.println("Test Cases 2");
	}

	@Test
	public void TestCases3() {
		System.out.println("Test Cases 3");
	}

	@AfterMethod
	public void afterMethod1() {
		System.out.println("@@@@@@@@@@@@@@@==After Method 1==@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

	@Test
	public void TestCases4() {
		System.out.println("Test Cases 4");
		
	}
}
