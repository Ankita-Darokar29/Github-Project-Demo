package testng.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 import utils.AppUtils;
public class SendMailTest extends AppUtils
{
	
	
	@Test
 public void checkSendMail()
  {
	   System.out.println("Send Mail testcase");
  }
  
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


}









