package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	By signin = By.cssSelector("a[href='https://rahulshettyacademy.com/sign_in/']");
	By email = By.cssSelector("[id='user_email']");
	By password = By.cssSelector("[id='user_password']");
	By login = By.cssSelector("input[value='Log In']");
	By forgotPassword = By.cssSelector("[href*='password/new']");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public ForgotPassword forgotPassword()
	{
		driver.findElement(forgotPassword).click();
		return new ForgotPassword(driver);
		
	}

	public WebElement getloing()
	{
		return driver.findElement(signin);
	}
	
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getlogin()
	{
		return driver.findElement(login);
	}
}
