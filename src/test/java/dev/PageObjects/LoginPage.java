package dev.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//p[normalize-space()='Enter your username and password to sign in']")
	@CacheLookup
	WebElement text;
	
	@FindBy(id="login_form_username")
	@CacheLookup
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Sign in']")
	@CacheLookup
	WebElement signin_button;
	
	public void setUserName(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		signin_button.click();
	}
	
	public void getTextInfo()
	{
		String TextInformation =text.getText();
		System.out.println("Text before sign in - " +TextInformation);
		Assert.assertEquals(TextInformation,"Enter your username and password to sign in","title is not matching");	
	}

}
