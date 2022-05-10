package PageClassRedbus;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BaseRedBus.TestBaseRedBus;

public class SearchRoute extends TestBaseRedBus{

	@FindBy(xpath= "(//label[@class='db'])[1]") private WebElement LableFrom;
	@FindBy(xpath= "//input[@data-message='Please enter a source city']") private WebElement FirstCity;
	@FindBy(xpath="//li[@data-no='1']") private WebElement suggesion;
	@FindBy(xpath = "(//label[@class='db'])[2]") private WebElement Labledest;
	@FindBy(xpath = "//input[@id='dest']") private WebElement destcity;
	@FindBy(xpath = "(//td[@class='wd day'])[1]") private WebElement date;
	@FindBy(xpath = "//button[@id='search_btn']") private WebElement searchbtn;
	@FindBy(xpath = "//div[@id='result-section']//div[@class='clearfix bus-item']") private List <WebElement> Results;
	@FindBy(xpath="(//div[@class='box'])[1]") private WebElement lastelemnt;
	
public SearchRoute() {
	PageFactory.initElements(driver, this);
}

public void SearchBus() throws InterruptedException {
	//LableFrom.click();
	FirstCity.sendKeys("mumbai");
	suggesion.click();
	//Labledest.click();
	Thread.sleep(2000);
	destcity.sendKeys("Banglore");
	Thread.sleep(2000);
	suggesion.click();
	Thread.sleep(2000);
	date.click();
	searchbtn.click();	
	Thread.sleep(3000);
}}
