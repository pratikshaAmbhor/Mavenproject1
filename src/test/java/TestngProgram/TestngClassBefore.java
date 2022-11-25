package TestngProgram;


import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestngClassBefore {
  @Test
  public void TestCase1() {
	  System.out.println("First test cases");
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("My before suite annotations");
  }
  
  
  
  @Test
  public void TestCase2() {
	  System.out.println("Second test cases");
  }
  
  @BeforeSuite
  public void TestCase3() {
	  System.out.println("Third test cases");  
  }
}
