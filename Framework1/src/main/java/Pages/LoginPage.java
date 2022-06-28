package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath = "//input[@id='userid']") private WebElement UserIdTxbX;
	@FindBy(xpath = "//input[@id='password']") private WebElement passwordTxbx ;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginBtn;
	@FindBy(xpath = "//img[@alt='Kite']") private WebElement kiteLogo ;
	@FindBy(xpath = "//img[@alt='Zerodha']") private WebElement zerodhaLogo ;
	@FindBy(xpath = "//input[@id='pin']")private WebElement pinTxbx;
	
	public LoginPage()throws IOException
	{
		
		PageFactory.initElements(driver, this);
		
	}
	public String validateLoginPageTitle() 
	{
		return driver.getTitle();
	}
	
	public boolean validateKiteLogo()
	{
		return kiteLogo.isDisplayed();
	}
	public boolean validateZerodhaLogo() 
	{
		return zerodhaLogo.isDisplayed();
	}
	
	public void loginPageAcc() throws InterruptedException
	{
		UserIdTxbX.sendKeys(prop.getProperty("userid1"));
		passwordTxbx.sendKeys(prop.getProperty("password1"));
		loginBtn.click();
		Thread.sleep(2000);
		pinTxbx.sendKeys(prop.getProperty("pin1"));
		loginBtn.click();
		
	}

}
