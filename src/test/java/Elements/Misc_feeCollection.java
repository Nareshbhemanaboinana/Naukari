package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		  Thread.sleep(3000);
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("window.scrollBy(arguments[0], arguments[1]);", xPixels, yPixels);
			  Thread.sleep(3000);
 
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
	  
	  Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' Preview Receipt ']")).click();
		Thread.sleep(2000); 

		driver.findElement(By.xpath("//span[text()=' Close ']")).click();
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
}
