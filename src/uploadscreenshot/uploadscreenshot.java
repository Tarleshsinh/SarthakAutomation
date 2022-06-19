package uploadscreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadscreenshot {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/test/upload");
		driver.findElement(By.xpath("//input[starts-with(@id,'uploadfile')]")).sendKeys("C:\\Users\\Admin\\Desktop\\Sarthak Selenium\\Automation sarthak Recording.docx");
		Thread.sleep(2000);
		driver.close();
	}

}
