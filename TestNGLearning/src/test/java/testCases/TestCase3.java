package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 
{
    @Test(priority=2, dependsOnMethods="doUserRegistration")
    public void doLogin()
    {
    	System.out.println("Execuing login");
    }
    
    @Test(priority=1)
    public void doUserRegistration()
    {
    	System.out.println("Executing user registration");
    	Assert.assertTrue(true, "User is registred");
    	//Assert.fail("User is not registered");

    }
}
