package Enquiry;

import java.awt.AWTException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

import Elements.Enrollement;
import Elements.Subsequent;

public class Combo_Course_Student extends Enrollement {

	public static String StruntID;

	public static String ReceiptNo;

	public static String firstint;

	//@Test(dependsOnMethods = { "Enquiry.Adding_college_level_Enquiry.Creating_college_level_Enquiry" })
	@Test
	public void Combo_Course_Enrolling() throws InterruptedException, IOException, AWTException {
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String Modeofpayment = "DD/Cheque";

		String BatchCode = "BCD0001";
		Enrollement.scrollviewandclickindividualstdt(driver);

	//	EnterEnquiryID(driver, Adding_college_level_Enquiry.id);
		
		EnterEnquiryID(driver, "GSHT270014");

		Enrollement.scrollBy(driver, 0, 400);

		Enrollement.clickNextbutton(driver);
	
		Enrollement.selectdropdownbytext(driver, "Single", "Combo");

		Enrollement.selectdropdownbytext(driver, "Select", "LAW + AI");

		Enrollement.selectdropdownbytext(driver, " Batch Code 1", " LLB.02 ");
		
		Enrollement.selectdropdownbytext(driver, " Batch Code 2", " AI.01 ");

		Thread.sleep(3000);
		Enrollement.scrollBy(driver, 0, 500);
		Enrollement.scrollBy(driver, 0, 500);


	       
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=' Modify Payment Schedule ']")));

	        // Click the element

	        // Click the element
	        element.click();
		//driver.findElement(By.xpath("//*[text()=' Modify Payment Schedule ']")).click();
		
		driver.findElement(By.xpath("//*[@src='assets/images/times/add.png']")).click();
		
		driver.findElement(By.xpath("//*[@src='assets/images/times/add.png']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@type='number'])[0]")).sendKeys("1");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@type='number'])[1]")).sendKeys("24000");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@type='number'])[2]")).sendKeys("2");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//*[@type='number'])[3]")).sendKeys("25000");
		
		  LocalDate currentDate = LocalDate.now();
	      

	    
	        LocalDate dateAfter30Days = currentDate.plusDays(30);
	        
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		
		driver.findElement(By.xpath("(//*[@aria-haspopup='dialog'])[2]")).sendKeys(currentDate.format(formatter));
		driver.findElement(By.xpath("(//*[@aria-haspopup='dialog'])[4]")).sendKeys(dateAfter30Days.format(formatter));

		firstint = Enrollement.firstinstallment(driver);

		Enrollement.selectingmodeofpayment(driver, Modeofpayment, firstint);
		
		Enrollement.scrollBy(driver, 0, 200);


		Enrollement.selectdropdownbytext(driver, "Form Filled By", "Parents ");

		Enrollement.scrollBy(driver, 0, 500);

		Enrollement.clickon_Student_Signed_On_Rules_and_Regulations(driver);

		Enrollement.entervalidationNo(driver);

		Enrollement.clickonPreviewbutton(driver);

		// String[] output =
		Enrollement.verifypreviewdetails(driver, Adding_college_level_Enquiry.Subcoursename,
				Adding_college_level_Enquiry.Name, Modeofpayment);
		// String plceofsply = output[0];
		// String FormGst = output[1];
		// String Bank = output[2];
		// List<String> text = Enrollement.amount_breakup(driver);

		Enrollement.scrollBy(driver, 0, 500);

		Enrollement.clickclosebutton(driver);

		Enrollement.click_On_Save_And_Print_Button(driver);

		String[] Results = StudentInfo(driver);

		StruntID = Results[0];
		ReceiptNo = Results[1];

		Subsequent.Click_Print_Receipt_Button(driver);

		/*
		 * 
		 * Enrollement.Click_Print_Receipt_Save_PDF_in_Project_Reposit(driver);
		 * 
		 * Enrollement.validatetheRecipt(driver, StruntID, ReceiptNo,
		 * Adding_college_level_Enquiry.Subcoursename,
		 * Adding_college_level_Enquiry.Name, Adding_college_level_Enquiry.Address1,
		 * Adding_college_level_Enquiry.Address2, Adding_college_level_Enquiry.CityName,
		 * Adding_college_level_Enquiry.Statename, Adding_college_level_Enquiry.Pincode,
		 * Adding_college_level_Enquiry.MobileNumber, Modeofpayment,
		 * Adding_college_level_Enquiry.gst, plceofsply, FormGst, BatchCode, Bank,
		 * text);
		 */
	}

}