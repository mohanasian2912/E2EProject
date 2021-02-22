package Academy;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;
import org.apache.logging.log4j.*;
public class ValidateTitle extends base {
	public WebDriver driver;
	LandingPage obj;
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		log.info("Browser is initialized");
		driver.get(prop.getProperty("url"));
		
	}

	@Test
	public void basePageNavigation() throws IOException
	{
		
		
		obj = new LandingPage(driver);
		assertEquals(obj.gettitle().getText(), "FEATURED COURSES");
		log.info("Succesfully confirmed the test presentation");
		
	}	
	

	@Test
	public void validateheader() throws IOException
	{
		
		
		
		assertEquals(obj.getheader().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
		log.info("Succesfully confirmed the header");
		
	}	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	}

