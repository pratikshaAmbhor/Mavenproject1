package com.Batch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonMouseAct {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement asc = driver.findElement(By.xpath("//input[@type='text']"));
		
		asc.sendKeys("watches");
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
