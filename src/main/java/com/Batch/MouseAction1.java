package com.Batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class MouseAction1 {

  public static void main(String[] args) throws InterruptedException {

		System.out.println("Hello word");
	//	System.setProperty("webdriver.chrome.driver", "C:\\Web driver\\chromedriver_win32 (1)\\chromedriver.exe");
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.5.0");
		//driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59");
	    Thread.sleep(100);
	    driver.close();
  }

}
