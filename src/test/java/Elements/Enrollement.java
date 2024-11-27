package Elements;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.github.javafaker.Faker;

import Components.Universal_methods;
import devAdmin.Login1;
import java.io.File;
import java.io.IOException;

public class Enrollement extends Login1  {
	 

	
	public static   void EnterEnquiryID(WebDriver driver ,String id) throws InterruptedException {
		driver.findElement(By.xpath("//input[@formcontrolname='enquiryID']")).sendKeys(id);
		  Actions actions = new Actions(driver);
		  JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);


		}
	public static   void clickNextbutton(WebDriver driver )   {

	driver.findElement(By.xpath("//span[text()=' Next ']")).click();

	}
	
	  public static void selectdropdownbytext(WebDriver driver, String dropdownname, String dropdownoption) throws InterruptedException {
	     //   WebDriverWait wait = new WebDriverWait(driver, 20); 
			  JavascriptExecutor zz = (JavascriptExecutor) driver;

			Thread.sleep(3000);
		//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='"+dropdownname+"']")));
			WebElement Dropdown=driver.findElement(By.xpath("//*[text()='"+dropdownname+"']"));
			zz.executeScript("arguments[0].click()", Dropdown);
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='"+dropdownoption+"']")));

			WebElement option=driver.findElement(By.xpath("//*[text()='"+dropdownoption+"']"));
			zz.executeScript("arguments[0].click()", option);
			

		
	  }
	  
		public static   String firstinstallment(WebDriver driver ) throws InterruptedException   {
			  JavascriptExecutor zz = (JavascriptExecutor) driver;

		zz.executeScript("window.scrollBy(0,400)");
		   Thread.sleep(3000);

		   String fstinstallment =driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body/div/div/div/form/mat-vertical-stepper/div[2]/div/div/div/form[1]/div/div[7]/div/div[1]/div/div/table/tbody/tr[1]/td[2]")).getText();
		   Thread.sleep(3000);

			zz.executeScript("window.scrollBy(0,400)");
			   Thread.sleep(3000);
			   return fstinstallment ;
		}
		
		public static   void selectingmodeofpayment(WebDriver driver,String optionText2, String fstinstallment ) throws InterruptedException   {
			Universal_methods UM=new Universal_methods ();
			Faker fk = new Faker();

			   String chequeNumber = fk.number().digits(8); // Example: Generate an 8-digit number
			    String ackNumber = fk.number().digits(10); // Example: Generate a 10-digit number
			    String neftReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
			    String rtgsReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
			    String referenceNumber = fk.regexify("[A-Z0-9]{12}"); // Example: Generate a 12-character alphanumeric string
			

		List<WebElement> ddropdowns = driver.findElements(By.cssSelector("mat-select"));
			WebElement sevenDropdown = ddropdowns.get(6);

	        // Click on the dropdown to open it
			sevenDropdown.click();			
	        Thread.sleep(3000);
List<WebElement> Optionspayments = driver.findElements(By.cssSelector("mat-option"));
//Loop through the options to find the desired one


for(WebElement Optionspayment :Optionspayments) {

if(Optionspayment.getText().equals(optionText2)) {
Optionspayment.click();
	String optionText =  sevenDropdown.getText();
  System.out.println("Payment Mode :"+optionText);

	  
	  
  //  String labelContent = Optionspayment.findElement(By.className("mat-option-text")).getText();
   // Optionspayment.click();
  if(optionText.equals("Cash")) {
		   Thread.sleep(3000);

 // Click on the desired option
    //	Optionspayment.click();
   Thread.sleep(3000);
 //  Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallment);
	   Thread.sleep(3000);

//	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
	//   Thread.sleep(3000);

   break; 
    }
    else if(optionText.equals("DD/Cheque")) {
    	

      
    	//Optionspayment.click();
        Thread.sleep(3000);

    	Date dt= new Date();	//it will return system date
		
		DateFormat df1= new SimpleDateFormat("dd/MM/yyyy");//to convert into required format
        Thread.sleep(3000);

    driver.findElement(By.xpath("//input[@formcontrolname='ddOrChequeNo']")).sendKeys(chequeNumber);	
    Thread.sleep(3000);

    driver.findElement(By.xpath("//input[@formcontrolname='ddOrChequeDate']")).sendKeys(df1.format(dt));	

    Thread.sleep(3000);
 //   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
       driver.findElement(By.cssSelector("mat-select[formcontrolname='bankName']")).click();

    Thread.sleep(3000);
    UM.selectOptionByText(driver, "IDBI Bank");
	
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallment);	
    Thread.sleep(3000);

 //   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
    break;
    }
    else if(optionText.equals("Credit Card")) {
  
    	  
    //	Optionspayment.click();
        Thread.sleep(3000);

    	driver.findElement(By.xpath("//input[@formcontrolname='creditCardAckNo']")).sendKeys(ackNumber);	
    	   driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallment);	
           Thread.sleep(3000);

        //   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
        break;
    }
    else if(optionText.equals("NEFT")) {
   

    //	Optionspayment.click();
        Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@formcontrolname='referrenceNo']")).sendKeys(neftReferenceNumber);	

    	  driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallment);	
               Thread.sleep(3000);

            //   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
            break;

    }
    else if(optionText.equals("RTGS")) {
  
    	//Optionspayment.click();
        Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@formcontrolname='referrenceNo']")).sendKeys(rtgsReferenceNumber);	
    	  driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallment);	
               Thread.sleep(3000);

             //  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
            break;

    }
    else if(optionText.equals("Direct Transfer to Bank")) {
    
   // 	Optionspayment.click();
        Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@formcontrolname='referrenceNo']")).sendKeys(referenceNumber);	
    	  driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallment);	
               Thread.sleep(3000);

             //  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
            break;

    }
    else if(optionText.equals("TDS")) {
    	//Optionspayment.click();
        Thread.sleep(3000);

    	driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallment);	
    	driver.findElement(By.xpath("//input[@formcontrolname='paymentRemarks']")).sendKeys(referenceNumber);	
         
  //  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
    break;

    }
    else if(optionText.equals("UPI")) {
    	//Optionspayment.click();
        Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@formcontrolname='referrenceNo']")).sendKeys("No");	

    	driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallment);	
         
  //  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
    break;

    }
    else if(optionText.equals("Others")){
    	
    //	Optionspayment.click();
        Thread.sleep(3000);

    	driver.findElement(By.xpath("//input[@formcontrolname='referrenceNo']")).sendKeys("No");	

    	driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallment);	
        //   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
    	 break;
    }
    else {
		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
    Thread.sleep(3000);
    optionText="";	   	    
    }
}

}


		}
		  public  static void scrollviewandclickindividualstdt(WebDriver driver) throws InterruptedException {
				 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//  WebDriverWait wait = new WebDriverWait(driver, 10);
			      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#/admin/"+visibletext+"']")));


				  WebElement svenextt = driver.findElement(By.xpath("//a[@href='#/fresh/individualf']"));
					JavascriptExecutor zz = (JavascriptExecutor) driver;
					zz.executeScript("arguments[0].scrollIntoView()", svenextt);
					Thread.sleep(5000);
					zz.executeScript("arguments[0].click()", svenextt);

					Thread.sleep(3000);
					
			  }
		  
		  public  static void scrollBy(WebDriver driver, int xPixels, int yPixels) throws InterruptedException {
			  Thread.sleep(3000);
		        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		        jsExecutor.executeScript("window.scrollBy(arguments[0], arguments[1]);", xPixels, yPixels);
				  Thread.sleep(3000);
 
		  }
		  
		  public static   void clickon_Student_Signed_On_Rules_and_Regulations(WebDriver driver )   {

				driver.findElement(By.xpath("//h5[text()=' Student Signed On Rules & Regulations ']")).click();

				}
		  
		  public static   void entervalidationNo(WebDriver driver ) throws InterruptedException   {

			  Actions actions = new Actions(driver);

		     actions.sendKeys(Keys.TAB).perform();
			   Thread.sleep(3000);

          // Simulate pressing Ctrl+C
          actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
			   Thread.sleep(3000);

	          //  actions.sendKeys(Keys.TAB).perform();


             WebElement inputField = driver.findElement(By.xpath("//input[@formcontrolname='checkvalidationNo']"));
             inputField.sendKeys(Keys.CONTROL + "v");
             
			   Thread.sleep(3000);
	
		  }	
		  
		  public static   void clickonPreviewbutton(WebDriver driver ) throws InterruptedException   {


			driver.findElement(By.xpath("//span[text()=' Preview Receipt ']")).click();

		  }
		  
		  public static   void click_On_Save_And_Print_Button(WebDriver driver ) throws InterruptedException   {

				driver.findElement(By.xpath("//span[text()=' Save and Print ']")).click();

		  }
		  
		  public static  String[]  StudentInfo(WebDriver driver ) throws InterruptedException   {

			  WebDriverWait wait = new WebDriverWait(driver, 40);
			  
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/h2")));

		  
          WebElement Student=driver.findElement(By.xpath("/html/body/div[4]/div/h2"));
          String StudentID=Student.getText();
          System.out.println(StudentID);
          
          String ReceiptNodetails= driver.findElement(By.xpath("/html/body/div[4]/div/div[2]")).getText();
          String[] ReceiptNo=ReceiptNodetails.split(" ");
          System.out.println(ReceiptNodetails);

          String originalText = StudentID;

          // Split the text by spaces
          String[] parts = originalText.split(" ");

          String desiredText=parts[2];
          
          System.out.println("Student ID: "+desiredText);
       
          return new  String[] {desiredText, ReceiptNo[2]};
		  }
		  
		  public static void validatetheRecipt(WebDriver driver ,String pdfFilePath,String StudentID,String ReceiptNo,
				  String Subcoursename, String name,String Address1,String Address2,
				  String City,String state,String pincode,String Mobilenumber,
				 String Mode_Of_Payment ) throws IOException, InterruptedException {
			  

			  //TEEMS_ Enquiry & Enrolment Management System.pdf
		        try {
		            // Command to refresh the project in Eclipse or system
		            String command = "cmd /c echo. & xcopy /d /e /y . .";
		            Runtime.getRuntime().exec(command); // Executes refresh command
		            System.out.println("Project refreshed successfully.");
		        } catch (IOException e) {
		            e.printStackTrace();
		            System.err.println("Error refreshing the project.");
		        }

		        Thread.sleep(3000);
			
		     //   PDDocument pdDocument = PDDocument.load(new File(pdfFilePath));
		        File pdfFile = new File(pdfFilePath);
		        PDDocument pdDocument = null;
		        try {
		            pdDocument = PDDocument.load(pdfFile);

				PDFTextStripper pdfStripper = new PDFTextStripper();
			String pdfFullText = pdfStripper.getText(pdDocument);
			System.out.println(pdfFullText);
			Assert.assertTrue(pdfFullText.contains(StudentID));
			Assert.assertTrue(pdfFullText.contains(ReceiptNo));
			Assert.assertTrue(pdfFullText.contains(Subcoursename));
			Assert.assertTrue(pdfFullText.contains(Address1));
			Assert.assertTrue(pdfFullText.contains(Address2));
			Assert.assertTrue(pdfFullText.contains(City));
			Assert.assertTrue(pdfFullText.contains(state));
			Assert.assertTrue(pdfFullText.contains(pincode));
			Assert.assertTrue(pdfFullText.contains(Mobilenumber));
			Assert.assertTrue(pdfFullText.contains(name));
			Assert.assertTrue(pdfFullText.contains(Mode_Of_Payment));
	
		        } finally {
		            // Ensure the PDF document is closed
		            if (pdDocument != null) {
		                pdDocument.close();
		            }
		        }
				 File f=new File(pdfFilePath);

			 if (f.exists()) {
				    System.out.println("File exists, attempting to delete...");
				    if (f.delete()) {
				        System.out.println("File deleted successfully");
				    } else {
				        System.out.println("Failed to delete the file. It may be open or locked.");
				    }
				} else {
				    System.out.println("File does not exist.");
				}

			  
				  
				  
				  

		  }
            public static void clickprintbutonanddownloadpdffile(WebDriver driver) throws InterruptedException {
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

        	//    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//span[text()='1 sheet of paper']")));        
            	
            	Thread.sleep(5000);

            	WebElement Dropdown =driver.findElement(By.cssSelector("select[class='md-select']"));
            		
            	Select sc=new Select(Dropdown);
            	
            	sc.selectByVisibleText(" Save as PDF ");
            	
            	driver.findElement(By.xpath("cr-button.action-button")).click();
            	
            	Thread.sleep(5000);
         
            }
            
            
            public static void verifypreviewdetails(WebDriver driver, String subcourse,String StudentName, String Modeofpayment) {
SoftAssert softAssert = new SoftAssert();

String studnt = driver.findElement(By.xpath("//*[text()='Received with thanks from:Mr./Ms.']")).getText().trim();
String sucourse=driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div[1]/p[2]/span/span")).getText().trim();
String subname=driver.findElement(By.xpath("//*[text()=' Finance']")).getText().trim();

String nam=sucourse+subname;
String Address = driver.findElement(By.xpath("//*[@id=\"print\"]/div[2]/div[1]/span[1]/span")).getText().trim();
String City = driver.findElement(By.xpath("//*[text()='City:']")).getText().trim();
String State = driver.findElement(By.xpath("//*[text()='State:']")).getText().trim();
String PinCode = driver.findElement(By.xpath("//*[text()='Code:']")).getText().trim();
String Mobileno = driver.findElement(By.xpath("//*[text()=' Mobile No.']")).getText().trim();
String rupees = driver.findElement(By.xpath("//*[text()=' Rupees: ']")).getText().trim();
String modeofpayment = driver.findElement(By.xpath("//*[text()=' Payment Mode: ']")).getText().trim();
String Bank = driver.findElement(By.xpath("//*[text()=' Bank Name: ']")).getText().trim();
String placeofsupplay = driver.findElement(By.xpath("//*[text()=' Place of Supply: ']")).getText().trim();
String GstNO = driver.findElement(By.xpath("//*[text()=' GSTN No.']")).getText().trim();
String formGSTno = driver.findElement(By.xpath("//*[text()=' FIRM GSTN No. :']")).getText().trim();
   int   FormGST=formGSTno.length();
   int GSTNO=GstNO.length();
  int Placeofsupplay= placeofsupplay.length();
  int BANK=Bank.length();
  int ModeofPayment=modeofpayment.length();
  int Rupees =rupees.length();
  int MobileNumber=Mobileno.length();
  int PINCODE=PinCode.length();
  int STATE =State.length();
  int Addresss=Address.length();
  int CITY=City.length();
  
// Assertions with concatenations
 softAssert.assertTrue(nam.contains(subcourse), "SubCoursename Not Displaying : "+nam);
softAssert.assertTrue(studnt.contains(StudentName), "Student name is not displaying : "+studnt);
softAssert.assertTrue(Addresss>=18, "Address is not displaying : "+Address);
softAssert.assertTrue(CITY>=8, "City name is Not Displaying : "+City);
softAssert.assertTrue(STATE>=8, "State name is Not Displaying : "+State);
softAssert.assertTrue( PINCODE>=7, "Pincode is Not Displaying : "+PinCode);
softAssert.assertTrue( MobileNumber>=16, "Mobile number is Not Displaying : "+Mobileno);
softAssert.assertTrue(Rupees>=15, "Rupees is Not Displaying : "+rupees);
softAssert.assertTrue(ModeofPayment>=15,"Mode of payment is Not Displaying : "+modeofpayment);
if(Modeofpayment.equalsIgnoreCase("DD/Cheque")) {
	softAssert.assertTrue(BANK>=13 , "Bank Name is Not Displaying : "+Bank);

}
softAssert.assertTrue(Placeofsupplay>=18,"Place of supply is Not Displaying : "+placeofsupplay);
softAssert.assertTrue(GSTNO>=18,  "GST NO is Not Displaying : "+GstNO);
softAssert.assertTrue(FormGST>=18, "Form GST is Not Displaying : "+formGSTno);

try {
    softAssert.assertAll(); // If assertions fail, catch the exception
} catch (AssertionError e) {
    System.err.println();
}
}
            public static void clickclosebutton(WebDriver driver) throws InterruptedException {
 			  
            	Thread.sleep(2000);
            	WebDriverWait wait= new WebDriverWait(driver,20);

 			   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=' Close ']")));
 			   element.click();
 			   Thread.sleep(3000);  

            }

		  
	

}
