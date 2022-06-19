package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rediff_code {

	public static WebDriver diver;
	private static ChromeDriver driver; 
	
	@Test
	public static void initializeWebDriver( ) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void launchRediff() throws InterruptedException {
		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
	}
	
	@Test
	public void clickonsignin() {
		driver.findElement(By.cssSelector("a.signin")).click();
	}
	
	
	
	@Test
	public void tierDown() {
		driver.close();}
	
	
	
	
}
