package ZerodhaFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZerodhaProg1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com");
		
		Thread.sleep(1000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Title Is matched As per Requirement");
		}
		else{
			System.out.println("Title Is Not matched As per Requirement");
		}
		
		String user1 = "CW4819";
		String pass1 = "Vishwas@1234";
		String pin1 = "342414";
		String share = "TCS";
		String ShareQty = "10";
		String stoploss = "-2";
	
		WebElement image = driver.findElement(By.xpath("//img[@alt='Kite']"));
		System.out.println("Logo Present on WebPage = " +image.isDisplayed());
		Thread.sleep(1000);
		WebElement userIdTxBX = driver.findElement(By.xpath("//input[@id='userid']"));
		WebElement passwordTxBX = driver.findElement(By.xpath("//input[@id='password']"));
		
		userIdTxBX.sendKeys(user1);
		passwordTxBX.sendKeys(pass1);
		Thread.sleep(1000);
		WebElement submitbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		submitbtn.click();
		Thread.sleep(2000);
		WebElement userIdCheck = driver.findElement(By.xpath("//div[@class='form-header text-center']"));
		System.out.println(userIdCheck.getText());
		Thread.sleep(1000);
		WebElement pinTxBX = driver.findElement(By.xpath("//input[@id='pin']"));
		pinTxBX.sendKeys(pin1);
		Thread.sleep(1000);
		WebElement continueBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		continueBtn.click();
		Thread.sleep(1000);
		WebElement usernickName = driver.findElement(By.xpath("//span[@class='nickname']"));
		System.out.println(usernickName.getText());
		Thread.sleep(1000);
		WebElement startInvst = driver.findElement(By.xpath("//button[text()='Start investing ']"));
		startInvst.click();
		Thread.sleep(1000);
		WebElement searchbar = driver.findElement(By.xpath("(//input[@icon='search'])[2]"));
		searchbar.sendKeys(share);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='TCS'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		Thread.sleep(1000);
		WebElement shareQty = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
		shareQty.sendKeys(ShareQty);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[@class='su-checkbox-box'])[1]")).click();
		WebElement stoplosstxbx = driver.findElement(By.xpath("(//input[@type='number'])[4]"));
		stoplosstxbx.sendKeys(stoploss);
		Thread.sleep(1000);
		WebElement buyBtn = driver.findElement(By.xpath("(//span[text()='Buy'])[2]"));
		buyBtn.click();
		Thread.sleep(2000);
		
		driver.close();
			
		
	}

}
