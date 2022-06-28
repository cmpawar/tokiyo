package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}



	LoginPage login;
	
	@BeforeMethod
	
	public void setup() throws IOException 
	{
		
		intialisation();
		login = new LoginPage();
		
	}
	
	@Test
	
	public void ValidateLoginPageTest() 
	{
		String expTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		String actTitle = login.validateLoginPageTitle();
		Assert.assertEquals(actTitle, expTitle);
		Reporter.log("Title of Project ="+actTitle);
	}
	
	@Test
	public void validateKiteLogoTest() 
	{
		boolean value = login.validateKiteLogo();
		Assert.assertEquals(value, true);
		Reporter.log("Kite Logo Is "+ value);
	}
	@Test
	public void validateZerodhaLogoTEst()
	{
		boolean value = login.validateZerodhaLogo();
		Assert.assertEquals(value, true);
		Reporter.log("Zerodha Logo Is "+ value);
	}
	@Test
	public void loginPageAccTest() throws InterruptedException
	{
		login.loginPageAcc();
	}

	
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}

}
