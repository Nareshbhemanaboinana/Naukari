package Elements;

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
import org.testng.asserts.SoftAssert;

import devAdmin.Login1;

public class Refund extends Login1{
	
	 
	public static void viewandclickstudentprofile(WebDriver driver) throws InterruptedException {
	   WebElement Studentprofile = driver.findElement(By.xpath("//a[@href='#/student-management/student']"));
	JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", Studentprofile);
		Thread.sleep(5000);
		zz.executeScript("arguments[0].click()", Studentprofile);
		Thread.sleep(6000);

	}
	
	public static void clickRefunftab(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//div[@tabindex='-1']")).click();
		Thread.sleep(2000);
		//zz.executeScript("window.scrollBy(0,100)");
		//Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Refund Request']")).click();
		Thread.sleep(2000);
	}
	
	public static void enterstudentID(WebDriver driver ,String StudentID) throws InterruptedException {
     WebElement inputElement = driver.findElement(By.cssSelector("input[formcontrolname='studentId']"));
     inputElement.sendKeys(StudentID);
		//driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-student/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/mat-tab-group/div/mat-tab-body[1]/div/div[2]/div/div/form/div/div/mat-form-field/div/div[1]/div[3]/input")).sendKeys(desiredText);
		Thread.sleep(2000);
		JavascriptExecutor zz = (JavascriptExecutor) driver;
    Actions actions=new Actions(driver);
		zz.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
     actions.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
	}

 /*    WebElement requ = driver.findElement(By.cssSelector("mat-select[formcontrolname='resonForRefund']"));

     requ.click();
		Thread.sleep(2000);

     UM.selectOptionByText(driver, "BatchCancellation-Refund");
		Thread.sleep(2000);*/
    public static void enterRemaks(WebDriver driver) throws InterruptedException { 
     driver.findElement(By.xpath("//input[@formcontrolname='sRemarks']")).sendKeys("Requesting for Refund");
		Thread.sleep(2000);
		JavascriptExecutor zz = (JavascriptExecutor) driver;

		zz.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

    }
	
     public static void EnterRefundAmount(WebDriver driver, int amount) throws InterruptedException {
     driver.findElement(By.xpath("//input[@formcontrolname='refundAmt']")).sendKeys(String.valueOf(amount));
     System.out.println("Refund Amount is"+amount);
		Thread.sleep(5000);
     }
		
