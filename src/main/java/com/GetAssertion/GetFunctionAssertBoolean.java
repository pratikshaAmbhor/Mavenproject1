package com.GetAssertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetFunctionAssertBoolean {

	@Test	
  public void TestCase1() {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com");
		driver.manage().window().maximize();
			
		WebElement ele = driver.findElement(By.xpath("//h1[@class='Text__StyledText-oo0kvp-0 fpnFXu']"));
		System.out.println("meshoo Text Title = "+ele.getText());
		
		boolean value = ele.isDisplayed();
		Assert.assertTrue(value);
		
		driver.close();
			
	}
		

	

}
