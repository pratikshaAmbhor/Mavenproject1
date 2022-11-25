package com.ParllelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelClass {
	
	@Test
	   public void test1()  {
			
			System.out.println("Test1 = "+Thread.currentThread().getId());
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://selenium08.blogspot.com");
			driver.manage().window().maximize();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				System.out.println("Handling code"+e);
			}
			System.out.println("Parllel Execution class End");
			driver.close();
		}
	
	
	
	
	
	

}
