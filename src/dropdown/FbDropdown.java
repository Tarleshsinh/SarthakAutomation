package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbDropdown {

	public static WebDriver driver;
	public static Select select; 
	
	
	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//div[@id='reg_pages_msg']/preceding::a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Naveen");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("naveen_Kumar");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Bansda108*");
		
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Jan");
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("10");
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1990");
		
		driver.findElement(By.xpath("//*[contains(text(),'Custom')]")).click();
		Thread.sleep(3000);
		
		select = new Select(driver.findElement(By.xpath("//select[@name='preferred_pronoun']")));
		//select.selectByVisibleText("She :Wish him a happy birthday!");
		select.selectByValue("6");
		//driver.close();
		


		
		
		
	}

}
