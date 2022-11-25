package com.HandleProperties_JvaScriptExe;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJavaScriptExecuter {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById(\"email\").value='JobbersCafe'");
		
		

	}

}
