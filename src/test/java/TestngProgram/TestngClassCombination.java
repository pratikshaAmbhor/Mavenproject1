package TestngProgram;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestngClassCombination {
  @Test
  public void TestCase1() {
	  System.out.println("First test cases");
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("----------------------Before Test suite output--------------------");
  }
  
  @Test
  public void TestCase2() {
	  System.out.println("Second test cases");
  }
  
  @AfterSuite
  public void AfterSuit() {
	  System.out.println("***************After Suit o/p************************");  
  }
  
  @Test
  public void TestCase4() {
	  System.out.println("Forth test cases");
  }
  
  @AfterSuite
  public void AfterSuit1() {
	  System.out.println("****************After Suit 1 o/p********************");  
  }
  
  @BeforeSuite
  public void beforeSuites() {
	  System.out.println("----------------------Before suit annotation--------------------");
  }
  
}
