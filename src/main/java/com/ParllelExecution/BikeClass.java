package com.ParllelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BikeClass {
	
	@Test
	   public void Firsttest() throws InterruptedException {
			
			System.out.println("TestCase1 = "+Thread.currentThread().getId());
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.myntra.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		}
	
	@Test
	   public void Firt1test2() throws InterruptedException {
			
			System.out.println("FirstClass1 test2 = "+Thread.currentThread().getId());
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		}
	
	
	

}
