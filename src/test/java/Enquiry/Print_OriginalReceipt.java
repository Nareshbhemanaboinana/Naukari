package Enquiry;

import java.io.IOException;

import org.testng.annotations.Test;

import Elements.PrintOriginalReceipt;

public class Print_OriginalReceipt extends PrintOriginalReceipt{
	
	
	@Test(dependsOnMethods= {"Enquiry.Enrolling_Student.Enrolling"})
	public void Print_Original_Receipt() throws InterruptedException, IOException {
		
		
		PrintOriginalReceipt.Scrollviewandclickstudent(driver);
		
		PrintOriginalReceipt.enterstunetID(driver,Enrolling_Student.StruntID );
		
		PrintOriginalReceipt.scrollBy(driver, 0, 500);
		
		PrintOriginalReceipt.clickSearchbutton(driver);
		
		PrintOriginalReceipt.clickReceiptReprint(driver);
		
		PrintOriginalReceipt.clickPrintOriginalReceipt(driver);
		
		PrintOriginalReceipt.selectdropdownbytext(driver, "Receipt Number", Enrolling_Student.ReceiptNo);
		
		PrintOriginalReceipt.clicktatandcpotypastvalidationNo(driver);
		
		PrintOriginalReceipt.clickprintbutton(driver);
		
		PrintOriginalReceipt.validatesuccesspopup(driver);
		
		PrintOriginalReceipt.validatereceiptdetails(driver, Enrolling_Student.ReceiptNo);
		
	}

}
