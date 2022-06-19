package Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginlogout {

	public static void main(String[] args) throws Exception {
		
		
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\Sarthak Selenium\\Browsers drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("tarlesh_parmar@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("Tparmar7681*");
		driver.findElement(By.name("login")).click();
		driver.quit();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Sarthak Selenium\\Browsers drivers\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com");
		driver1.manage().window().maximize();
		driver1.findElement(By.id("email")).sendKeys("tarlesh_parmar@yahoo.com");
		driver1.findElement(By.id("pass")).sendKeys("Tparmar7681*");
		driver1.findElement(By.name("login")).click();
		Thread.sleep(10000);
		driver.close();
		
		
		
		
		
		

	}

}
