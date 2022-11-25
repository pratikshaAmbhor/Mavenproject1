package com.DynamicXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RowColum {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www2.asx.com.au");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//button[text()='Accept All Cookies']"));
		
		if(ele.isDisplayed()) {
		ele.click();
		}
		
		driver.findElement(By.xpath("//h5[normalize-space()='S&P ASX200 top 5']")).click();
		Thread.sleep(3000);
		
		
		
		List<WebElement> rows= driver.findElements(By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr"));
		
		List<WebElement> column= driver.findElements(By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr[2]/td"));
		
		
		
		System.out.println(rows.size());
		
		for(int i =2;i<=rows.size();i++) {
			
			for(int j=1;j<=column.size();j++) {
				
				
				String text = driver.findElement(By.xpath("//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr["+i+"]/td["+j+"]")).getText();
				
				//*[@id=\"home_top_five\"]/div/div[1]/div/div[1]/table/tr["+i+"]/td["+2+"]
				                                                             
				System.out.println("My actual text = " +text);
				
			}
			
		}


		driver.close();
	}

}
