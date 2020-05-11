package regression;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Author: Swati Kamat
public class TestCase1 
{   
	@BeforeTest
	public void creatingDBConnection()
	{
		System.out.println("creatingDBConnection");
	}
	
	
	@AfterTest	public void closingDBConnection()
	{
		System.out.println("closingDBConnection");
	}
	@BeforeMethod
	
	public void lunchBrowser()
	{
		System.out.println("Lanching browser");
	}
	
	@Test(priority=2)
     public void doLogin()
     {
    	 System.out.println("Executing login test");
     }
	
	@Test(priority=1)
	public void doUserReg()
	{
		System.out.println("Executing User Regestration test");
	}
	
	@AfterMethod
	
	public void closeBrowser()
	{
		System.out.println("Closing browser");
	}
	
}
