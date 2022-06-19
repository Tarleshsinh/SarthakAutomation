package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class signlinkd10dynamicxpath {

	private static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		//driver.findElement(By.xpath("//span[@class='login']")).click();
		//driver.findElement(By.xpath("//li[@id='login-button-nav-item']/child::div[1]")).click();
		//driver.findElement(By.xpath("//li[@id='login-button-nav-item']/descendant::span[1]")).click();
		//driver.findElement(By.xpath("//div[@id='identity']/descendant::span[1]")).click();
		driver.findElement(By.xpath("//div[@id='nav-tools']/descendant::div[@class='nav-line-1-container']/child::span[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//span[@id='glow-ingress-line2']")).click();
		//Thread.sleep(2000);
		//driver.navigate().back();
		//driver.findElement(By.xpath("//div[@id='uscBi2vfMbxEweaA-D1zlw']/child::div[2]/descendant::a[1]")).click();
		
		
	}

}
