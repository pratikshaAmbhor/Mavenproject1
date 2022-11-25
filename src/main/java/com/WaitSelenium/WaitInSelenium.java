package com.WaitSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitInSelenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	   //driver.findElement(By.xpath("//div[text()='First name']/..//input")).sendKeys("JobberCafe");
		Thread.sleep(2000);
		Select select = new Select(driver.findElement(By.id("//select[@id='day']")));
		select.selectByVisibleText("20");
		select.selectByValue("10");
		select.selectByIndex(5);
		Thread.sleep(2000);
		driver.close();
	}

}
