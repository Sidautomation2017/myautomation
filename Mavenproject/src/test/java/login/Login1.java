package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login1 {
	
	WebDriver driver;
	@BeforeTest
	public void beforetest(){
		driver=new FirefoxDriver();
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
		
		
		
	}
	
	@Test
	public void formsubmission() throws InterruptedException{
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rajeshwar\\Desktop\\Selenium Automation testing\\Selenium SetUp\\Browser exe\\chromedriver_win32\\chromedriver.exe");
		WebElement link=driver.findElement(By.xpath("//*[@id='menu-item-374']/a"));
		link.click();
		Thread.sleep(2000);
			
		
		
	}
	
	@AfterTest
	public void clear_up()
	{
		driver.quit();
		
	}

}
