package Enquiry;

import org.testng.annotations.Test;

import Elements.Misc_feeCollection;

public class Misc_Fee_Colletion_With_StudentID extends Misc_feeCollection {
	
	@Test(dependsOnMethods={"Enquiry.Enrolling_Student.Enrolling"})
	public void Misc_Fee_Colletions () throws InterruptedException {
		
		
		Misc_feeCollection.ScrollViewAndClickMissFeeCollection(driver);
		
		Misc_feeCollection.EnterStudentID(driver, Enrolling_Student.StruntID);
		
		Misc_feeCollection.scrollBy(driver, 0, 500);
		
		Misc_feeCollection.ClickOnNextButton(driver);
		
		Misc_feeCollection.selectdropdownbytext(driver, "Place of Supply", " Andhra Pradesh ");
		
		Misc_feeCollection.selectdropdownbytext(driver, "Towards", " ISB Application - 4000 ");

		Misc_feeCollection.selectdropdownbytext(driver, "Mode of Payment", "Cash");
		
		Misc_feeCollection.ClickOnOthersButton(driver);
		
		Misc_feeCollection.CopyPastValidationNo(driver);
		
		Misc_feeCollection.ClickPreviewandClose(driver);
		
		Misc_feeCollection.ClickSaveandPrint(driver);
		
		Misc_feeCollection.printReceiptDetails(driver);
		
		
	}


}
