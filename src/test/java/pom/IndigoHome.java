package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndigoHome 
{
	WebDriver driver;
	public IndigoHome(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="closeButton") public WebElement closePopup;
	@FindBy(xpath = "//a[@href='/airlines/indigo-6e']") public WebElement indigo;

	
	public void terminatePopup()
	{
		closePopup.click();
	}
	
	public void indigoHomeClick()
	{
		indigo.click();
	}
}
