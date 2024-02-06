package dev.TestCases;
import org.testng.annotations.Test;
import org.testng.Assert;

import dev.PageObjects.LoginPage;

public class LoginPageTesting extends DevBase{
	
	@Test(priority=1)
	public void VerfiyLoginPageTitleTest()
	{	
		driver.get(basicURl);
		logger.info("URL is opened");
		
		String titleLogin = driver.getTitle();
		System.out.println("Title of page : "+titleLogin);
		Assert.assertEquals(titleLogin, "Webroot - Applications","PageTitle not match");
		logger.info("Login page is verified !!! "+'\n'+
				"---------------------------------------------------------------------");
	}
	
	@Test(priority=2)
	public void VerifyTextOnPageTest()
	
	{	
		driver.get(basicURl);
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.getTextInfo();
		logger.info("Text on Login page is verified !!! "+'\n'+
				"---------------------------------------------------------------------");
		
	}
	
}
