package webelemtvalidation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {

	public static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		driver.findElement(By.className("signin")).click();
		//driver.findElement(By.linkText("Sign in")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.navigate().back();
		driver.findElement(By.className("mailicon")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("Business Email")).click();
		driver.navigate().back();
		driver.findElement(By.className("news")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Create Ac")).click();
		driver.navigate().back();
		driver.findElement(By.className("vdicon")).click();
		driver.navigate().back();
		driver.findElement(By.id("lasttab")).click();
		driver.close();
		
		
		
		
		
		

	}

}
