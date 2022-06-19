package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("a[class='signin']"));
		//driver.findElement(By.xpath("//a[contains(@class,'signin')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		//driver.findElement(By.xpath("//a[text() ='Sign in']")).click();
		//driver.findElement(By.xpath("//a[@class='signin']")).click();
		//driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@123");
		//driver.findElement(By.xpath("//input[@name='proceed']")).click();
		//driver.findElement(By.xpath("//a[contains(@class,'rd_logout')]")).click();
		//driver.findElement(By.xpath("//a[@class='rd_logout']")).click();
		//driver.findElement(By.xpath("//b[text ()= 'Rediff Home']")).click();
		//driver.findElement(By.xpath("//p[@id='signin_info']/descendant::a[1]/following-sibling::a[1]")).click();
		//driver.findElement(By.xpath("//div[@class='logobar']/descendant::a[1]/following::p[1]/child::a[1]")).click();
		//driver.findElement(By.xpath("//span[@id='username']/following::p[1]/child::a[2]")).click();
		//driver.findElement(By.xpath("//input[contains(@id,'OAS_subsection')]/following::p[1]/child::a[1]")).click();
		driver.findElement(By.xpath("//div[@class='logobar']/child::div[1]/descendant::a[1]/following-sibling::a[2]/following-sibling::a[2]")).click();
	}

}
