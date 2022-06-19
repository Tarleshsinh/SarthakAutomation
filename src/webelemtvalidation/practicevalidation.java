package webelemtvalidation;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practicevalidation {

	private static FirefoxDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String expectedTitle= "Amazon.com. Spend less. Smile more.";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {System.out.println("my title is corect");}
		
		String expectedCurrentUrl= "https://www.amazon.com/";
		String actualCurrentUrl = driver.getCurrentUrl();
		
		if(expectedCurrentUrl.equals(actualCurrentUrl)) {System.out.println("my current url is correct");}

		
		
		
		
		
		
	}

}
