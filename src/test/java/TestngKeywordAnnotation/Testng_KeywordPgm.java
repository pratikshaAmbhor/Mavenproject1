package TestngKeywordAnnotation;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Testng_KeywordPgm {
	
	

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
	
	  System.out.println("Fail Test Cases");
	  Assert.assertTrue(false);
   }
	
	

}
