package com.GetAssertionPriority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetFuctionPriorityFacebook {
 
	WebDriver driver;
	@Test(priority=1)
	public void TestCase1() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		System.out.println("Current URL: "+driver.getCurrentUrl());
		System.out.println("Get Title: "+driver.getTitle());
		String documentText = "Facebook – log in or sign up";
		String pagetext = driver.getTitle();
		
		
	}
	@Test(priority=2)
	public void TestCase2() {
		System.out.println("Test case 2");
	}
	@Test(priority=3)
	public void TestCase3() {
		System.out.println("TestCase 3");
	}

}
