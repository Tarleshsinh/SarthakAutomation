package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookdropdown {

	private static WebDriver driver;
	public static Select select;

	//public static void main(String[] args) throws InterruptedException 
		// TODO Auto-generated method stub
 @BeforeMethod
 public void testsetup () throws Exception {
	 System.out.println("Test Facebook create accont Page ");
 
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//div[@id='reg_pages_msg']/preceding::a[1]")).click();
		Thread.sleep(2000);
 }
	@Test (priority= 1)
	public void facebooktitlePage() throws Exception {
		
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);}
		
	
		@Test (priority= 2)
		public void namefield () throws Exception {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Naveen");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		Thread.sleep(1000);
		}
		@Test (priority=3)
		public void sendkeys () throws Exception {
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567891");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Bansda108*");
		Thread.sleep(2000);
		}
		
		@Test(priority=4)
		public void dropdown () throws Exception {
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("May");
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("10");
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1990");
		Thread.sleep(2000);
		}
		
		//driver.findElement(By.className("_58mt")).click();
		//driver.findElement(By.xpath("//*[cotains (text(),'Male')]")).click();
		
		@Test (priority=5)
		public void radioButton () throws Exception {
		driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
		Thread.sleep(2000);
	}
	
		
		@AfterMethod
		public void teardown() {
		driver.quit();
		}
 }		
		
		
	


