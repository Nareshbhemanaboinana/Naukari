package Elements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import Components.Universal_methods;
import devAdmin.Login1;

public class Subsequent extends Login1 {
	
	
	  public  static void scrollviewandclickSubsequentpayment(WebDriver driver) throws InterruptedException {
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//  WebDriverWait wait = new WebDriverWait(driver, 10);
		      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#/admin/"+visibletext+"']")));


			  WebElement svoenext = driver.findElement(By.xpath("//a[@href='#/payments/individual-student']"));
				JavascriptExecutor zz = (JavascriptExecutor) driver;
				zz.executeScript("arguments[0].scrollIntoView()", svoenext);
				Thread.sleep(5000);
				zz.executeScript("arguments[0].click()", svoenext);

				Thread.sleep(6000);
				
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
	  
		
		public static   void enteramountwithcashpayment(WebDriver driver, String secinstall ) throws InterruptedException   {
			Thread.sleep(2000); 


			driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-update-fee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
				Thread.sleep(3000); 

				List<WebElement> modeofpayments = driver.findElements(By.cssSelector("mat-option"));
				//Loop through the options to find the desired one
				for (WebElement option : modeofpayments) {
				if (option.getText().equals("Cash")) {
			     // Click on the desired option
				   option.click();
				   Thread.sleep(3000);
				   break; // Exit the loop once the desired option is found and clicked
				}
				}
	
				Thread.sleep(3000); 

				driver.findElement(By.xpath("//input[@formcontrolname='amount']")).sendKeys(secinstall);
		}
		public static void clickonNextbutton(WebDriver driver) {
			
			driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-update-fee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[1]/div/div/div/form/div[3]/button/span[1]")).click();

		}
		
		public String secinstall(WebDriver driver) throws InterruptedException {
			Thread.sleep(3000); 

		String secinstall=	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-update-fee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[2]")).getText();
		Thread.sleep(3000); 
		
		return secinstall;

		}
		
		public static void ClickonNextbuttonCa(WebDriver driver) throws InterruptedException {

		Thread.sleep(3000); 

		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-update-fee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form/div[2]/button[2]/span[1]")).click();
		Thread.sleep(3000); 
		}
		
		public static void EntervalidationNo(WebDriver driver) throws InterruptedException {

			  Actions actions = new Actions(driver);
				JavascriptExecutor zz = (JavascriptExecutor) driver;

        WebElement textElement = driver.findElement(By.xpath("//mat-label[contains(text(), 'Validation No ')]"));

	        actions.doubleClick(textElement).perform();

			Thread.sleep(3000); 

            actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
			Thread.sleep(3000); 

			//String validno=driver.findElement(By.xpath("//input[@formcontrolname='vNum1']")).getText();
		//Thread.sleep(3000); 

			WebElement  subvalidationNo =driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-update-fee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input"));

			subvalidationNo.sendKeys(Keys.CONTROL + "v");
		Thread.sleep(3000); 
		zz.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000); 
		
		}
		
