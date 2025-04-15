package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewDetails 
{
	WebDriver driver;
	public ReviewDetails(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//p[.='Total Amount']/../p[2]") public WebElement fareLeftSide;
	@FindBy(xpath="//div[@class='flex flex-col justify-center']/div/h5") public WebElement fareBottomSide;
	 
	public String leftSideFare()
	{
		return fareLeftSide.getText();
	}
	
	public String bottomSideFare()
	{
		return fareBottomSide.getText();
	}
	

}
