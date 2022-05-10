package TestClassRedBus;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseRedBus.TestBaseRedBus;
import PageClassRedbus.HomePage;


public class HomePageTest extends TestBaseRedBus {

	public HomePageTest() {
		super();
	}
	
	 HomePage hmpage;
	@BeforeMethod
	public void Setup()
	{	
		initialisation();
		hmpage = new HomePage();
	}
	
	@Test
	
	public void ValidateoffercodeTest() {
		
	boolean value = hmpage.Validateoffercode();
	Assert.assertEquals(value, true);
	Reporter.log("Logo is Present ="+ value);
		
	}

	@AfterMethod
	public void Exit() {
		
		driver.quit();
	}
}


