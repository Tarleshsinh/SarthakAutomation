package Browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class class_firefox {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Sarthak Selenium\\Browsers drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		
		
	
		
		
		
		
		
		
	}

}
