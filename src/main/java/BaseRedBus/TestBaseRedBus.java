package BaseRedBus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseRedBus {
	public static  WebDriver driver;
	
	
	public static void initialisation(){
		
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
	}	

}
