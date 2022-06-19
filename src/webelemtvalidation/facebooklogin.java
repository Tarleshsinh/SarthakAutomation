package webelemtvalidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class facebooklogin {

	private static ChromeDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://rediff.com");
		 driver.findElement(By.className("signin")).click();
		 WebElement KeepMeSignedInAs= driver.findElement(By.id("remember"));
		 if(KeepMeSignedInAs.isSelected());
		 {KeepMeSignedInAs.click();
		 KeepMeSignedInAs.click();}
		 driver.findElement(By.name("login")).sendKeys("seleniumpanda@rediffmail.com");
		 driver.findElement(By.id("password")).sendKeys("Selenium@123");
		 driver.findElement(By.name("proceed")).click();
		 driver.findElement(By.className("rd_logout"));
		 driver.quit();
		 
		 
		
		
		
		
		
	}

}
