package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class special_TestNG {

	
	@BeforeMethod
	public void init() {
		System.out.println("This is before method annotation");
	}
	
	@Test
	public void test1( ) {
		System.out.println("This is first test ");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("seleniumpanda@rediff.com");
		
	}
	
	@Test
	public void test2 () {
		System.out.println("This is second test");
	}
	
	@Test
	public void test3() {
		System.out.println("This is third test ");
	}
	
	
	@AfterMethod
	public void end () {
		System.out.println("This is the after method annotation");
	}
	
	
	
	
	
}
