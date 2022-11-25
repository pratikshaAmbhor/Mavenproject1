package com.listeners;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

  @Listeners(ListenersClass1.class)

public class TestCases1 {
	
	@Test
	public void FirstTest() {
		System.out.println("***1 Test cases***");
	}

	@Test
	public void SceondTest() {
		System.out.println("***2 Test cases***");
		Assert.assertTrue(false);
	}

	@Test
	public void ThirdTest() {
		System.out.println("3 Test cases");
	}
	
	@Test
	public void FourthTest() {
		System.out.println("4 Test cases");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods ="SceondTest", alwaysRun = false )
	public void FifthTest() {
		System.out.println("5 Test cases");
		Assert.assertTrue(false);
	}

}
