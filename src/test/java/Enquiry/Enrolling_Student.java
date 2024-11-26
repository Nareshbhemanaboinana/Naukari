package Enquiry;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Elements.Enrollement;


public class Enrolling_Student extends Enrollement {
	
	public static String StruntID;
	
	public static String ReceiptNo;
	
	public static String firstint;

  
	
	@Test(dependsOnMethods = {"Enquiry.Adding_college_level_Enquiry.Creating_college_level_Enquiry"})
	
	public void Enrolling() throws InterruptedException, IOException, AWTException {
	
    	String Modeofpayment="Cash";
	Enrollement.scrollviewandclickindividualstdt(driver);
	
  EnterEnquiryID(driver, Adding_college_level_Enquiry.id);
 
  
	Enrollement.clickNextbutton(driver);
	
	Enrollement.selectdropdownbytext(driver, " Batch Code ", "BCD0001 ");
	
	Enrollement.selectdropdownbytext(driver, "Type of Payment", "2 Installments ");
	
	 firstint=Enrollement.firstinstallment(driver);
	
	Enrollement.selectingmodeofpayment(driver, Modeofpayment, firstint);
	
	Enrollement.selectdropdownbytext(driver, "Form Filled By", "Parents ");

	Enrollement.scrollBy(driver, 0, 500);
	
	Enrollement.clickon_Student_Signed_On_Rules_and_Regulations(driver);
	
	Enrollement.entervalidationNo(driver);
	
	Enrollement.clickonPreviewbutton(driver);
	
	//Enrollement.verifypreviewdetails(driver, Adding_college_level_Enquiry.Subcoursename, Adding_college_level_Enquiry.Name,Modeofpayment);

	Enrollement.scrollBy(driver, 0, 500);

	Enrollement.clickclosebutton(driver);
	
	Enrollement.click_On_Save_And_Print_Button(driver);
	
	
	String[] Results= StudentInfo(driver);
	
	StruntID=Results[0];
	ReceiptNo=Results[1];
	
    String pathfile = "C:\\selenium\\TEEMS_3.0\\TeemsReceipt.pdf";

    // Copy file path to clipboard
    Toolkit.getDefaultToolkit().getSystemClipboard()
            .setContents(new java.awt.datatransfer.StringSelection(pathfile), null);

	Thread.sleep(2000);

	driver.findElement(By.xpath("//button[text()='Print Receipt']")).click();

	  WebDriverWait wait=new WebDriverWait(driver,25);
	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-simple-snack-bar-content']")));

	WebElement Approve =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
	

			String Approve1 = Approve.getText();

     
	            if (Approve1.contains("Data saved successfully!!!")) {
					System.out.println(Approve1);   

	            	
	            }
	            else {
	            	System.out.println("Massage:"+ Approve1);
			          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

	            }
	            
	        	Thread.sleep(8000);

	Robot robot = new Robot();
    robot.delay(2000); // Wait for the print dialog to open

    // Navigate to "Save as PDF" option in the Destination dropdown (may vary by system)
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);
    robot.delay(500);
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);
    robot.delay(500);
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);
    robot.delay(500);
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);
    robot.delay(500);
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);
    robot.delay(500);
 
  
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    robot.delay(500);

    robot.keyPress(KeyEvent.VK_DOWN); // Move down in the dropdown to select "Save as PDF"
    robot.keyRelease(KeyEvent.VK_DOWN);
    robot.delay(500);
    

    robot.keyPress(KeyEvent.VK_ENTER); // Confirm selection
    robot.keyRelease(KeyEvent.VK_ENTER);
    robot.delay(500);
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);
    robot.delay(500);  
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);
    robot.delay(500); 
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);
    robot.delay(500); 
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);
    robot.delay(500);
    // Press Enter to "Print" or "Save" the PDF
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    robot.delay(500);
    // Press Enter to confirm
    
    robot.delay(500); 

    robot.keyPress(KeyEvent.VK_BACK_SPACE);
    robot.keyRelease(KeyEvent.VK_BACK_SPACE);
    robot.delay(500); 
 
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.delay(500); 


     robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);
    robot.delay(500); 

    robot.delay(500); 
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);
    robot.delay(500); 
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);
    robot.delay(500); 

    // Press Enter to "Print" or "Save" the PDF
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);


    // Wait for the file to download
    Thread.sleep(3000);


 
	
//	Enrollement.clickprintbutonanddownloadpdffile(driver);
	
	Enrollement.validatetheRecipt(driver, pathfile, StruntID, ReceiptNo, Adding_college_level_Enquiry.Subcoursename,
			Adding_college_level_Enquiry.Name,Adding_college_level_Enquiry.Address1,Adding_college_level_Enquiry.Address2,
			Adding_college_level_Enquiry.CityName,Adding_college_level_Enquiry.Statename,Adding_college_level_Enquiry.Pincode,
			Adding_college_level_Enquiry.MobileNumber);
	
	
	
	
	
	
	

		
	}
	
	
	
}