package TestngKeywordAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngAnnotationsSimple {


	WebDriver driver;
	@BeforeSuite
	public void Before() {
		WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void TestCase1() throws InterruptedException {
		//Test case1
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Pratikshambhore95@gmail.com");
		Thread.sleep(3000);
	}
	
	@Test
	public void TestCase() throws InterruptedException {
	    //TestCase2
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("p9689782459");
		Thread.sleep(3000);
	}
	
	@AfterSuite
	public void After() {
		driver.close();
	}
		
		
		
		
		
		
	

}
