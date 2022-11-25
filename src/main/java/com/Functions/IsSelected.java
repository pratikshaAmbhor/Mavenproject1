package com.Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelected {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		driver.manage().window().maximize();
		
	//	String URL = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";
		
		WebElement button = driver.findElement(By.xpath("//input[@value='yellow']"));
		
		if(button.isEnabled()) {
			button.click();
		}else {
			
			System.out.println("Button Not Enabled");
		}
		
		
		System.out.println("MY button is Selected or Not = "+button.isSelected());
		
		
		driver.close();
		
	}

}
