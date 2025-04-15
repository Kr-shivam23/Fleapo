package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlights 
{
	WebDriver driver;
	public SelectFlights(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//p[.='Stops']/../div[2]/span") public WebElement selectOneStop;
	@FindBy(xpath ="//div[@class='flex gap-20 w-full pb-36 min-h-[150vh]']/div[1]/div[2]/div") public WebElement oneStopFlight;
	@FindBy(xpath="//button[contains(.,'Book')]") public WebElement bookButton;
	
	
	
	public void stops()
	{
		selectOneStop.click();
	}
	public void selectOneStopFlight()
	{
		oneStopFlight.click();
	}
	
	public void proceedToBook()
	{
		bookButton.click();
	}

}
