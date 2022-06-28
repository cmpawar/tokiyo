package ZerodhaFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleLogins {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/V1/index.php");
		
		
		String user[] =new String[5];
		user[0]= "mngr417879";
		user[1]= "mngr417880";
		user[2]= "mngr417881";
		String pass[] = new String[5];
		pass[0]= "rUqapYp";
		pass[1]="AbYraqa";
		pass[2]= "erUzehU";
		
		System.out.println(pass.length);
		//String arr[][] = {{"mngr417879","mngr417880","mngr417881"},{"rUqapYp","AbYraqa","erUzehU"}};
		
		for(int i=0;i<=user.length-3;i++) {
			
		
			Thread.sleep(2000);
			WebElement username= driver.findElement(By.xpath("//input[@type='text']"));
			username.sendKeys(user[i]);
			Thread.sleep(2000);
			WebElement pswd = driver.findElement(By.xpath("//input[@type='password']"));
			pswd.sendKeys(pass[i]);
			WebElement signinbtn = driver.findElement(By.xpath("//input[@type='submit']"));
			signinbtn.click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
	
			js.executeScript("window.scrollBy(0,250)", "");
			
			WebElement logout = driver.findElement(By.xpath("//a[@href='Logout.php']"));
			
			logout.click();
			Thread.sleep(2000);
			
			driver.switchTo().alert().accept();
		
			Thread.sleep(2000);
		
	}
		}

}
