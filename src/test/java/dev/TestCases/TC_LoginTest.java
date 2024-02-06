package dev.TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
import dev.PageObjects.LoginPage;
import dev.PageObjects.RefundScreenObjects;

public class TC_LoginTest extends DevBase
{
	@Test(priority=3)
	public void loginTest() throws InterruptedException
	{
		driver.get(basicURl);
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.getTextInfo();
			
		lp.setUserName(uname);
		logger.info("Entered username"); 
		
		lp.setPassword(password);
		logger.info("Entered password"); 
		
		lp.clickSubmit();	
		logger.info("Clicked on Submit button"+'\n'+
				"---------------------------------------------------------------------");
		
		String title = driver.getTitle();
		System.out.println("Title of page : "+title);
	//	Assert.assertEquals(title, "Applications | Welcome","Incorrect credentials so loginTest is failed ==");
		logger.info("Welcome to Nogin dashboard !!! "+'\n'+"Login Test is completed ! "+'\n'+
				"---------------------------------------------------------------------");
		
	}
	
	
}
