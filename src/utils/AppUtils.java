package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AppUtils 

{
  	@BeforeTest
	 
	public void login()
	{
	System.out.println("GMail Login");
    }
     @AfterTest 
	
    public void logout()
    {
    	System.out.println("GMail Logout");
    }
@BeforeSuite
public void launchGmail()
{
	System.out.println("launch Gmail App");

}
@AfterSuite
public void closeGmail()
{
	
System.out.println("close Gmail App");
}
}
