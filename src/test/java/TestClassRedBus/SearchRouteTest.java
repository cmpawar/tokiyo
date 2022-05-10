package TestClassRedBus;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseRedBus.TestBaseRedBus;
import PageClassRedbus.SearchRoute;

public class SearchRouteTest extends TestBaseRedBus {

	SearchRoute srchrt;
	
	@BeforeMethod
	public void setup() {
		
		initialisation();
		srchrt = new SearchRoute();
	}
	
	@Test
	
	public void SearchBusTest() throws InterruptedException {
		
		srchrt.SearchBus();

	}
	@AfterMethod
	public void exit() {
		driver.close();
	}
	
	
	
}
