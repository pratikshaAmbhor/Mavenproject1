package TestngKeywordAnnotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Testng_Keyword {
	
	@BeforeSuite()
	public void BeforeSuit() {
		System.out.println("My before annotation");
	}

	@AfterSuite
	public void AfterSuit() {
		System.out.println("My After annotation");
	}

  @Test
  public void TestCase1() {
	
	System.out.println("First Test Cases");  
  }
  
  @Test
  public void TestCase2() {
	
	System.out.println("Second Test Cases");  
  }
	
  @Test
  public void TestCase3() {
	
	  System.out.println("Third Test Cases");
   }
	
	

}
