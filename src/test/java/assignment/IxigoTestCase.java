package assignment;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import constants.BaseClass;
import constants.GenericMethods;
import pom.FlightBooking;
import pom.IndigoHome;
import pom.ReviewDetails;
import pom.SelectFlights;

public class IxigoTestCase extends BaseClass
{
WebDriver driver=launch();
	
	
	

	@Test
	public void indigoHome() 
	{
		IndigoHome indigoHome=new IndigoHome(driver);
		GenericMethods.frames(driver, "wiz-iframe-intent");
		indigoHome.terminatePopup();
		GenericMethods.javascriptExecutor(driver, "window.scrollBy(0,1800)");
		GenericMethods.parentFrame(driver);

		indigoHome.indigoHomeClick();
		
		FlightBooking booking=new FlightBooking(driver);
		booking.fromCityField();
		booking.toCityField();
		booking.departureDate();
		booking.returnDate();
		booking.travellers(); 
		booking.search();
		
		SelectFlights selectFlight=new SelectFlights(driver);
		selectFlight.stops();
		selectFlight.selectOneStopFlight();
		try 
		{
			Thread.sleep(9000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		selectFlight.proceedToBook();
		
		try 
		{
			Thread.sleep(8000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		ReviewDetails comparePrice=new ReviewDetails(driver);
		String leftSideFare = comparePrice.leftSideFare();
		String bottomSideFare = comparePrice.bottomSideFare();
		
		Assert.assertEquals(leftSideFare, bottomSideFare, "comparing price");
		
		GenericMethods.screenshot(driver);
		
		
		
		
	}
	
	
	
	

	@AfterTest
	public void teardown() 
	{
		driver.quit();
	}


}
