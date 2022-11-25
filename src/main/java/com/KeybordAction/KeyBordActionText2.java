package com.KeybordAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBordActionText2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://text-compare.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
        Actions act = new Actions(driver);
//		act.sendKeys(Keys.ENTER);
//		act.sendKeys("A").perform();
//		Thread.sleep(2000);
//		
		
		WebElement box1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement box2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		box1.sendKeys("hello word");
		
		//ctl+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("A");
		act.keyUp(Keys.CONTROL);
		act.perform();
		Thread.sleep(2000);
		
		//ctl+C
		act.keyDown(Keys.CONTROL);
		act.sendKeys("C");
		act.keyUp(Keys.CONTROL);
		act.perform();
		Thread.sleep(2000);
		
		//press TAB
		act.sendKeys(Keys.TAB);
		act.perform();
		
		//ctl+v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("V");
		act.keyUp(Keys.CONTROL);
		act.perform();
		Thread.sleep(2000);
		
		System.out.println("Hii");
		//driver.close();
		
	}

}
