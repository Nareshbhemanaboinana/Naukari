package Enquiry;

import org.testng.annotations.Test;

import Elements.Enrollement;
import Elements.Refund;

public class Refund_Request extends Refund {

	//@Test(dependsOnMethods = { "Enquiry.Enrolling_Student.Enrolling" })
	@Test
	public void REfund_request() throws InterruptedException {

		int amount = 2790;
		
		String RefundType="part Refund";

	/*	String StudentID = Enrolling_Student.StruntID;

		Refund.viewandclickstudentprofile(driver);

		Refund.clickRefunftab(driver);
		 
	//	Refund.enterstudentID(driver, StudentID);
		Refund.enterstudentID(driver, "AGHTB4A011");


		Refund.enterRemaks(driver);

		Enrollement.selectdropdownbytext(driver, "Refund Type", RefundType+" ");

		Refund.EnterRefundAmount(driver, amount);
		
		Enrollement.selectdropdownbytext(driver, "Reason for Refund", "IIM Call Getter Discount ");
      

		Enrollement.selectdropdownbytext(driver, "To be Authorized", "Agra_Admin ");

		Refund.scrollBy(driver, 0, 500);

		Refund.clickSaveButton(driver);*/

		Refund.LogOutCounsellor(driver);

		Refund.LoginAdmin(driver, "Agra_Admin", "Admin@123");

		Refund.viewandclickstudentmngnt(driver);

		Refund.clickstudentprocesstab(driver);

	//	Refund.enterStdntIDandclickviewicon(driver, StudentID);
		Refund.enterStdntIDandclickviewicon(driver, "AGHTB4A011");
		
		Refund.enter_amount_approving_againest(driver,amount);
		
		Refund.click_on_radio_button(driver, " Cash ");
		
		Enrollement.selectdropdownbytext(driver, "To be Authorized", "Place of Supply");

		driver.navigate().back();
		
		Refund.enter_student_ID(driver, "AGHTB4A011");

		Refund.click_search_button(driver);
		
		Refund.click_profile_validate_refund_details(driver, amount, RefundType);
		

		
	}

}
