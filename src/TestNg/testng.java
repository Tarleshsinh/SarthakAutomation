package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng {

	//@Beforesuite > @Before test > @Before class >@BeforeMethod> @Test > @AfterMethod @Afterclass >@AfterTest> @AfterSuite
	
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void beforesuit() {
		System.out.println("this will be executed first");
	}
	
	@BeforeTest
	public void beforetest () {
	System.out.println("this will be executed second");
	}
	
	@BeforeClass
	public void beforeclass () {
	System.out.println("this will be executed third");}
		
	@BeforeMethod
	public void beforemethod() {
		System.out.println("This will be executed fourth");}
		
	@Test 
	public void init(){

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("seleniumpanda@rediff.com");
		
		
		
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("This will be executed sixth ");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("This will be executed 7th ");
	}
		
	@AfterTest 
	public void aftertest() {
		System.out.println("This will be excecuted 8th ");
	}
		
	@AfterSuite
	public void aftersuite() {
		System.out.println("THis will be executed last");
	}
		
	
		
	
}

