package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redifftestNG_validation {
	
	private ChromeDriver driver;
	SoftAssert softassert=new SoftAssert();

	@BeforeClass
	public void initialize() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com");
	
	
	}
	
	@Test (priority = 1)
	public void validateLandingPage() {
		Assert.assertEquals(driver.getTitle(),"Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
			
	}
	
	@Test (priority =2)
	public void ValidatesignINLink () {
		Assert.assertTrue(driver.findElement(By.className("signin")).isEnabled(),"This link is true");
		driver.findElement(By.className("signin")).click();}
		
	@Test (priority=3)
	public void  usertextboxvalidation() {
		Assert.assertEquals(driver.findElement(By.xpath("//input[@id='login1']")).isEnabled(),true);
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
		
	
	}
	
	
	

}
