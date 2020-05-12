package regression;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2
{
	@Test
    public void validateTitles()
    {
    	String expected_title= "Yahoo.com";
    	//String actual_title= "Gmail.com";
    	String actual_title = "Yahoo.com";
    	//AssertJUnit.assertEquals(actual_title, expected_title, "Title not matching");
    	AssertJUnit.assertEquals(actual_title, expected_title, "Title matching");
    	
    	AssertJUnit.assertTrue(true);
        
    	//Assert.fail("Failing test case default");
    			
    	/* To report multiple failures
    	SoftAssert sfa = new SoftAssert();
    	
    	System.out.println("Image are matching");
    	sfa.assertEquals(true, false, "image missing");
    	
    	System.out.println("Boxes are same");
    	sfa.assertEquals(false, true, "Boxes are missing");
    	
    	sfa.assertAll();*/
    }
}
