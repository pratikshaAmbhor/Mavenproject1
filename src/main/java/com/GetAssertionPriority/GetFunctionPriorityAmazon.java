package com.GetAssertionPriority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class GetFunctionPriorityAmazon {
	
	WebDriver driver;
    @Test(priority=1)
   public void Test() {
		
		//System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\PHOTON\\\\\\\\ChromeDriver\\\\\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.com/");
	
		String ActualTital=driver.getTitle();
		System.out.println("Actual Tital = "+ActualTital);
		
		String ExpectedTital="Amazon.com. Spend less. Smile more.";
		Assert.assertEquals(ActualTital, ExpectedTital);
	}
    @Test(priority=2)
    public void visible() {
    	driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
    	}
    @Test(priority=3)
    public void enable() {
		driver.findElement(By.id("twotabsearchtextbox")).isEnabled();
		driver.close();
		
	}
	

}
