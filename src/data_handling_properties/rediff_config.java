package data_handling_properties;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rediff_config {

 public static WebDriver driver;
 public  Properties prop;
 
 
 @Test
 public void launchBrowser () throws Exception {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\data_handling_properties\\config.properties");
	 prop=new Properties();
	 prop.load(ip);
	 System.out.println(prop.getProperty("url"));
	 System.out.println(prop.getProperty("x-path1"));
	 
	 
 }	 
@Test
public void validatesiginlink() throws InterruptedException {
	

	 driver.get(prop.getProperty("url"));
	 driver.findElement(By.xpath(prop.getProperty("x-path1"))).click();
	 driver.findElement(By.xpath(prop.getProperty("x-path2"))).sendKeys(prop.getProperty("username"));
	 driver.findElement(By.xpath(prop.getProperty("x-path3"))).sendKeys(prop.getProperty("password"));
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(prop.getProperty("x-path4"))).click();
	 driver.findElement(By.xpath(prop.getProperty("x-path5"))).click();
	 driver.findElement(By.xpath(prop.getProperty("x-path6"))).click();
	 
} 
 }
	
	
	
	
	
	
	
	
	

