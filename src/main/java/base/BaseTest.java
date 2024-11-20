package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	@BeforeTest
	public void beforeTestMethod() {
		
	}
	
	@BeforeMethod
    public void beforeMethod() {
		
	}
	
	@AfterTest
    public void afterTestMethod() {
		
	}
	@AfterMethod
    public void afterMethod() {
		
	}
	
}
