package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashboardPage;
import Pages.LoginPage;

public class DashboardPageTest extends TestBase {

	public DashboardPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	DashboardPage dash;
	LoginPage login;
	
	@BeforeMethod
	public void setup() throws InterruptedException, IOException
	{
		intialisation();
		
		login = new LoginPage();
		login.loginPageAcc();
		dash = new DashboardPage();
		dash.userid.click();
		
		
	}
	@Test
	public void verifynicknameTest() throws InterruptedException
	{
		String value = dash.verifynickname();
		Thread.sleep(1000);
		Assert.assertEquals(value, "Vishwas");
		Reporter.log("Nick Name Is"+value);
	}
	
	@Test
	
	public void verifyuseridTest() 
	{
		String value = dash.verifyuserid();
		Assert.assertEquals(value, "CW4819");
		Reporter.log("UserID is"+value);
		
	}
	@Test
	public void verifyusernameTest()
	{
		String Value = dash.verifyusername();
		Assert.assertEquals(Value,"Vishwas Vitthalrao Mahajan");
		Reporter.log("UserName is"+Value);
	}
	
	@Test
	public void verifyemailTest() 
	{
		String value = dash.verifyemail();
		Assert.assertEquals(value,"mahajanvishwas1@gmail.com");
		Reporter.log("Email is"+value);
	}
	@Test
	public void purchaseSahreTest() throws EncryptedDocumentException, IOException, InterruptedException {
		
		dash.purchaseSahre();
	}
	
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
}
