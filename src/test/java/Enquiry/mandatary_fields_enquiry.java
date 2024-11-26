package Enquiry;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Elements.College_Enquiry;

public class mandatary_fields_enquiry extends College_Enquiry {
	
	
	@Test
	public void mandatary_fields_creating_enquiry() throws InterruptedException
	{
		
		College_Enquiry.scrollviewandclickcollege_level_Enquiry(driver);
		
		College_Enquiry.selectdropdownbytext(driver, "Choose the Year for Joining", " 2024 ");
		
		College_Enquiry.EnterName(driver, "Mahesh");
		
		College_Enquiry.EnterMobilenumber(driver, "9988771234");
		
		College_Enquiry.scrollBy(driver, 0, 1000);
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Other Details']")).click();
		
		College_Enquiry.clickSaveanEnquiry(driver);
		
	}
}
