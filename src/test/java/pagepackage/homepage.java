package pagepackage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class homepage {

	By backpack = By.linkText("Sauce Labs Backpack");
	
	WebDriver driver;
	
	public homepage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void clickbackpack()
	{
		driver.findElement(backpack).click();
	}
}
