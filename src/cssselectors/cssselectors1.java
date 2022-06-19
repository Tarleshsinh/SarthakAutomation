package cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cssselectors1 {

	private static ChromeDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("a[class=signin]")).click();
		//driver.findElement(By.cssSelector("a.signin")).click();
		driver.findElement(By.cssSelector(".signin")).click();
		//driver.findElement(By.cssSelector("#login1")).sendKeys("seleniumpanda@rediff.com");
		//driver.findElement(By.cssSelector("input[id *=login1]")).sendKeys("seleniumpanda@rediff.com");
		driver.findElement(By.cssSelector("input[id *=login]")).sendKeys("seleniumpanda@rediff.com");
		//driver.findElement(By.cssSelector("input[id *=logi]")).sendKeys("seleniumpanda@rediff.com");
		//driver.findElement(By.cssSelector("input[id *=l]")).sendKeys("seleniumpanda@rediff.com");
		driver.findElement(By.cssSelector("input[id^=p]")).sendKeys("Selenium@123");	
	}

}
