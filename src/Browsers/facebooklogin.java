package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebooklogin {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\Sarthak Selenium\\Browsers drivers//geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.facebook.com");
		driver1.manage().window().maximize();
		driver1.manage().window().minimize();
		Thread.sleep(4000);
		driver1.close();
		System.setProperty("webdriver.edge.driver","C:\\Users\\Admin\\Desktop\\Sarthak Selenium\\Browsers drivers\\msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://www.skyscanner.com");
		driver2.manage().window().maximize();
		Thread.sleep(3000);
		driver2.manage().window().minimize();
		driver2.close();
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\Sarthak Selenium\\Browsers drivers\\geckodriver.exe");
		WebDriver driver3 = new FirefoxDriver();
		driver3.get("https://www.flyswoop.com/");
		Thread.sleep(3000);
		driver3.manage().window().maximize();
		driver3.close();
		
	

		
		
		

	}

}
