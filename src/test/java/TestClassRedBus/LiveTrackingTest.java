package TestClassRedBus;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseRedBus.TestBaseRedBus;
import PageClassRedbus.LiveTracking;
import PageClassRedbus.SearchRoute;

public class LiveTrackingTest extends TestBaseRedBus {
	
	public LiveTrackingTest() {
		super();
	}

	LiveTracking lv;
	SearchRoute sr;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialisation();
		lv = new LiveTracking();
		sr = new SearchRoute();
		sr.SearchBus();
	}
	@Test
	public void bustrackTest() throws InterruptedException {
		lv.bustrack();
	}
	@Test
	public void validateresultTest() {
		lv.validateresult();
	}
	
	@AfterMethod
	public void exit() {
		driver.close();
	}
	
	
	
	
	
}
