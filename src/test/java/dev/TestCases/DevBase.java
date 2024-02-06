package dev.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.PageObjects.LoginPage;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DevBase {
	
	public String basicURl = "https://dev4-encore.brandedonline.com/";
	public String uname = "rahul";
	public String password = "asd@1234";
	public WebDriver driver;
	public Logger logger;
	
	@BeforeMethod
	public void setUp()
	{	
		logger = Logger.getLogger("encore");
		PropertyConfigurator.configure("log4j.properties");

		ChromeOptions options = new ChromeOptions();		
		options.addArguments("--disable-notifications");				//used to disable notifications
		driver = new ChromeDriver(options);
		
		driver.get(basicURl);
		logger.info("URL is opened");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	}
//	@Test(priority=2)
//	public void login()
//	{
		LoginPage lp = new LoginPage(driver);
		
		lp.getTextInfo();
			
		lp.setUserName(uname);
		logger.info("Entered username"); 
		
		lp.setPassword(password);
		logger.info("Entered password"); 
		
		lp.clickSubmit();		
	}
		
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}

}
