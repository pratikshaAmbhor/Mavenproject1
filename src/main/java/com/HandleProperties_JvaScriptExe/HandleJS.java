package com.HandleProperties_JvaScriptExe;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJS {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("document.querySelector(\"#email\").value='pratiksha'");
		js.executeScript("document.querySelector(\"#pass\").value='123@kanchan'");
		Thread.sleep(1000);
		js.executeScript("alert('JobbersCafePune')");
		Thread.sleep(1000);
		js.executeScript("$x(\"//input[@id='email']\")");
	//	js.executeScript("document.querySelector(\"#u_0_5_Lx\").value='post'");
  
		driver.close();
	}

}
