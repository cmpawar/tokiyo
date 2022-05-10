package TestClassRedBus;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseRedBus.TestBaseRedBus;
import PageClassRedbus.HomePage;
import PageClassRedbus.TermPageClass;

public class TermPageTest extends TestBaseRedBus {
	
	public TermPageTest() {
		super();
	}
	
	HomePage hmPage;
	TermPageClass trmpage;
	@BeforeMethod
	public void setup() {
		
		initialisation();
		hmPage= new HomePage();
		hmPage.Validateoffercode();
		trmpage =new TermPageClass();
	}
	
	@Test
	public void termpageTest() throws InterruptedException{
		
		boolean value = trmpage.termpage();
		Assert.assertTrue(true);
		Reporter.log("Terms Page is Dispalyed =" + value );
	}
	
	
	@AfterMethod
	public void exit(){
		driver.quit();
	}

}
