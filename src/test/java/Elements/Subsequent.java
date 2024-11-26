package Elements;

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
		  Thread.sleep(3000);
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("window.scrollBy(arguments[0], arguments[1]);", xPixels, yPixels);
			  Thread.sleep(3000);
 
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
		   WebDriverWait wait= new WebDriverWait(driver,20);

		   WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=' Close ']")));
		   element.click();
		Thread.sleep(3000); 
		}
		
		public static void clickonsaveanddonotprint(WebDriver driver) {
		
			driver.findElement(By.xpath("//span[text()=' Save and Do not Print ']")).click();

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
			Thread.sleep(3000); 
			
		     actions.sendKeys(Keys.TAB).perform();

				Thread.sleep(3000); 


		}
}
