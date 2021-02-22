package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.ForgotPassword;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class HomePage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		
	}

	@Test(dataProvider="getdata")
	public void basePageNavigation(String username, String password) throws IOException
	{
		
		driver.get(prop.getProperty("url"));
		LandingPage obj = new LandingPage(driver);
		LoginPage obj1 = obj.getloing();
		
		
		obj1.getemail().sendKeys(username);
		obj1.getpassword().sendKeys(password);
		obj1.getlogin().click();
		log.info("Successfully Home tests are passed");
		ForgotPassword fp = obj1.forgotPassword();
		fp.getemail().sendKeys("xxxxx");
		fp.sendMeInstructions().click();
	}	
		@DataProvider
		public Object[][] getdata()
		{
			Object[][] data = new Object[2][2];
			
			data[0][0]="nonrestricteduser";
			data[0][1]="12345";
			
			data[1][0]="restricteduser";
			data[1][1]="12345";
			
			return data;
			
		}
		
		@AfterTest
		public void teardown()
		{
			driver.close();
		}
	}

