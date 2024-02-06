package dev.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RefundScreenObjects {
	
	WebDriver driver;
	public RefundScreenObjects(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id="CreateOrderRefund_refundAmountOnEntireOrder")
	@CacheLookup
	WebElement entireOrder;
	
	@FindBy(id="CreateOrderRefund_refundShipppingAmount")
	@CacheLookup
	WebElement shipppingAmount;
	
	@FindBy(id="select2-CreateOrderRefund_refundReasonEnumId-container")
	@CacheLookup
	WebElement ReasonEnumId;
	
	@FindBy(xpath = "//li[normalize-space()='02 Defective']")
	WebElement select ;
	
	@FindBy(id="CreateOrderRefund_note")
	@CacheLookup
	WebElement note;
	
	@FindBy(id="CreateOrderRefund_submitButton")
	@CacheLookup
	WebElement submitButton;
	
	public void refundAmountOnEntireOrder(String orderAmount)
	{
		
		entireOrder.sendKeys(orderAmount);
	}
	
	public void refundShipppingAmount(String shippingAmount)
	{
		shipppingAmount.sendKeys(shippingAmount);
	}
	
	public void refundReasonEnumId()
	{
		ReasonEnumId.click();
		select.click();
		
	}
	
	public void CreateOrderRefund_note(String enterNote)
	{
		note.sendKeys(enterNote);
	}
	
	public void submitButtonEntireOrder()
	{
		submitButton.click();
	}
	
}
