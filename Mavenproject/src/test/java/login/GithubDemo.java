package login;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GithubDemo {

	@BeforeTest
	public void beforeTest(){
		
		System.out.println("I am in before test");
	}
	
	
	
	
@Test
public void test(){
	System.out.println("I am in Test");
	
}

@AfterTest
public void afterTest(){
	
	System.out.println("I am in after test");


	//	
	}

}
