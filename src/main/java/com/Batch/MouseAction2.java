package com.Batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseAction2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		driver.manage().window().maximize();
		
		/*Actions act1 = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[text()='Demo Dropdown List']"));
		act1.scrollToElement(ele).perform();
		Thread.sleep(2000);
		driver.close();*/
		
		//click and hold action: B
		Actions act = new Actions(driver);
	WebElement source = driver.findElement(By.xpath("//li[text()='A']"));	
	WebElement destination = driver.findElement(By.xpath("//li[text()='K']"));
	act.moveToElement(source).build().perform();
	Thread.sleep(2000);
	act.clickAndHold().perform();
	Thread.sleep(2000);
	act.moveToElement(destination).build().perform();
	Thread.sleep(2000);
	driver.close();	
		
		
		
	}

}
