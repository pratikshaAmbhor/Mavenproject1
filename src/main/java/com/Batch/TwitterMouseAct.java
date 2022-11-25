package com.Batch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TwitterMouseAct {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://twitter.com/i/flow/login");
		driver.manage().window().maximize();
		
		WebElement asc = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input"));
		
		asc.sendKeys("jobbers cafe pune");
		Thread.sleep(2000);
		int a=4;
		for(int i=0; i<a; i++) {
			asc.sendKeys(Keys.ARROW_DOWN);
		}
		asc.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.close();
		
		
		
		
		
		
		
	}

}
