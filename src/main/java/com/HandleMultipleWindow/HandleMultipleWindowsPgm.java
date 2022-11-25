package com.HandleMultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleWindowsPgm {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window Window ID = "+parentWindow);
		
		//open parent window
		driver.findElement(By.id("//button[@id='newWindowBtn']")).click();
		Thread.sleep(2000);
		
		//open child window
 driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("JobbersCafe");
	     Set<String> allWindows = driver.getWindowHandles();
	     
	     for(String control:allWindows) {
	    	 System.out.println("My All Windows = "+ control);
	     }
		Thread.sleep(2000);
		//driver.close();
		//driver.quit();
		
	}
	

}
