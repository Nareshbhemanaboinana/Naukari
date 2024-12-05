package Enquiry;


import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Elements.Subsequent;

public class subsequent_Payment extends Subsequent{
	
	
//	@Test  (dependsOnMethods={"Enquiry.Enrolling_Student.Enrolling"})
	@Test
	public void Subsequent_Payment() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String[] Payements = { "Cash","DD/Cheque","Credit Card","NEFT","RTGS","Direct Transfer to Bank","TDS","Others"};
		
		for(String Payement:Payements) {
		
		Subsequent.scrollviewandclickSubsequentpayment(driver);
		
		//Subsequent.enterstudentID(driver, Enrolling_Student.StruntID);
		
		Subsequent.enterstudentID(driver, "CCHTB4A033");

		
		Subsequent.scrollBy(driver, 0, 700);
		
		Subsequent.clickonNextbutton(driver);
		
		Subsequent.selectingmodeofpayment(driver, Payement, "2000");
				
		Subsequent.scrollBy(driver, 0, 400);
		
		Subsequent.ClickonNextbuttonCa(driver);
		
		Subsequent.EntervalidationNo(driver);
		
		Subsequent.clickonpreviewandclosebutton(driver);
		
		Subsequent.clickonsaveandprint(driver);
		
		Subsequent.printsubsequentReceipt(driver);
	
		driver.navigate().refresh();
				
		}
		
	}

}
