package com.Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelectedFunction {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		driver.manage().window().maximize();
		System.out.println("Operation preforn this URL = "+driver.getCurrentUrl());
		
	//	String URL = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";
		Thread.sleep(500);
		WebElement button = driver.findElement(By.xpath("//input[@value='yellow']"));
		button.click();
		System.out.println("MY button is Selected = "+button.isSelected());
		Thread.sleep(2000);
		
		WebElement button1 = driver.findElement(By.xpath("//input[@value='purple']"));
		System.out.println("MY button is Not Selected = "+button1.isSelected());
		Thread.sleep(2000);
		WebElement button2 = driver.findElement(By.xpath("//input[@value='blue']"));
		button2.click();
		System.out.println("MY button is Not Selected = "+button2.isSelected());
		
		driver.close();
		
	}

}
