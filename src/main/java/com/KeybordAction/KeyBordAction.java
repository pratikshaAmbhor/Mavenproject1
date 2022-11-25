package com.KeybordAction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBordAction {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		System.out.println("Operation perform this Sites: "+driver.getCurrentUrl());
		Thread.sleep(3000);
		
		
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		act.click().pause(5);
		act.sendKeys("P").perform();
		Thread.sleep(2000);
		driver.close();
		
	}

}
