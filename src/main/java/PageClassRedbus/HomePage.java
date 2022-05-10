package PageClassRedbus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseRedBus.TestBaseRedBus;

public class HomePage extends TestBaseRedBus {

	
	@FindBy(xpath= "//img[@src='https://st.redbus.in/Images/INDOFFER/RBTRAVEL10/274x147.png']") private WebElement offercode;
	
	
	
public HomePage() 
{
PageFactory.initElements(driver,this);
}

public boolean Validateoffercode()
{
	offercode.click();
  return offercode.isDisplayed();
  
}

}


