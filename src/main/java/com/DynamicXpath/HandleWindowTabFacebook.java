package com.DynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindowTabFacebook {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		String variable = "Log in";
	// Xpath
	//	driver.findElement(By.xpath("//button[@name='login']")).click();
	//	driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		//Dynamic xpath find
		driver.findElement(By.xpath("//button[text()='"+variable+"']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
