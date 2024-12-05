package Enquiry;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Elements.College_Enquiry;

public class Adding_college_level_Enquiry extends College_Enquiry {

	public static String id;

	public static String Name;

	public static String Email;

	public static String dateofbith;

	public static String gst;

	public static String Subcoursename = "Finance";

	public static String coursename = "MBA";

	public static String chooseyr = " 2027 ";

	public static String Address2;
	
	public static String Address1 ="Hyderabad";

	public static String Pincode;
	
	public static String Statename= "Telangana";
	
	public static String CityName="hyderabad";
	
	public static String  MobileNumber;
			

	@Test
	public void Creating_college_level_Enquiry() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Faker fk = new Faker();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String gstNumber = fk.regexify("[A-Z0-9]{16}"); // Example: Generate a 12-character alphanumeric string
		 MobileNumber = fk.number().digits(9); // Example: Generate an 8-digit number
		String TelephoneNumber = fk.number().digits(9); // Example: Generate an 8-digit number

		Pincode=fk.number().digits(6);
		Address2 = fk.address().fullAddress();

		int numdate = fk.number().numberBetween(1, 31);

		dateofbith = numdate+"/07/1994";
		gst = gstNumber;

		Name = fk.name().firstName();
		Email = Name + "@yopmail.com";

		College_Enquiry.scrollviewandclickcollege_level_Enquiry(driver);

		College_Enquiry.selectdropdownbytext(driver, "Choose the Year for Joining", chooseyr);

		College_Enquiry.EnterName(driver, Name);

		College_Enquiry.EnterMobilenumber(driver, MobileNumber);

		College_Enquiry.Entertelephonenumber(driver, TelephoneNumber);

		College_Enquiry.scrollBy(driver, 0, 250);

		College_Enquiry.EnterEmail(driver, Email);

		College_Enquiry.dataofbirth(driver, dateofbith);

		College_Enquiry.selectdropdownbytext(driver, "Gender", " Male ");

		College_Enquiry.selectdropdownbytext(driver, "Reservation Category", "OBC");

		College_Enquiry.selectdropdownbytext(driver, "Course", coursename);

		College_Enquiry.selectdropdownbytext(driver, "Sub Course", Subcoursename);

		College_Enquiry.scrollBy(driver, 0, 600);

		College_Enquiry.clickNextbutton(driver);

		College_Enquiry.EnterFathername(driver, "Father");

		College_Enquiry.EnterFathermobilenumber(driver, "9988776655");

		College_Enquiry.EnterFatherEmail(driver, Name + "@Yopmail.com");

		College_Enquiry.EnterFatherorganization(driver, "abc");

		College_Enquiry.EnterFatherDesignation(driver, "abc");

		College_Enquiry.EnterFatherGSTNO(driver, gstNumber);

		College_Enquiry.Nextbuttonclick(driver);

		College_Enquiry.EnterAddressL1(driver, Address1);

		College_Enquiry.EnterAddressL2(driver, Address2);

		College_Enquiry.selectdropdownbytext(driver, "State", Statename);

		College_Enquiry.selectdropdownbytext(driver, "City", CityName);

		College_Enquiry.EnterZipcode(driver, Pincode);

		College_Enquiry.clickSameasmailingaddress(driver);

		College_Enquiry.clicknextadd(driver);
		
		College_Enquiry.scrollBy(driver, 0, 500);

		College_Enquiry.clicknextad(driver);

		College_Enquiry.scrollBy(driver, 0, 500);

		College_Enquiry.clickSaveanEnquiry(driver);

		wait.until(ExpectedConditions.alertIsPresent());

		Alert alert = driver.switchTo().alert();

		// Print the text of the alert
		String inputString = alert.getText();
		
		id = inputString.substring(inputString.indexOf(":") + 2); // Adding 2 to exclude ": " from the result

		System.out.println("Student Enquiry ID :" + id);

		Thread.sleep(3000);
		alert.accept();

	}

}
