package Enquiry;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Elements.Subsequent;

public class subsequent_Payment_With_Discount_and_all_ModeofPayments extends Subsequent{
	
	

	@Test  (dependsOnMethods={"Enquiry.Enrolling_Student.Enrolling"})
	public void Subsequent_Payment_with_discount() throws InterruptedException, AWTException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String[] Payements = { "Cash","DD/Cheque","Credit Card","NEFT","RTGS","Direct Transfer to Bank","TDS","Others"};
		int i=1;

		for(String Payement:Payements) {

		Subsequent.scrollviewandclickSubsequentpayment(driver);
		
		Subsequent.enterstudentID(driver, Enrolling_Student.StruntID);
		
	
		
		Subsequent.scrollBy(driver, 0, 700);
		
		Subsequent.clickonNextbutton(driver);
		
		Subsequent.selectingmodeofpayment(driver, Payement, "2000");
					
		Subsequent.scrollBy(driver, 0, 400);
		
		Subsequent.enterdiscountdetails(driver, "125");
		
		Subsequent.scrollBy(driver, 0, 400);
  
		Subsequent.ClickonNextbuttonCa(driver);
		
		Subsequent.EntervalidationNo(driver);
		
		Subsequent.clickonpreviewandclosebutton(driver);
		
		Subsequent.clickonsaveandprint(driver);
		
		Subsequent.printsubsequentReceipt(driver);
	
		
		Subsequent.Click_Print_Receipt_Button(driver);
		i++;

		
		if(i<9) {
			Subsequent.scrollBy(driver, 0, 400);

	     driver.findElement(By.xpath("//*[text()=' Close ']")).click();

		driver.navigate().refresh();

		}
		else {
		String discount=driver.findElement(By.xpath("(//td[@class='table-border'])[5]")).getText();
		System.out.println("displaying discount is :"+discount);
		if(discount.equalsIgnoreCase("1000.00")) {
			System.out.println("Test is Pass");
		}
		else {
	          throw new RuntimeException("Test failed because Discount amount is not displaying or discount amount is miss match");

		}
		}
		}
	
	}

}



