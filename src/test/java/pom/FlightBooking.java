package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightBooking 
{
	WebDriver driver;
	public FlightBooking(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//div[text()='From']/../input") public WebElement fromCity;
	@FindBy(xpath = "//div[.='CCU - Kolkata, India']/div") public WebElement chooseKolkata;
	
	
	@FindBy(xpath = "//div[text()='To']/../input") public WebElement toCity;
	
	@FindBy(xpath = "//button[@class='ixi-icon-arrow rd-next']") public WebElement depNextMonthArrow;
	
	@FindBy(xpath = "//td[@data-date='26062025']") public WebElement departureDate;
	
	@FindBy(xpath = "//input[@placeholder='Return']") public WebElement returnField;

	@FindBy(xpath = "(//button[@class='ixi-icon-arrow rd-next'])[2]") public WebElement retNextMonthArrow;

	@FindBy(xpath = "//td[@data-date='03082025']") public WebElement returnDate;
	
	@FindBy(xpath="//input[@value='1 Passenger, Economy']") public WebElement allTravellers;
	@FindBy(xpath = "//div[.='Adult']/../../div[2]/span[3]") public WebElement numOfAdults;
	@FindBy(xpath = "//div[.='Child']/../../div[2]/span[2]") public WebElement numOfChildren;
	@FindBy(xpath = "//div[.='Infant']/../../div[2]/span[2]") public WebElement numOfInfants;

	@FindBy(xpath = "//div[@class='search u-ib u-v-align-bottom']") public WebElement search;
	
	public void fromCityField()
	{	
		fromCity.click();
		
		fromCity.sendKeys("CCU");
		chooseKolkata.click();
		
	}
	
	public void toCityField()
	{
		//toCity.click();
		toCity.sendKeys("DEL", Keys.ENTER);
	}
	
	public void departureDate()
	{
		depNextMonthArrow.click();
		//nextMonthArrow.click();
		departureDate.click();
	}
	
	public void returnDate()
	{
		returnField.click();
		retNextMonthArrow.click();
		returnDate.click();
		
	}
	
	public void travellers()
	{
		allTravellers.click();
		numOfAdults.click(); 
		numOfChildren.click();
		numOfInfants.click();
	}
	
	public void search()
	{
		search.click();
	}

}
