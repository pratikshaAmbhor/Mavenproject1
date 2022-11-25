package com.HandleMultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleWindowParent_Child {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//open parent window
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String parentwindow = driver.getWindowHandle();
		System.out.println("URL Sites = "+driver.getCurrentUrl());
		System.out.println("parent window Window ID = "+parentwindow);
		
		//open chile window
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		
		//swich driver.swichto().window(nameOrHandle) 
		driver.switchTo().window(parentwindow);
		
		
		Set<String> allwindows = driver.getWindowHandles();
	 for(String control: allwindows) {
			
			System.out.println("My All Window = "+ control);
			
		 if(!control.equals(parentwindow)) {
			
			 System.out.println("Child Window Id: "+ control);
			
			driver.switchTo().window(control);
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Pratiksha");
		 }
	  }
		Thread.sleep(3000);
		driver.close();
		//driver.quite();
		
		
	}

}
