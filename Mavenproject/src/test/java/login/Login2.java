package login;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;

public class Login2 {
	WebDriver driver;
	@BeforeTest
	public void beforeTest(){
		/*driver=new FirefoxDriver();
		driver.get("");*/
		System.out.println("I am in Before test");	
		
	}
	@Test
	public void test1(){
		try{
		Assert.assertEquals(true, false);}
		catch(java.lang.AssertionError e){
			System.out.println("I am in test1");	
		}		
		
		
		
	}
	
	@Test
	public void test2(){

		SoftAssert a=new SoftAssert();
		a.assertEquals(false, true);	
		System.out.println("I am in test2");
		a.assertAll();
		
	
	}
	
	@AfterTest
	public void afterTest(){
		
		System.out.println("I am in After test");	
		//driver.quit();
		
	}
	

}
