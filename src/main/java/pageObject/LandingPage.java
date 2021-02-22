package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	private By signin = By.cssSelector("a[href='https://rahulshettyacademy.com/sign_in/']");
	private By title = By.cssSelector(".text-center>h2");
	private By NavBar = By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	private By header = By.cssSelector("div[class*='video-banner'] h3");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public LoginPage getloing()
	{
		driver.findElement(signin).click();
		LoginPage obj1 = new LoginPage(driver);
		return obj1;
	}
	
	public WebElement gettitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement getnavigationbar()
	{
		return driver.findElement(NavBar);
	}
	
	public WebElement getheader()
	{
		return driver.findElement(header);
	}

}
