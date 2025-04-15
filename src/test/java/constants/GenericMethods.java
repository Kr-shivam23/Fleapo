package constants;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class GenericMethods 
{
	public static void javascriptExecutor(WebDriver driver, String scrollLength)
	{
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript(scrollLength);
	}
	
	public static void frames(WebDriver driver, String id)
	{
		driver.switchTo().frame(driver.findElement(By.id(id)));

	}
	
	public static void parentFrame(WebDriver driver)
	{
		driver.switchTo().parentFrame();

	}
	
	public static void screenshot(WebDriver driver)
	{
		TakesScreenshot screenshot=(TakesScreenshot) driver ;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File targetFile=new File("C:\\Users\\kshiv\\OneDrive\\画像\\Screenshots\\FlightPriceComparison.jpeg");
		try 
		{
			FileHandler.copy(sourceFile, targetFile);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
