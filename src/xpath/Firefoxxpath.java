package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefoxxpath {

	public static void main(String[] args) {
		

		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tarlesh_parmar@yahoo.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Tparmar7681*");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	
		
	}

}