		public static void clickSaveButton(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()=' Save ']")).click();

		}
	//	WebElement Request =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
	  //   String Request1 = Request.getText();

	/*	     // String backgroundColor = popup.getCssValue("background-color");
	           if (Request1.equals("Data Saved Successfully!!!")) {
	           	
	           	System.out.println("Massage:"+ Request1);
	           }
	           else {
		           	System.out.println("Massage:"+ Request1);
			          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

	           }
*/
		public static void LogOutCounsellor(WebDriver driver) throws InterruptedException {
				  WebElement LogoutButton = driver.findElement(By.xpath("//span[text()='LOGOUT ']"));
					JavascriptExecutor zz = (JavascriptExecutor) driver;
						zz.executeScript("arguments[0].scrollIntoView()", LogoutButton);
						Thread.sleep(5000);
						zz.executeScript("arguments[0].click()", LogoutButton);
						Thread.sleep(4000);
		}
		public static void LoginAdmin(WebDriver driver, String Username,String Password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys(Username);
						Thread.sleep(4000);

						driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(Password);
						
						Thread.sleep(4000);

						driver.findElement(By.xpath("//button[@type='submit']")).click();
						Thread.sleep(5000);

		}
					
		public static void viewandclickstudentmngnt(WebDriver driver) throws InterruptedException {
		WebElement Studentprofile1 = driver.findElement(By.xpath("//a[@href='#/student-management/student']"));
							JavascriptExecutor zz = (JavascriptExecutor) driver;								
							zz.executeScript("arguments[0].scrollIntoView()", Studentprofile1);
								Thread.sleep(5000);
								zz.executeScript("arguments[0].click()", Studentprofile1);
								Thread.sleep(6000);

								driver.findElement(By.xpath("(//div[@tabindex='-1'])")).click();
								Thread.sleep(2000);
								driver.findElement(By.xpath("(//div[@tabindex='-1'])[2]")).click();
								Thread.sleep(2000);
							
		}	
		
		public static void clickstudentprocesstab(WebDriver driver) throws InterruptedException{
	driver.findElement(By.xpath("//span[text()='Refund Process']")).click();
	JavascriptExecutor zz = (JavascriptExecutor) driver;								

	Thread.sleep(2000);
	zz.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);
		}
		
		public static void enterStdntIDandclickviewicon(WebDriver driver, String StdntID) throws InterruptedException {
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@placeholder='Search']")).sendKeys(StdntID);
			Thread.sleep(2000);

			driver.findElement(By.xpath("//mat-icon[@role='img']")).click();
			Thread.sleep(2000);
			JavascriptExecutor zz = (JavascriptExecutor) driver;								

			zz.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@formcontrolname='studentId']")).sendKeys(StdntID);
			zz.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[text()=' Fetch ']")).click();
			zz.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[text()='"+StdntID+"'])[1]")).click();
			 /* 
		        WebElement table = driver.findElement(By.cssSelector("table.m-t-20"));

		        // Find the last row of the table
		        WebElement lastRow = table.findElement(By.cssSelector("tbody tr:last-child"));

		        // Extract data from the first cell of the last row
		        WebElement firstCell = lastRow.findElement(By.tagName("td"));
		        String data = firstCell.getText();

	String SSID	=	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-student-studentrequest-view/section/div/div[3]/div/div/table/tbody/tr[15]/td[1]")).getText();	
	if(SSID.equals(StdntID)) {
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-student-studentrequest-view/section/div/div[3]/div/div/table/tbody/tr[15]/td[1]")).click();
	}
	else {
		System.out.println("Student details not displaying ");
	}

*/
		}
		
		public static void enteramount(WebDriver driver) {
			
			
			driver.findElement(By.xpath("//input[@formcontrolname='fRefundAmt']")).sendKeys("500");
		}
		
		public static void clickCashradiobutton(WebDriver driver) {
		
			driver.findElement(By.xpath("//*[text()=' Cash ']")).click();

		}
		
		public static void enterRemarksinadmin(WebDriver driver) {
			
			
			driver.findElement(By.xpath("//input[@formcontrolname='comment']")).sendKeys("Approved");
	
		}
		
		public static void scrollBy(WebDriver driver, int xPixels, int yPixels) throws InterruptedException {
			
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 20);

		        wait.until((ExpectedCondition<Boolean>) wd -> 
		            ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
		        );
		        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		        jsExecutor.executeScript("window.scrollBy(arguments[0], arguments[1]);", xPixels, yPixels);
		    }


		
		public static void clickAprove(WebDriver driver) throws InterruptedException {
			
			driver.findElement(By.xpath("//span[text()=' Approve ']")).click();
			
			WebElement Approve =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
			Thread.sleep(3000);

					String Approve1 = Approve.getText();

					     // String backgroundColor = popup.getCssValue("background-color");
				           if (Approve1.equals("Approved Sucessfully!!!")) {
				           	
				           	System.out.println("Massage:"+ Approve1);
				           }
				           else {
					           	System.out.println("Massage:"+ Approve1);
						          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

				           }



		}
		
		public static void enter_amount_approving_againest(WebDriver driver,int amount ) throws InterruptedException {
			
			WebElement refundamnt = driver.findElement(By.xpath("//input[@formcontrolname='fRefundAmt']"));
	        JavascriptExecutor zz = (JavascriptExecutor) driver;

			zz.executeScript("arguments[0].scrollIntoView()", refundamnt);
			Thread.sleep(2000);
			
			refundamnt.sendKeys(String.valueOf(amount));

			
		}
		
		public static void click_on_radio_button(WebDriver driver,String button ) {
			
			driver.findElement(By.xpath("//span[text='"+button+"']")).click();
			
			
		}
		public static void enter_remarks(WebDriver driver,String Remarks) {
			
			driver.findElement(By.xpath("//input[@formcontrolname='comment']")).sendKeys(Remarks);
		}
		
		public static void click_approve_button(WebDriver driver) throws InterruptedException {
			
			driver.findElement(By.xpath("//*[text()=' Approve ']")).click();
			
			WebElement Approve =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
			Thread.sleep(3000);

					String Approve1 = Approve.getText();

					     // String backgroundColor = popup.getCssValue("background-color");
				           if (Approve1.equals("Approved Sucessfully!!!")) {
				           	
				           	System.out.println("Massage:"+ Approve1);
				           }
				           else {
					           	System.out.println("Massage:"+ Approve1);
						          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

				           }




			
		}
		
		public static void enter_student_ID(WebDriver driver,String StudentID) throws InterruptedException {
			
			 WebElement inputElement = driver.findElement(By.cssSelector("input[formcontrolname='studentId']"));
		     inputElement.sendKeys(StudentID);
		     Thread.sleep(2000);
		 	JavascriptExecutor zz = (JavascriptExecutor) driver;
				zz.executeScript("window.scrollBy(0,500)");
			
				
		}
		public static void click_search_button(WebDriver driver) throws InterruptedException {
			
			driver.findElement(By.xpath("//*[text()=' Search ']")).click();
			  Thread.sleep(2000);
			 	JavascriptExecutor zz = (JavascriptExecutor) driver;
					zz.executeScript("window.scrollBy(0,500)");
				
			
		}
		
		public static void click_profile_validate_refund_details(WebDriver driver,int Exp_RFND_AMT,String Expct_Refund_Type) throws InterruptedException {
			
			driver.findElement(By.xpath("//img[@src='assets/images/times/action5.png']")).click();
			
			Thread.sleep(15000);
			WebDriverWait wait = new WebDriverWait(driver,20);

			// Wait until the element is visible
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//th[@class='ng-star-inserted'])[7]")));

			// Fetch the text after ensuring the element is visible
			String Refind_Amount = element.getText();

			Thread.sleep(4000);
		//	String Refind_Amount=driver.findElement(By.xpath("(//th[@class='ng-star-inserted'])[7]")).getText();
			
			String Refund_Type=driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-student-view-profile/section/div/div[2]/div/div[1]/table[3]/tr[2]/th[2]")).getText();
			
			SoftAssert softassert= new SoftAssert();
			
			softassert.assertEquals(String.valueOf(Refind_Amount), String.valueOf(Exp_RFND_AMT));
			
			softassert.assertEquals(Refund_Type, Expct_Refund_Type);

		}
			
	

}
