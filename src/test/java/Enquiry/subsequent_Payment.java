package Enquiry;

import org.testng.annotations.Test;

import Elements.Subsequent;

public class subsequent_Payment extends Subsequent{
	
	
	@Test  (dependsOnMethods={"Enquiry.Enrolling_Student.Enrolling"})
	public void Subsequent_Payment() throws InterruptedException {
		
		Subsequent.scrollviewandclickSubsequentpayment(driver);
		
		Subsequent.enterstudentID(driver, Enrolling_Student.StruntID);
		
		Subsequent.scrollBy(driver, 0, 700);
		
		Subsequent.clickonNextbutton(driver);
		
		Subsequent.enteramountwithcashpayment(driver, "13000");
		
		Subsequent.scrollBy(driver, 0, 400);

		
		Subsequent.ClickonNextbuttonCa(driver);
		
		Subsequent.EntervalidationNo(driver);
		
		Subsequent.clickonpreviewandclosebutton(driver);
		
		Subsequent.clickonsaveanddonotprint(driver);
		
		Subsequent.printsubsequentReceipt(driver);
		
		
		
	}

}
