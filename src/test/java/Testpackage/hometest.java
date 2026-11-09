package Testpackage;

import org.testng.annotations.Test;
import pagepackage.homepage;
import pagepackage.loginpage;

public class hometest extends baseclass {

@Test
public void exe() throws InterruptedException
{
	loginpage ob = new loginpage(driver);
	ob.starts("standard_user","secret_sauce");
	ob.login();
	
	Thread.sleep(3000);
	
	homepage home = new homepage(driver); 
	System.out.println("before backpack click");
	home.clickbackpack();

}


}

