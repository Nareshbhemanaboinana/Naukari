package Elements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import devAdmin.Login1;

public class College_Enquiry extends Login1 {
	
	
	public static String sname="//input[@formcontrolname='sName']";
	public static String Mobilenumber="//input[@formcontrolname='sMobileNo']";
	public static String Telephonenumber="//input[@formcontrolname='sTelephoneNo']";
	public static String Email="//input[@formcontrolname='sName']";
	public static String Data0fbirth="//input[@formcontrolname='sName']";
	public static String Fathername="//input[@formcontrolname='sName']";
	public static String Fathermobileno="//input[@formcontrolname='sName']";
	public static String FatherEmail="//input[@formcontrolname='sName']";
	public static String Fatherorganization="//input[@formcontrolname='sName']";
	public static String Fatherdesignation="//input[@formcontrolname='sName']";
	public static String FatherGSTNo="//input[@formcontrolname='sName']";
	public static String AddreshL1="//input[@formcontrolname='sName']";
	public static String AddreshL2="//input[@formcontrolname='sName']";

	
	public static   void EnterName(WebDriver driver ,String Name) {
	    driver.findElement(By.xpath(sname)).sendKeys(Name);

		}
	
	public static void EnterMobilenumber(WebDriver driver , String mobileNo) {

    driver.findElement(By.xpath(Mobilenumber)).sendKeys("9"+mobileNo);
	}
	public static void Entertelephonenumber(WebDriver driver , String mobileNo) {

	driver.findElement(By.xpath(Telephonenumber)).sendKeys("91"+mobileNo);
	}
	public static void EnterEmail(WebDriver driver , String Email) {

	driver.findElement(By.xpath("//input[@formcontrolname='sEmail']")).sendKeys(Email);
	}
	
	public static void dataofbirth(WebDriver driver , String dataofbirth) {

	driver.findElement(By.xpath("//input[@formcontrolname='DOC']")).sendKeys(dataofbirth);
	}
    
