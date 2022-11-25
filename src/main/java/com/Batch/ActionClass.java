package com.Batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {

		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver(); 
		
		//driver.get("//*[@id=\"twotabsearchtextbox\"]");
		driver.get("https://www.amazon.in/?tag=operadesktop-21");
		//WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Hello,sign in')]/../.."));
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
		WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		act.click(ele2).perform();
		Thread.sleep(500);
		act.click(ele).dragAndDrop(ele, ele2).perform();
		Thread.sleep(2000);
		driver.close();
		
	}

}
