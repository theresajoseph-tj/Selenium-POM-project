package pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {

	By username = By.id("user-name");
	By password = By.id("password");
	By loginbtn = By.id("login-button");
	
	WebDriver driver;
	
	public loginpage(WebDriver driver)
	{
		this.driver = driver;
	}
	 
	public void starts(String user,String pass)
	{
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		
	}
	
	public void login()
	{
		driver.findElement(loginbtn).click();
}
}