	public static void clickNextbutton(WebDriver driver ) throws InterruptedException {
		//Thread.sleep(2000);

		WebDriverWait wait=new  WebDriverWait(driver,20);
	WebElement 	Next =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=' Next ']")));
	Next.click();
	//driver.findElement(By.xpath("//span[text()=' Next ']")).click();
	}
	public static void clickSameasmailingaddress (WebDriver driver ) {

		driver.findElement(By.xpath("//span[text()=' Same as mailing address ']")).click();
		}
	public static void clickSaveanEnquiry (WebDriver driver ) {

		driver.findElement(By.xpath("//span[text()=' Save an Enquiry ']")).click();
		}
	public static void EnterFathername(WebDriver driver , String Fathername) {
    driver.findElement(By.xpath("//input[@formcontrolname='sFatherName']")).sendKeys(Fathername);
   
	}
	
	public static void EnterFathermobilenumber(WebDriver driver , String Fathermobilenumber) {

	driver.findElement(By.xpath("//input[@formcontrolname='sFatherMobile']")).sendKeys(Fathermobilenumber);
	}
	
	public static void EnterFatherEmail(WebDriver driver , String FatherEmail) {

	driver.findElement(By.xpath("//input[@formcontrolname='sFatherEmail']")).sendKeys(FatherEmail);
	}
	
	public static void EnterFatherorganization(WebDriver driver , String Fatherorganization) {

	driver.findElement(By.xpath("//input[@formcontrolname='sFatherOrganization']")).sendKeys(Fatherorganization);
  
	}
	public static void EnterFatherDesignation(WebDriver driver , String FatherDesignation) {

	driver.findElement(By.xpath("//input[@formcontrolname='sFatherDesignation']")).sendKeys(FatherDesignation);
   
	}
	public static void EnterFatherGSTNO(WebDriver driver , String FatherGSTNO) {

	driver.findElement(By.xpath("//input[@formcontrolname='sGSTno']")).sendKeys(FatherGSTNO);
	}
	
	public static void EnterAddressL1(WebDriver driver , String AddressL1) {

    driver.findElement(By.xpath("//textarea[@formcontrolname='sMailingAddress1']")).sendKeys(AddressL1);
   
	}
	public static void EnterAddressL2(WebDriver driver , String AddressL2) {

	
	driver.findElement(By.xpath("//textarea[@formcontrolname='sMailingAddress2']")).sendKeys(AddressL2);
	}
	  public  static void scrollBy(WebDriver driver, int xPixels, int yPixels) throws InterruptedException {
	        WebDriverWait wait = new WebDriverWait(driver, 20);

	        // Wait for the page to be in a ready state
	        wait.until((ExpectedCondition<Boolean>) wd -> 
	            ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
	        );
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("window.scrollBy(arguments[0], arguments[1]);", xPixels, yPixels);
	    }
	  public static void selectdropdownbytext(WebDriver driver, String dropdownname, String dropdownoption) throws InterruptedException {
	        WebDriverWait wait = new WebDriverWait(driver, 20); 
			JavascriptExecutor zz = (JavascriptExecutor) driver;

	        Thread.sleep(3000);
			WebElement Dropdown=	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='"+dropdownname+"']")));
		//	WebElement Dropdown=driver.findElement(By.xpath("//*[text()='"+dropdownname+"']"));
			zz.executeScript("arguments[0].click()", Dropdown);
			WebElement option= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='"+dropdownoption+"']")));

		//	WebElement option=driver.findElement(By.xpath("//*[text()='"+dropdownoption+"']"));
			zz.executeScript("arguments[0].click()", option);
			
			

		
	  }
	  public  static void scrollviewandclickcollege_level_Enquiry(WebDriver driver) throws InterruptedException {
		  WebDriverWait wait = new WebDriverWait(driver, 10);

	        // Wait until the element is visible and scroll into view
	        WebElement svenextt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#/admin/collegelevel']")));
	        
	        // Scroll to the element
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        Thread.sleep(5000);

	        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", svenextt);

	        // Wait until the element is clickable, then click
            	

    	        wait.until(ExpectedConditions.elementToBeClickable(svenextt));
    	        jsExecutor.executeScript("arguments[0].click();", svenextt);
				
    	        Thread.sleep(6000);
			
			
	  }
		public static void Nextbuttonclick(WebDriver driver ) throws InterruptedException {
			JavascriptExecutor zz = (JavascriptExecutor) driver;
			Thread.sleep(1000);

		WebElement next=driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[2]/div/div/div/form/div[2]/button[2]/span[1]"));

			zz.executeScript("arguments[0].click()", next);

			}
		public static void EnterZipcode(WebDriver driver , String zipcode) {
			
		      driver.findElement(By.xpath("//input[@formcontrolname='sMailingZipCode']")).sendKeys(zipcode);

		}

		public static void clicknextadd(WebDriver driver ) {

        driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();

	  }
		public static void clicknextad(WebDriver driver ) {

		
	  	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[2]/div/button[2]/span[1]")).click();
		}
		
		public    String Creating_colleges_level_Enquiry() throws InterruptedException {
			
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        Faker fk = new Faker();
			WebDriverWait wait = new WebDriverWait(driver, 10);
		    String gstNumber = fk.regexify("[A-Z0-9]{16}"); // Example: Generate a 12-character alphanumeric string
		     String mNumber = fk.number().digits(9); // Example: Generate an 8-digit number


		String Name = fk.name().firstName();
		
	//	College_Enquiry.scrollviewandclick(driver, "collegelevel");

	      
		
			College_Enquiry.selectdropdownbytext(driver, "Choose the Year for Joining", " 2024 ");
			
			College_Enquiry.EnterName(driver, Name);
			
			College_Enquiry.EnterMobilenumber(driver, mNumber);
			
			College_Enquiry.Entertelephonenumber(driver, mNumber);
			
			College_Enquiry.scrollBy(driver, 0, 250);
			
			College_Enquiry.EnterEmail(driver, Name+"@yopmail.com");
			
			College_Enquiry.dataofbirth(driver, "28/07/2024");
			
			College_Enquiry.selectdropdownbytext(driver, "Gender", " Male ");
			
			College_Enquiry.selectdropdownbytext(driver, "Reservation Category", "OBC");
		
			College_Enquiry.selectdropdownbytext(driver, "Course", "MBA");
			
			College_Enquiry.selectdropdownbytext(driver, "Sub Course", "Finance");
		
			College_Enquiry.scrollBy(driver, 0, 500);

			College_Enquiry.clickNextbutton(driver);  
			
			College_Enquiry.EnterFathername(driver, "Father");
			
			College_Enquiry.EnterFathermobilenumber(driver, "9988776655");
			
			College_Enquiry.EnterFatherEmail(driver, Name+"@Yopmail.com");
			
			College_Enquiry.EnterFatherorganization(driver, "abc");
			
			College_Enquiry.EnterFatherDesignation(driver, "abc");
			
			College_Enquiry.EnterFatherGSTNO(driver, gstNumber);
			
			College_Enquiry.Nextbuttonclick(driver);
			
			College_Enquiry.EnterAddressL1(driver, "Hyderabad");
			
			College_Enquiry.EnterAddressL2(driver, "Ram nagar road no:12");
			
			College_Enquiry.selectdropdownbytext(driver, "State", "Telangana");
			
			College_Enquiry.selectdropdownbytext(driver, "City", "hyderabad");
			
			College_Enquiry.EnterZipcode(driver, "500045");
			
			
			College_Enquiry.clickSameasmailingaddress(driver);
			
			
			College_Enquiry.clicknextadd(driver);
			
			College_Enquiry.clicknextad(driver);
			
			College_Enquiry.scrollBy(driver, 0, 500);
			
			College_Enquiry.clickSaveanEnquiry(driver);
			
		    wait.until(ExpectedConditions.alertIsPresent());

		      Alert alert = driver.switchTo().alert();

		      // Print the text of the alert
		      String inputString = alert.getText();
		      String id = inputString.substring(inputString.indexOf(":") + 2); // Adding 2 to exclude ": " from the result

		      
		     System.out.println("Student Enquiry ID :"+id);

		     Thread.sleep(3000);
		     alert.accept();
		     return id;
		   


		}
}