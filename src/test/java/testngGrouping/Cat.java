package testngGrouping;

import org.testng.annotations.Test;

public class Cat {
	
	@Test(groups= {"Smock","Sanity","Regration"})
	public void First() {
		System.out.println("............First test cases..................");
	}
	
	@Test(groups= {"Sanity","Regration"})
	public void Second() {
		System.out.println("............Second test cases..................");
	}
	
	
	@Test(groups= {"Sanity","Smock"})
	public void Third() {
		System.out.println("............Third test cases..................");
	}
	
	@Test(groups= {"Sanity","Regration","Retesting"})
	public void Fourth() {
		System.out.println("............Fourth test cases..................");
	}
	@Test(groups= {"Sanity"})
	public void Fifth() {
		System.out.println("............Fifth test cases..................");
	}
}
