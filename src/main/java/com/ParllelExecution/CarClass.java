package com.ParllelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CarClass {

	@Test
	   public void Secondtest1() throws InterruptedException {
			System.out.println(" TestCase2 = "+Thread.currentThread().getId());
			
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.meesho.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		}
	
	@Test
	   public void Secondtest2() throws InterruptedException {
			System.out.println("Second Class &Test2 = "+Thread.currentThread().getId());
			
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.flipkart.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		}
	
	
	

	
	
	
}
