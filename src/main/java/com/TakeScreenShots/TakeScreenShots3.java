package com.TakeScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShots3 {
	
    public WebDriver driver;
	
	@Test
	public void test1() throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("My test case pass");
	}
		
	@Test
	public void test2() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Assert.assertTrue(false);
		 System.out.println("My test cases fail");
	}
	
	@Test
	public void test3() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=operadekstop-21");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Assert.assertTrue(false);
		 System.out.println("My test cases fail");
	}
	
	
	@AfterMethod
	public void afterMethods(ITestResult result) throws IOException {
		
		if(ITestResult.FAILURE==result.getStatus()) {
	
	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
	 FileUtils.copyFile(screenshotFile, new File("C:\\Users\\ASUS\\eclipse-workspace\\1stMAVENproject\\ScreenShots\\AllScrenshot.png"));
	 FileUtils.copyFile(screenshotFile, new File("C:\\Users\\ASUS\\eclipse-workspace\\1stMAVENproject\\ScreenShots\\" +result.getName()+".png"));
     System.out.println("===========================Name=================="+result.getName());
   
	   }
}
	
	
	
	
	

}
