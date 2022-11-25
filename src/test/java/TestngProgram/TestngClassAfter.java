package TestngProgram;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestngClassAfter {
  @Test
  public void TestCase1() {
	  System.out.println("First test cases");
  }
  
  @AfterSuite
  public void beforeSuite() {
	  System.out.println("My before suite annotations");
  }
  
  
  
  @Test
  public void TestCase2() {
	  System.out.println("Second test cases");
  }
  
  @AfterSuite
  public void TestCase3() {
	  System.out.println("Third test cases");  
  }
  @Test
  public void TestCase4() {
	  System.out.println("Forth test cases");
  }
}
