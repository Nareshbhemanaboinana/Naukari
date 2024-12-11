package Enquiry;

import org.testng.annotations.Test;

import Elements.Enrollement;
import Elements.Refund;

public class Refund_Request extends Refund {

//	@Test(dependsOnMethods = { "Enquiry.Enrolling_Student.Enrolling" })
	@Test
	public void REfund_request() throws InterruptedException {

		int amount = 2790;

		String StudentID = Enrolling_Student.StruntID;

		Refund.viewandclickstudentprofile(driver);

		Refund.clickRefunftab(driver);
		 
	//	Refund.enterstudentID(driver, StudentID);
		Refund.enterstudentID(driver, "JRHTB4A007");

		Refund.enterRemaks(driver);

		Enrollement.selectdropdownbytext(driver, "Refund Type", "part Refund ");

		Refund.EnterRefundAmount(driver, amount);
		
		Enrollement.selectdropdownbytext(driver, "Reason for Refund", "Student's Behavioural Issues ");


		Enrollement.selectdropdownbytext(driver, "To be Authorized", "Jaipur_Admin ");

		Refund.scrollBy(driver, 0, 500);

		Refund.clickSaveButton(driver);

		Refund.LogOutCounsellor(driver);

		Refund.LoginAdmin(driver, "Jaipur_Admin", "Admin@123");

		Refund.viewandclickstudentmngnt(driver);

		Refund.clickstudentprocesstab(driver);

		Refund.enterStdntIDandclickviewicon(driver, StudentID);

	}

}
