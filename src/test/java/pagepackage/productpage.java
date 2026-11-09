package pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productpage
{
	By addtocart = By.id("add-to-cart"); 
	WebDriver driver;
	
	public productpage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void addtocart()
	{
		driver.findElement(addtocart).click();
	}
}
