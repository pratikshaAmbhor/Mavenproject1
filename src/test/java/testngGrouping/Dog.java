package testngGrouping;

import org.testng.annotations.Test;

public class Dog {

	@Test(groups= {"Smock","Sanity"})
	public void One() {
		System.out.println("............1 test cases..................");
	}
	
	@Test(groups= {"Sanity","Regration","Retesting"})
	public void Two() {
		System.out.println("............2 test cases..................");
	}
	
	@Test(groups= {"Sanity","Regration"})
	public void Three() {
		System.out.println("............3 test cases..................");
	}
	
	@Test(groups= {"Regration","smock","Retesting"})
	public void Four() {
		System.out.println("............4 test cases..................");
	}
	@Test(groups= {"Sanity","Regration"})
	public void Five() {
		System.out.println("............5 test cases..................");
	}
	
	
	
}
