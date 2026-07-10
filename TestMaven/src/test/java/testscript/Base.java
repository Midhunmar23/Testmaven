package testscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utility.Screenshotutility;

public class Base 
{
	
	
	   public WebDriver driver;
	   
	   @Parameters("browser")
	    @BeforeMethod(alwaysRun = true)
	    public void intilizeBrowser(String browser) throws Exception
	    {
	    	if(browser.equalsIgnoreCase("Chrome"))
	    	{
	    		driver = new ChromeDriver();
	    	}
	    	
	    	else if(browser.equalsIgnoreCase("FireFox"))
	    	{
	    		driver = new FirefoxDriver();
	    	}
	    	
	    	else
	    	{
	    		throw new Exception("No Connected");
	    	}
	    	
	    	driver.get("https://practicetestautomation.com/practice-test-login/");
	    	driver.manage().window().maximize();
	    }
	    
	    @AfterMethod
	    public void closeBrowser(ITestResult iTestresult) throws IOException
	    {
	    	//driver.quit();
	    	
	    	if(iTestresult.getStatus() == ITestResult.FAILURE)
	    	{
	    		Screenshotutility  scrShot= new Screenshotutility();
	    		scrShot.getScreenshot(driver, iTestresult.getName());
	    	}
	    }

}
