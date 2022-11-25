package TestngKeywordAnnotation;

import org.testng.annotations.Test;

public class KeyWord_TestClass {
	
	
/*	@Test(invocationCount=4)// Repete test case will use
	public void TestCase1() {
	 System.out.println("First");	
	} */
	
	@Test(priority=1)
	public void TestCase2() {
	 System.out.println("Second");	
	}
	
	@Test
	public void TestCase3() {
	 System.out.println("Third");	
	}
	
	@Test(priority=-1)
	public void TestCase4() {
	 System.out.println("Fourth");	
	}

}
