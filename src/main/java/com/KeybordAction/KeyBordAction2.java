package com.KeybordAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBordAction2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://text-compare.com");
		
		driver.manage().window().maximize();
		System.out.println("opration perform this Sites = "+driver.getCurrentUrl());
		//Thread.sleep(3000);
		
		
		
		Actions act = new Actions(driver);
//		act.sendKeys("P").perform();
//		Thread.sleep(2000);
		
		WebElement box1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement box2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		box1.sendKeys("Hello Word");
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("P");
		act.sendKeys(Keys.UP);
		act.perform();
		
		driver.close();
		
	}

}
