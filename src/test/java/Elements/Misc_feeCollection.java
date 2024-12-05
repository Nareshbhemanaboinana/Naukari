package Elements;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

public class Misc_feeCollection extends  Login1 {
	
	
	public static void ScrollViewAndClickMissFeeCollection(WebDriver driver) throws InterruptedException {
	
		WebElement sdsvenextt = driver.findElement(By.xpath("//a[@href='#/payments/misc-fee-update\']"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", sdsvenextt);
		Thread.sleep(5000);
		zz.executeScript("arguments[0].click()", sdsvenextt);
		Thread.sleep(6000);

	}
	
	public static void EnterStudentID(WebDriver driver, String StudentID)   {
	
	      driver.findElement(By.xpath("//input[@formcontrolname='studentId']")).sendKeys(StudentID);

	}
	
	  public  static void scrollBy(WebDriver driver, int xPixels, int yPixels) throws InterruptedException {
		Thread.sleep(2000);
		  WebDriverWait wait = new WebDriverWait(driver, 20);

	        // Wait for the page to be in a ready state
	        wait.until((ExpectedCondition<Boolean>) wd -> 
	            ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
	        );
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("window.scrollBy(arguments[0], arguments[1]);", xPixels, yPixels);
	    }
	  
	  
	  public static void ClickOnNextButton(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()=' Next ']")).click();
		Thread.sleep(2000);
	  }
	  
	  public static void selectdropdownbytext(WebDriver driver, String dropdownname, String dropdownoption) throws InterruptedException {
	        WebDriverWait wait = new WebDriverWait(driver, 20); 
			JavascriptExecutor zz = (JavascriptExecutor) driver;

			Thread.sleep(3000);
		//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='"+dropdownname+"']")));
			WebElement Dropdown=driver.findElement(By.xpath("//*[text()='"+dropdownname+"']"));
			zz.executeScript("arguments[0].click()", Dropdown);
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='"+dropdownoption+"']")));

			WebElement option=driver.findElement(By.xpath("//*[text()='"+dropdownoption+"']"));
			zz.executeScript("arguments[0].click()", option);
			

		
	  }
	  
	  public static void ClickOnOthersButton(WebDriver driver) throws InterruptedException {
	  
		  Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Others ']")).click();
		  Thread.sleep(2000);


	  }
	  
	  public static void CopyPastValidationNo(WebDriver driver) throws InterruptedException {

		  Actions actions=new Actions(driver);
		  
		  JavascriptExecutor zz=(JavascriptExecutor) driver;
      WebElement textElement = driver.findElement(By.xpath("//mat-label[contains(text(), 'Validation No ')]"));


	        actions.doubleClick(textElement).perform();

			Thread.sleep(3000); 

          actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
			Thread.sleep(3000); 


	//	WebElement  subvalidationNo =driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-update-fee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input"));
			WebElement  subvalidationNo =      driver.findElement(By.xpath("//input[@formcontrolname='vNum2']"));

		subvalidationNo.sendKeys(Keys.CONTROL + "v");
	
		Thread.sleep(2000);
		zz.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		
		
	  }
	  
