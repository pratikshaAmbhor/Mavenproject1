package TestngKeywordAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngAnnotations {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Test case1
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Pratikshambhore95@gmail.com");
		Thread.sleep(3000);
		//TestCase2
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("p9689782459");
		
		driver.close();
		
		
		
		
		
		
		
		
	}

}
