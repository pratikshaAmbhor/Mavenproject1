package com.HndleAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlertsGuru2 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com");
		driver.manage().window().maximize();
		
		
	//	driver.findElement(By.xpath("//input[@name='emailid']")).click();
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Alert alert = driver.switchTo().alert();
		//alert.sendKeys("pratiksha");
		alert.accept();
		System.out.println("Complete My Action2");
		
		driver.findElement(By.xpath("//input[@name='emailid']")).click();
		Thread.sleep(1000);
		
		
		
		
		
		driver.close();
	}

}
