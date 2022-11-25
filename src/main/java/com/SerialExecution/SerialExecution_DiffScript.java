package com.SerialExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SerialExecution_DiffScript {

    // USING DIFFERT BROWSER and Differnt Sites
	@Test
   public void FistOne() throws InterruptedException {
		
		System.out.println("Test One1 = "+Thread.currentThread().getId());
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test
	   public void SecondTwo() throws InterruptedException {
			System.out.println("Test Two2 = "+Thread.currentThread().getId());
			
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		}
	
	
	
	
}
