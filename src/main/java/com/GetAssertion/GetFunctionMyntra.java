package com.GetAssertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetFunctionMyntra {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.myntra.com");
		
		driver.manage().window().maximize();
		System.out.println("Current URL: "+driver.getCurrentUrl());
		System.out.println("Get Title: "+driver.getTitle());
		//System.out.println("Window Handle: "+driver.getWindowHandle());
		//System.out.println("Page Source: "+driver.getPageSource());
		
		//String documentText = "//a[@h='ID=SERP,5556.1']";
		String documentText = "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		String pagetext = driver.getTitle();
		//Thread.sleep(1000);
		if(documentText.equals(pagetext)) {
			System.out.println("Myntra Text is match");
		}else {
			System.out.println("Not match");
		}
		
		Thread.sleep(1000);
		driver.close();
	}

}
