package PageClassRedbus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BaseRedBus.TestBaseRedBus;

public class TermPageClass extends TestBaseRedBus{
	
	@FindBy(xpath= "//h4[@id='OfferDiscription']") private WebElement TermsPage;
	
		 
	public TermPageClass() 
		{
		PageFactory.initElements(driver,this);
		}
		 
	public boolean termpage() throws InterruptedException 
	{
		
		driver.navigate().to("https://www.redbus.in/info/OfferTerms#RBTRAVEL10");
		 Thread.sleep(3000);
		 return TermsPage.isDisplayed();
		 
		
	}

}
