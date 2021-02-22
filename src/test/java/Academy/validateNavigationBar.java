package Academy;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class validateNavigationBar extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void basePageNavigation() throws IOException
	{
		
		
		LandingPage obj = new LandingPage(driver);
		//obj.getnavigationbar().isDisplayed();
		Assert.assertTrue(obj.getnavigationbar().isDisplayed());
		log.info("Successfully confirmed the text is present");
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	}

