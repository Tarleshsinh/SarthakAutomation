package webelemtvalidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class webelemntvalidation {

	private static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		// binary is known as WebDrivermanger
		//for validation of a website we use 3 aspects - current get.url and get,title, get page source(we don't use this anymore)  
	
			
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();
		
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String expectedTitle= "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {System.out.println("my rediff title is correct");}
		
		String expectedCurrentUrl= "https://www.rediff.com/";
		String actualCurrentUrl= driver.getCurrentUrl();
		
		if(expectedCurrentUrl.equals(actualCurrentUrl)) {System.out.println("my Rediff current URL is correct");}
		
		// it is a link which needs to be clicked . you can use.is enabled(); 
		
		WebElement SignInLink = driver.findElement(By.className("signin"));
		
		if(SignInLink.isEnabled()) {SignInLink.click();}
		
		WebElement keepMeSignedInAs= driver.findElement(By.id("remember"));
		if(keepMeSignedInAs.isSelected()) 
		{keepMeSignedInAs.click();
		
		Thread.sleep(3000);
		keepMeSignedInAs.click();
		Thread.sleep(2000);
		}
		
		WebElement usernameTextBox = driver.findElement(By.id("login1"));
	    if(usernameTextBox.isEnabled() && usernameTextBox.isDisplayed()){
	    	usernameTextBox.sendKeys("seleniumpanda@rediffmail.com");
	    }
		 
	    WebElement passwordTextBox = driver.findElement(By.id("password"));
	    if(passwordTextBox.isEnabled() && passwordTextBox.isDisplayed());{
	    	passwordTextBox.sendKeys("Selenium@123");
	    	
	    	
	    WebElement signButton=driver.findElement(By.className("signinbtn"));
	    if(signButton.isDisplayed()) {
	    	signButton.click();
	    	
	    	Thread.sleep(2000);
	    	
	    WebElement logoutButton= driver.findElement(By.className("rd_logout"));
	    if(logoutButton.isDisplayed()) {
	    	logoutButton.click();
	    	
	    
	    	
	    	
	    	
	    }
	    
	    
	    	
	    	
	    }
	    }

		
		
		
		

		

	}

}
