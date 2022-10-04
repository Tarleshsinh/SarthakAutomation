package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertsforlogin {

	private static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(1000);
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediff.com");
		
	
		
		

	}

}
