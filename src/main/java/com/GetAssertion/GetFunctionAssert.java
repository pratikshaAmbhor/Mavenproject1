package com.GetAssertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetFunctionAssert {

	@Test	
  public void TestCase1() {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com");
		driver.manage().window().maximize();
		System.out.println("Current URL = "+driver.getCurrentUrl());
		
		
		Assert.assertTrue(true);
		//Assert.assertTrue(false);
		driver.close();
			
	}
		

	

}
