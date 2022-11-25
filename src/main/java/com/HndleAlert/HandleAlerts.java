package com.HndleAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		Thread.sleep(2000);
		System.out.println("Complete My Action");
		
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("JobberCafe");
		alert2.accept();
		Thread.sleep(3000);
		System.out.println("Complete My Action2");
		
		driver.close();
	}

}
