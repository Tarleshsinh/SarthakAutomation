package uploadscreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import graphql.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadscreenshot {

	public static WebDriver driver;
	@Test
	public static void main() throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/test/upload");
		driver.findElement(By.xpath("//input[starts-with(@id,'uploadfile')]")).sendKeys("C:\\Users\\Admin\\Desktop\\Sarthak Selenium\\Automation sarthak Recording.docx");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//h3[@id='res']")).isDisplayed());
		Thread.sleep(2000);
		driver.close();
	}

}
