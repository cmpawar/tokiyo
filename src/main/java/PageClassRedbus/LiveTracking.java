package PageClassRedbus;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseRedBus.TestBaseRedBus;

public class LiveTracking extends TestBaseRedBus {

	@FindBy(xpath="//li[@class='clearfix']") private WebElement livebtn;
	@FindBy(xpath="(//label[@for='bt_AC'])[1]") private WebElement acbox ;
	@FindBy(xpath="(//label[@for='bt_SLEEPER'])[1]") private WebElement slpbox ;
	@FindBy(xpath="//input[@placeholder='OPERATOR']") private WebElement operator ;
	@FindBy(xpath="(//label[@class='custom-checkbox'])[13]") private WebElement chkbox;
	@FindBy(xpath="//div[@class='button btn-apply op-apply']") private WebElement applybtn ;
	@FindBy(xpath="(//label[@for='op_10'])[1]") private WebElement Sharmachbox;
	@FindBy(xpath="//input[@name='inpFilter']") private WebElement input;
	@FindBy(xpath="//div[@id='result-section']//div[@class='clearfix bus-item']") private List<WebElement> resultsharma;
	
	
	
	public LiveTracking() {
		PageFactory.initElements(driver,this);
	}
	
	public void bustrack() throws InterruptedException {
		livebtn.click();
		acbox.click();
		slpbox.click();
		operator.click();
		Thread.sleep(1000);
		
		operator.click();
		Thread.sleep(1000);
		input.sendKeys("sharma");
		Sharmachbox.click();
		//chkbox.click();
		applybtn.click();
		Thread.sleep(3000);
		
	}
	
	public void validateresult() {
		
		for(int i=0;i<resultsharma.size();i++) {
		System.out.println(resultsharma.get(i).getText());
		}
		
	
	}
}
