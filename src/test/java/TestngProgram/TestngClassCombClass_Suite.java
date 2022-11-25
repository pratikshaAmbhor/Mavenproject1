package TestngProgram;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestngClassCombClass_Suite {
  @Test
  public void TestCase1() {
	  System.out.println("#First test cases#");
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("----------------------Before Suite output--------------------");
  }
  
  @Test
  public void TestCase2() {
	  System.out.println("##Second test cases##");
  }
  
  @AfterSuite
  public void AfterSuit() {
	  System.out.println("***************After Suit Output************************");  
  }
  
  @Test
  public void TestCase3() {
	  System.out.println("###Third test cases###");
  }
  
  @AfterSuite
  public void AfterSuit1() {
	  System.out.println("****************After Suit Output 1********************");  
  }
  
  @BeforeClass
  public void beforeClass1() {
	  System.out.println("+++++++++++++++++++Before Class 1+++++++++++++++++++++++++");
  }
  
  
  
  @BeforeSuite
  public void beforeSuites() {
	  System.out.println("----------------------Before suit annotation--------------------");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("++++++++++++++++++++Before Class+++++++++++++++++++++++++++++++");
  }
  
  @AfterClass
  public void AfterClass() {
	  System.out.println("++++++++++++++After class++++++++++++++++++");  
  }
  
  @AfterClass
  public void AfterClass1() {
	  System.out.println("++++++++++++++After class 1++++++++++++++++++");  
  }
  
  
  
  
}
