package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashboardPage extends TestBase {

	@FindBy(xpath="//span[@class='nickname']")	private	WebElement	nickname;
	@FindBy(xpath="//span[@class='user-id']")	public	WebElement	userid;
	@FindBy(xpath="//h4[@class='username']")	private	WebElement	username;
	@FindBy(xpath="//div[@class='email']")	private	WebElement	email;
	@FindBy(xpath="//button[text()='Start investing ']") private WebElement StartInvestBtn;
	@FindBy(xpath="(//input[@icon='search'])[2]") private WebElement SearBar;
	@FindBy(xpath="(//span[text()='TCS'])[1]") private WebElement TCS;
	@FindBy(xpath="(//button[@type='button'])[4]") private WebElement TcsBuyBtn;
	@FindBy(xpath="(//input[@type='number'])[1]") private WebElement ShareQty;
	@FindBy(xpath="(//span[text()='Buy'])[2]") private WebElement BuyBtn;
	
	
	
	public DashboardPage() throws IOException
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String verifynickname()
	{
		return nickname.getText();
		
	}
	public String verifyuserid()
	{
	
		return userid.getText();
		
	}
	public String verifyusername()
	{
		return username.getText();
	}	
	public String verifyemail()
	{
		return email.getText();
	}
	
	public void purchaseSahre() throws EncryptedDocumentException, IOException, InterruptedException {
		
		StartInvestBtn.click();
		Thread.sleep(1000);
		SearBar.sendKeys(Utility.Util.readExcel(0, 0));
		Thread.sleep(1000);
		TCS.click();
		Thread.sleep(1000);
		TcsBuyBtn.click();
		Thread.sleep(1000);
		ShareQty.sendKeys(Utility.Util.readExcel(0, 1));
		Thread.sleep(1000);
		BuyBtn.click();
		
		
	}
}
