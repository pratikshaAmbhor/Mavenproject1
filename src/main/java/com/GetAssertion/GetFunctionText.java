package com.GetAssertion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class GetFunctionText {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//System.out.println("Current URL: "+driver.getCurrentUrl());
		//System.out.println("Get Title: "+driver.getTitle());
		//System.out.println("Window Handle: "+driver.getWindowHandle());
		//System.out.println("Page Source: "+driver.getPageSource());
		
		String documentText = "Facebook – log in or sign up";
		String pagetext = driver.getTitle();
		Assert.assertEquals(pagetext, documentText);
		
		WebElement ele = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the peop')]"));
		System.out.println("Facebook Title text = "+ele.getText());
		
		Thread.sleep(1000);
		if(documentText.equals(pagetext)) {
			System.out.println("Text is match");
		}else {
			System.out.println("Not match");
		}
		
		Thread.sleep(1000);
		driver.close();
	}

}
