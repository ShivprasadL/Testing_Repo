package dev.TestCases;

import org.openqa.selenium.WindowType;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dev.PageObjects.RefundScreenObjects;

public class refundScreenTesting extends TC_LoginTest
{
	@Test(priority=1,dataProvider="entireOrderData")
	public void refundScreen(String a,String b,String c) throws InterruptedException
	{	
		driver.switchTo().newWindow(WindowType.TAB);
		driver.getWindowHandle();
		driver.get("https://dev4-encore.brandedonline.com/vapps/csr/Order/OrderRefund?orderId=659113");
		//logger.info("URL is opened");
				
		RefundScreenObjects rs = new RefundScreenObjects(driver);
		
		Thread.sleep(4000);
		rs.refundAmountOnEntireOrder(a);
		
		rs.refundShipppingAmount(b);
		
		rs.refundReasonEnumId();
		
		rs.CreateOrderRefund_note(c);
		
		rs.submitButtonEntireOrder();
		Thread.sleep(4000);
		
	}
	

	
	@DataProvider(name="entireOrderData")
	public String [][] getTestdata (){
	String [][] data = {{"2","0","abc"},{"12","0","pqr"},{"5","0","xyz"}};
	return data;
		
	}
}
