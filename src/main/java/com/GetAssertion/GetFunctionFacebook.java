package com.GetAssertion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetFunctionFacebook {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		System.out.println("Current URL: "+driver.getCurrentUrl());
		System.out.println("Get Title: "+driver.getTitle());
		//System.out.println("Window Handle: "+driver.getWindowHandle());
		//System.out.println("Page Source: "+driver.getPageSource());
		
		String documentText = "Facebook – log in or sign up";
		String pagetext = driver.getTitle();
		//Thread.sleep(1000);
		if(documentText.equalsIgnoreCase(pagetext)) {
			System.out.println("Text is match");
		}else {
			System.out.println("Not match");
		}
		
		Thread.sleep(1000);
		driver.close();
	}

}