	  public static void ClickPreviewandClose(WebDriver driver) throws InterruptedException {
	  
			
			driver.findElement(By.xpath("//span[text()=' Preview Receipt ']")).click();
			
			scrollBy(driver, 0, 700);
			
			Thread.sleep(6000);
			WebDriverWait wait = new WebDriverWait(driver, 20);

			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=' Close ']")));
			element.click();
			Thread.sleep(3000);
	  }
	  
	  public static void ClickSaveandPrint(WebDriver driver) throws InterruptedException {
		  Thread.sleep(2000);
	  
				driver.findElement(By.xpath("//span[text()=' Save and Print ']")).click();
				Thread.sleep(2000);
	  }
	  
	  public static void printReceiptDetails(WebDriver driver) throws InterruptedException {
	   Thread.sleep(2000);

		String Details =driver.findElement(By.xpath("/html/body/div[3]/div/h2")).getText();

		System.out.println(Details);
		
		String Receiptdetails = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText();

		System.out.println(Receiptdetails);
		
	  }
	  
	  public static void EnterStudentName(WebDriver driver,String StudentName) throws InterruptedException {
		   Thread.sleep(2000);
  
      driver.findElement(By.xpath("//input[@formcontrolname='studentName']")).sendKeys(StudentName);
	   Thread.sleep(2000);

      
	  }
	  
		public static void selectingmodeofpayment(WebDriver driver, String optionText2)
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
			WebElement sevenDropdown = ddropdowns.get(2);

			
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


					//	driver.findElement(By.xpath("//input[@formcontrolname='amount']"))
						//		.sendKeys(fstinstallment);
						//Thread.sleep(3000);

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
						driver.findElement(By.cssSelector("mat-select[formcontrolname='bankId']")).click();

						Thread.sleep(3000);
						UM.selectOptionByText(driver, "IDBI Bank");

						Thread.sleep(3000);
					//	driver.findElement(By.xpath("//input[@formcontrolname='amount']"))
						//		.sendKeys(fstinstallment);
						Thread.sleep(3000);

						// driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
						break;
					} else if (optionText.equals("Credit Card")) {

						Thread.sleep(3000);

						driver.findElement(By.xpath("//input[@formcontrolname='paymentModeRemarks']")).sendKeys(ackNumber);
					//	driver.findElement(By.xpath("//input[@formcontrolname='amount']"))
						//		.sendKeys(fstinstallment);
						Thread.sleep(3000);

						break;
					} else if (optionText.equals("NEFT")) {

						// Optionspayment.click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//input[@formcontrolname='paymentModeRemarks']"))
								.sendKeys(neftReferenceNumber);

					//	driver.findElement(By.xpath("//input[@formcontrolname='amount']"))
						//		.sendKeys(fstinstallment);
						Thread.sleep(3000);

						// driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
						break;

					} else if (optionText.equals("RTGS")) {

						// Optionspayment.click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//input[@formcontrolname='paymentModeRemarks']"))
								.sendKeys(rtgsReferenceNumber);
					//	driver.findElement(By.xpath("//input[@formcontrolname='amount']"))
						//		.sendKeys(fstinstallment);
						Thread.sleep(3000);

						break;

					} else if (optionText.equals("Direct Transfer to Bank")) {

						// Optionspayment.click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//input[@formcontrolname='paymentModeRemarks']")).sendKeys(referenceNumber);
					//	driver.findElement(By.xpath("//input[@formcontrolname='amount']"))
						//		.sendKeys(fstinstallment);
						Thread.sleep(3000);

						// driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
						break;

					} else if (optionText.equals("TDS")) {
						// Optionspayment.click();
						Thread.sleep(3000);

					//	driver.findElement(By.xpath("//input[@formcontrolname='amount']"))
						//		.sendKeys(fstinstallment);
						driver.findElement(By.xpath("//input[@formcontrolname='paymentModeRemarks']"))
								.sendKeys(referenceNumber);

						// driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
						break;

					} else if (optionText.equals("UPI")) {
						// Optionspayment.click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//input[@formcontrolname='referrenceNo']")).sendKeys("No");

					//	driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']"))
						//		.sendKeys(fstinstallment);

						// driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
						break;

					} else if (optionText.equals("Others")) {

						Thread.sleep(3000);

						driver.findElement(By.xpath("//input[@formcontrolname='paymentModeRemarks']")).sendKeys("UPI/"+UPINUMBER);

					//	driver.findElement(By.xpath("//input[@formcontrolname='amount']"))
						//		.sendKeys(fstinstallment);
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
		
		 public static void ClickSaveandDoNotPrint(WebDriver driver) throws InterruptedException {
			  Thread.sleep(2000);
		  
					driver.findElement(By.xpath("//span[text()=' Save and Do not Print ']")).click();
					Thread.sleep(2000);
		  }

}
