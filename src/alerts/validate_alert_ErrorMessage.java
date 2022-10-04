package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class validate_alert_ErrorMessage {
	public WebDriver driver;
	SoftAssert softassert=new SoftAssert();
	
	@Test
	public void alerttest() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com/");
	driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
	driver.findElement(By.xpath("//input[@id='remember']")).click();
	driver.findElement(By.xpath("//input[@title='Sign in']")).click();
	Alert alertbox= driver.switchTo().alert();
	String error= alertbox.getText();
	softassert.assertEquals(error, "Please enter a valid user name"); 
	System.out.println("This is a Actual error message"+alertbox.getText());
	Thread.sleep(2000);
	alertbox.accept();
	driver.findElement(By.xpath("//input[@id='remember']")).click();
	driver.quit();
	
	
	}
}
