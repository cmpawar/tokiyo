package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException
		{
		
		prop = new Properties();
		FileInputStream file = new FileInputStream("C://Users//Chaitanya//eclipse-workspace2//Framework1//configFiles//config1.properties");
		prop.load(file);
		System.out.println(prop);
		} 
		public static void intialisation()
		
	{
		ChromeOptions	options	=	new	ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
	}}
	
