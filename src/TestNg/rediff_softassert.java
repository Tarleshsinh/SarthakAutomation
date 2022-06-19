package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rediff_softassert {
 WebDriver driver;
SoftAssert softassert = new SoftAssert();

@Test (priority=1)
public void launchdriver () {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.rediff.com");
	
}
	
	
@Test (priority=2)
public void testNGvalidation() throws Exception {
	
	softassert.assertTrue(driver.findElement(By.className("signin")).isEnabled()); 
	driver.findElement(By.className("signin")).click();
	
	
	softassert.assertEquals(driver.findElement(By.id("login1")).isEnabled(), true);
	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	
	softassert.assertEquals(driver.findElement(By.id("password")).isEnabled(),true);
	driver.findElement(By.id("password")).sendKeys("Selenium@123");
	
	softassert.assertEquals(driver.findElement(By.className("signinbtn")).isEnabled(), true);
	driver.findElement(By.className("signinbtn")).click();
	
	Thread.sleep(2000);
	softassert.assertEquals(driver.findElement(By.className("rd_logout")).isEnabled(),true);
	driver.findElement(By.className("rd_logout")).click();
	
	
	//Assert.assertEquals(driver.findElement(By.xpath("//a[@class='logo']/following-sibling::span[1]/a[2]/b")).isEnabled(),true);
	//driver.findElement(By.xpath("//a[@class='logo']/following-sibling::span[1]/a[2]/b")).click();
	
	driver.close();
	
	softassert.assertAll();
	
}
	
	
		
		
	}

