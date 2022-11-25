package com.SerialExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SerialExecution_Script {

// USING SAME BROWSER
	@Test
   public void testOne() throws InterruptedException {
		
		System.out.println("Test One1 = "+Thread.currentThread().getId());
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://selenium08.blogspot.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test
	   public void testTwo() throws InterruptedException {
			System.out.println("Test Two2 = "+Thread.currentThread().getId());
			
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.get("https://selenium08.blogspot.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		}
	
	
	
	
}
