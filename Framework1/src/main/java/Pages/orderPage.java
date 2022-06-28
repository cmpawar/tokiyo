package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class orderPage extends TestBase {

	public orderPage() throws IOException {
		super();
	PageFactory.initElements(driver, this);
	}
 @FindBy(xpath = "(//a[@href='/orders'])[1]") private WebElement oderbtn;
 @FindBy(xpath = "//span[@class='icon icon-chevron-down']") private WebElement tradebtn;
 @FindBy(xpath = "//button[@type='button']") private WebElement gtstrtbtn ;
 @FindBy(xpath = "(//input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx'])[2]") private WebElement searchinput;
 @FindBy(xpath = "(//li[@class='search-result-item'])[1]") private WebElement shareresult1;
 @FindBy(xpath = "(//button[@type='button'])[2]") private WebElement crtgtt;
 @FindBy(xpath = "(//input[@type='number'])[3]") private WebElement gttqty;
 @FindBy(xpath = "(//div[contains(text(),'Place')])[2]") private WebElement plcorder;
 
 
 
 
 
 
 
 
 
 
	
}
