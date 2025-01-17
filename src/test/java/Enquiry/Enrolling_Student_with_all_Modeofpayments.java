package Enquiry;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import Elements.Enrollement;
import Elements.Subsequent;

public class Enrolling_Student_with_all_Modeofpayments extends Enrollement {

	public static String StruntID;

	public static String ReceiptNo;

	public static String firstint;

	@Test(dependsOnMethods = {"Enquiry.Adding_college_level_Enquiry.Creating_college_level_Enquiry"})
	@Parameters({"Options"})
	public void Enrolling_with_All_ModeofPayments(String Modeofpayment) throws InterruptedException, IOException, AWTException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	//	="Cash";
		String BatchCode = "BDB00012";
		Enrollement.scrollviewandclickindividualstdt(driver);

		EnterEnquiryID(driver, Adding_college_level_Enquiry.id);

		Enrollement.clickNextbutton(driver);

		Enrollement.selectdropdownbytext(driver, " Batch Code ", BatchCode + " ");

		Enrollement.selectdropdownbytext(driver, "Type of Payment", "2 Installments ");

		firstint = Enrollement.firstinstallment(driver);

		Enrollement.selectingmodeofpayment(driver, Modeofpayment, firstint);

		Enrollement.selectdropdownbytext(driver, "Form Filled By", "Parents ");

		Enrollement.scrollBy(driver, 0, 500);

		Enrollement.clickon_Student_Signed_On_Rules_and_Regulations(driver);

		Enrollement.entervalidationNo(driver);

		Enrollement.clickonPreviewbutton(driver);

		String[] output = Enrollement.verifypreviewdetails(driver, Adding_college_level_Enquiry.Subcoursename,
				Adding_college_level_Enquiry.Name, Modeofpayment);
		String plceofsply = output[0];
		String FormGst = output[1];
		String Bank = output[2];
		List<String> text = Enrollement.amount_breakup(driver);

		Enrollement.scrollBy(driver, 0, 500);

		Enrollement.clickclosebutton(driver);

		Enrollement.click_On_Save_And_Print_Button(driver);

		String[] Results = StudentInfo(driver);

		StruntID = Results[0];
		ReceiptNo = Results[1];
		
			
	Enrollement.Click_Print_Receipt_Save_PDF_in_Project_Reposit(driver);
	
	/*String[] output1 = Enrollement.verifypreviewdetails(driver, Adding_college_level_Enquiry.Subcoursename,
			Adding_college_level_Enquiry.Name, Modeofpayment);
	String plceofsply1 = output1[0];
	String FormGst1 = output1[1];
	String Bank1 = output1[2]; */


		Enrollement.validatetheRecipt(driver,  StruntID, ReceiptNo, Adding_college_level_Enquiry.Subcoursename,
				Adding_college_level_Enquiry.Name, Adding_college_level_Enquiry.Address1,
				Adding_college_level_Enquiry.Address2, Adding_college_level_Enquiry.CityName,
				Adding_college_level_Enquiry.Statename, Adding_college_level_Enquiry.Pincode,
				Adding_college_level_Enquiry.MobileNumber, Modeofpayment, Adding_college_level_Enquiry.gst, plceofsply,
				FormGst, BatchCode, Bank, text);
           
	}

}