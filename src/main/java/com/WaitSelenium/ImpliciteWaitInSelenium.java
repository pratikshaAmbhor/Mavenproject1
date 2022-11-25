package com.WaitSelenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImpliciteWaitInSelenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Implicite Wait
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.DAYS);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Expicite Wait
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='day']")));
		
		
		//fluent Wait
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	  
		
	  //Thread.sleep(2000);
		Select select = new Select(driver.findElement(By.id("//select[@id='day']")));
		select.selectByVisibleText("20");
		select.selectByValue("10");
		select.selectByIndex(5);
		Thread.sleep(2000);
		driver.close();
	}

}
