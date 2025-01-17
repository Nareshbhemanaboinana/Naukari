package Enquiry;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Elements.Enrollement;
import Elements.PrintOriginalReceipt;

public class Receipt_Reprint extends PrintOriginalReceipt{
	
	@Test(dependsOnMethods= {"Enquiry.Enrolling_Student.Enrolling"})

	public void Receipt_Re_print() throws InterruptedException, IOException {
		
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		PrintOriginalReceipt.Scrollviewandclickstudent(driver);
		
		PrintOriginalReceipt.enterstunetID(driver,Enrolling_Student.StruntID );
		

		PrintOriginalReceipt.scrollBy(driver, 0, 500);
		
		PrintOriginalReceipt.clickSearchbutton(driver);
		
		PrintOriginalReceipt.clickReceiptReprint(driver);
		
		//PrintOriginalReceipt.clickPrintOriginalReceipt(driver);
		
		PrintOriginalReceipt.selectdropdownbytext(driver, "Receipt Number", Enrolling_Student.ReceiptNo);
		
		PrintOriginalReceipt.clickprintbutton(driver);
		
		PrintOriginalReceipt.validatesuccesspopup(driver);
		
		String[] output = Enrollement.verifypreviewdetails(driver, "Finance",
				"Naresh", "Cash");
		String plceofsply = output[0];
		String FormGst = output[1];
		String Bank = output[2];
		List<String> text = Enrollement.amount_breakup(driver);

		Enrollement.validatetheRecipt(driver,  Enrolling_Student.StruntID, Enrolling_Student.ReceiptNo, Adding_college_level_Enquiry.Subcoursename,
				Adding_college_level_Enquiry.Name, Adding_college_level_Enquiry.Address1,
				Adding_college_level_Enquiry.Address2, Adding_college_level_Enquiry.CityName,
				Adding_college_level_Enquiry.Statename, Adding_college_level_Enquiry.Pincode,
				Adding_college_level_Enquiry.MobileNumber, Enrolling_Student.Modeofpayment, Adding_college_level_Enquiry.gst, plceofsply,
				FormGst, Enrolling_Student.BatchCode, Bank, text);
           

	}

}



