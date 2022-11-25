package com.HndleAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlertsDemoGuru {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		
		//driver.findElement(By.xpath("//input[@name='submit']")).click();
		driver.findElement(By.xpath("//input[text()='Submit']")).click();
		Alert alert = driver.switchTo().alert();
		//alert.sendKeys("pratiksha");
		alert.accept();
		System.out.println("Complete My Action2");
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("//input[@name='res']")).click();
		Alert alert2 = driver.switchTo().alert();
		//alert2.sendKeys("JobberCafe");
		alert2.dismiss();
		Thread.sleep(3000);
		System.out.println("Complete My Action2");
		
		driver.close();
	}

}