		public static void clickonpreviewandclosebutton(WebDriver driver) throws InterruptedException {
		
			driver.findElement(By.xpath("//span[text()=' Preview Receipt ']")).click();
			
			scrollBy(driver, 0, 700);
			
			Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(driver, 20);

			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=' Close ']")));
			element.click();
			Thread.sleep(3000);
		}
		
		public static void clickonsaveandprint(WebDriver driver) {
		
			driver.findElement(By.xpath("//span[text()=' Save and Print ']")).click();

		}
		
		public static void printsubsequentReceipt(WebDriver driver) throws InterruptedException {
			
                WebDriverWait wait = new WebDriverWait(driver, 17);
			  
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/h2")));

		String Subqpaymentrecpt	=driver.findElement(By.xpath("/html/body/div[4]/div/h2")).getText();
		
 		Thread.sleep(3000);
 		if(Subqpaymentrecpt.contains("successfully paid receipt")) {
	 		System.out.println(Subqpaymentrecpt);

 		}
 		else {
	          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

 		}

         String originalsubsqpmt = Subqpaymentrecpt;

         // Split the text by spaces
         String[] partss = originalsubsqpmt.split(" ");

        System.out.println("Receipt ID: " + partss[5]);
        
      /*   // Iterate through the parts to find the desired text
         String desiredTextt = null;
         for (String part : partss) {
             if (part.startsWith("AJGD")) {
                 desiredTextt = part;
                 break;
             }
         }

         // Print the desired text
         if (desiredTextt != null) {
             System.out.println("Receipt ID: " + desiredTextt);
         } else {
             System.out.println("Desired text not found in the original text.");
         }
 
       */
		}
		
		public static void enterstudentID(WebDriver driver, String StudentID) throws InterruptedException {
			  Actions actions = new Actions(driver);

			
	 		
 			driver.findElement(By.xpath("//input[@formcontrolname='studentId']")).sendKeys(StudentID);
			Thread.sleep(2000); 
			
		     actions.sendKeys(Keys.TAB).perform();

				Thread.sleep(2000); 


		}
		public static void selectingmodeofpayment(WebDriver driver, String optionText2, String fstinstallment)
				throws InterruptedException {
			Universal_methods UM = new Universal_methods();
			Faker fk = new Faker();

			String chequeNumber = fk.number().digits(8); // Example: Generate an 8-digit number
			String ackNumber = fk.number().digits(10); // Example: Generate a 10-digit number
			String neftReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric
			String UPINUMBER = fk.regexify("[0-9]{16}"); // Example: Generate a 10-character alphanumeric
															// string
			String rtgsReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric
																		// string
			String referenceNumber = fk.regexify("[A-Z0-9]{12}"); // Example: Generate a 12-character alphanumeric string


			Thread.sleep(2000);
			List<WebElement> ddropdowns = driver.findElements(By.cssSelector("mat-select"));
			WebElement sevenDropdown = ddropdowns.get(0);

			
			sevenDropdown.click();
			Thread.sleep(3000);
			List<WebElement> Optionspayments = driver.findElements(By.cssSelector("mat-option"));

			for (WebElement Optionspayment : Optionspayments) {

				if (Optionspayment.getText().equals(optionText2)) {
					Optionspayment.click();
					Thread.sleep(3000);

					String optionText = sevenDropdown.getText();
					System.out.println("Payment Mode :" + optionText);

					// String labelContent =
					// Optionspayment.findElement(By.className("mat-option-text")).getText();
					// Optionspayment.click();
					if (optionText.equals("Cash")) {
						Thread.sleep(3000);


						driver.findElement(By.xpath("//input[@formcontrolname='amount']"))
								.sendKeys(fstinstallment);
						Thread.sleep(3000);

//		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
						// Thread.sleep(3000);

						break;
					} else if (optionText.equals("DD/Cheque")) {

						// Optionspayment.click();
						Thread.sleep(3000);

						Date dt = new Date(); // it will return system date

						DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");// to convert into required format
						Thread.sleep(3000);

						driver.findElement(By.xpath("//input[@formcontrolname='chequeNo']")).sendKeys(chequeNumber);
						System.out.println(chequeNumber);
						Thread.sleep(3000);

						driver.findElement(By.xpath("//input[@formcontrolname='chequeDate']")).sendKeys(df1.format(dt));
						System.out.println(df1.format(dt));

						Thread.sleep(3000);
						// driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
						driver.findElement(By.cssSelector("mat-select[formcontrolname='bankName']")).click();

						Thread.sleep(3000);
						UM.selectOptionByText(driver, "IDBI Bank");

						Thread.sleep(3000);
						driver.findElement(By.xpath("//input[@formcontrolname='amount']"))
								.sendKeys(fstinstallment);
						Thread.sleep(3000);

						// driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
						break;
					} else if (optionText.equals("Credit Card")) {

						Thread.sleep(3000);

						driver.findElement(By.xpath("//input[@formcontrolname='paymentModeRemarks']")).sendKeys(ackNumber);
						driver.findElement(By.xpath("//input[@formcontrolname='amount']"))
								.sendKeys(fstinstallment);
						Thread.sleep(3000);

						break;
					} else if (optionText.equals("NEFT")) {

						// Optionspayment.click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//input[@formcontrolname='paymentModeRemarks']"))
								.sendKeys(neftReferenceNumber);

						driver.findElement(By.xpath("//input[@formcontrolname='amount']"))
								.sendKeys(fstinstallment);
						Thread.sleep(3000);

						// driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
						break;

					} else if (optionText.equals("RTGS")) {

						// Optionspayment.click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//input[@formcontrolname='paymentModeRemarks']"))
								.sendKeys(rtgsReferenceNumber);
						driver.findElement(By.xpath("//input[@formcontrolname='amount']"))
								.sendKeys(fstinstallment);
						Thread.sleep(3000);

						break;

					} else if (optionText.equals("Direct Transfer to Bank")) {

						// Optionspayment.click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//input[@formcontrolname='paymentModeRemarks']")).sendKeys(referenceNumber);
						driver.findElement(By.xpath("//input[@formcontrolname='amount']"))
								.sendKeys(fstinstallment);
						Thread.sleep(3000);

						// driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
						break;

					} else if (optionText.equals("TDS")) {
						// Optionspayment.click();
						Thread.sleep(3000);

						driver.findElement(By.xpath("//input[@formcontrolname='amount']"))
								.sendKeys(fstinstallment);
						driver.findElement(By.xpath("//input[@formcontrolname='paymentModeRemarks']"))
								.sendKeys(referenceNumber);

						// driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
						break;

					} else if (optionText.equals("UPI")) {
						// Optionspayment.click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//input[@formcontrolname='referrenceNo']")).sendKeys("No");

						driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']"))
								.sendKeys(fstinstallment);

						// driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
						break;

					} else if (optionText.equals("Others")) {

						Thread.sleep(3000);

						driver.findElement(By.xpath("//input[@formcontrolname='paymentModeRemarks']")).sendKeys("UPI/"+UPINUMBER);

						driver.findElement(By.xpath("//input[@formcontrolname='amount']"))
								.sendKeys(fstinstallment);
						break;
					} else {
						driver.findElement(By.xpath(
								"/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]"))
								.click();
						Thread.sleep(3000);
						optionText = "";
					}
				}

			}

		}
		public static void enterdiscountdetails(WebDriver driver,String disountamount) throws InterruptedException {
			Thread.sleep(2000);

			driver.findElement(By.xpath("//h5[text()=' Is any discount being offered now ']")).click();
			Thread.sleep(3000);

			driver.findElement(By.cssSelector("mat-select[formcontrolname='discountReason']")).click();
			Thread.sleep(3000);
			
			List<WebElement> Options = driver.findElements(By.cssSelector("mat-option"));
			for (WebElement Option:Options) {
				if(Option.getText().equalsIgnoreCase("DISCOUNT")) {
					Option.click();
					Thread.sleep(3000); 
					break;

					
				}
				}
	        driver.findElement(By.xpath("//input[@formcontrolname='discountRemarks']")).sendKeys("Discount");
			Thread.sleep(2000);

	        driver.findElement(By.xpath("//input[@formcontrolname='discountNow']")).sendKeys(disountamount);

		}
		public static void Click_Print_Receipt_Button(WebDriver driver)
				throws AWTException, InterruptedException {

			Thread.sleep(2000);

			driver.findElement(By.xpath("//button[text()='Print Receipt']")).click();

			WebDriverWait wait = new WebDriverWait(driver, 25);

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//span[@class='mat-simple-snack-bar-content']")));

			WebElement Approve = driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));

			String Approve1 = Approve.getText();

			if (Approve1.contains("Data saved successfully!!!")) {
				System.out.println(Approve1);

			} else {
				System.out.println("Massage:" + Approve1);
				throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

			}

			Thread.sleep(10000);

			Robot robot = new Robot();
			robot.delay(2000); // Wait for the print dialog to open

			// Navigate to "Save as PDF" option in the Destination dropdown (may vary by
			// system)
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.delay(500);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(500);

			
			
		}

}
