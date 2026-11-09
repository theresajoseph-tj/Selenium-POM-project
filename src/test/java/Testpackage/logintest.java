package Testpackage;

import org.testng.annotations.Test;

import pagepackage.loginpage;

public class logintest extends baseclass{

	@Test
	
	public void exe()
	{
		loginpage ob = new loginpage(driver);
		ob.starts("standard_user","secret_sauce");
		ob.login();
	}
}
