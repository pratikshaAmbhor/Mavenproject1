package com.DynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindowTabPop_RowCol {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www2.asx.com.au");
		driver.manage().window().maximize();
        System.out.println("URL Sites: "+driver.getCurrentUrl());
        
        
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
        if(ele.isDisplayed()) {
        	ele.click();
        }
        
        driver.findElement(By.xpath("//h5[normalize-space()='S&P ASX200 top 5']")).click();
		Thread.sleep(2000);
		driver.close();
		
		//URL = https://www2.asx.com.au
		//row2 const and col change
		//*[@id="home_top_five"]/div/div[1]/div/div[1]/table/tr[2]/td[1]
		//*[@id="home_top_five"]/div/div[1]/div/div[1]/table/tr[2]/td[2]
		//*[@id="home_top_five"]/div/div[1]/div/div[1]/table/tr[2]/td[3]
		
		        //row3 const col change
		        //*[@id="home_top_five"]/div/div[1]/div/div[1]/table/tr[3]/td[1]
				//*[@id="home_top_five"]/div/div[1]/div/div[1]/table/tr[3]/td[2]
				//*[@id="home_top_five"]/div/div[1]/div/div[1]/table/tr[3]/td[1]
		
		  //*[@id="home_top_five"]/div/div[1]/div/div[1]/table/tr[2]/td[1]
		
		//row change and col change 
	//*[@id="home_top_five"]/div/div[1]/div/div[1]/table/tr[2]/td[1]
	//*[@id="home_top_five"]/div/div[1]/div/div[1]/table/tr[3]/td[1]
	//*[@id="home_top_five"]/div/div[1]/div/div[1]/table/tr[4]/td[3]
		
	}

}
