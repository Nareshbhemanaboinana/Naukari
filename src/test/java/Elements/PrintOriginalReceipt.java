package Elements;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import devAdmin.Login1;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class PrintOriginalReceipt extends Login1{
	
	
	public static void Scrollviewandclickstudent(WebDriver driver) throws InterruptedException {
		
		   
		   WebElement Studentprofile = driver.findElement(By.xpath("//a[@href='#/student-management/student']"));
			JavascriptExecutor zz = (JavascriptExecutor) driver;
			zz.executeScript("arguments[0].scrollIntoView()", Studentprofile);
			Thread.sleep(5000);
			zz.executeScript("arguments[0].click()", Studentprofile);
			Thread.sleep(6000);
	
	}
	
	
	public static void enterstunetID(WebDriver driver, String StudentID) {
		driver.findElement(By.xpath("//input[@formcontrolname='studentId']")).sendKeys(StudentID);

	}

	 public  static void scrollBy(WebDriver driver, int xPixels, int yPixels) throws InterruptedException {
		   Thread.sleep(3000);
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        jsExecutor.executeScript("window.scrollBy(arguments[0], arguments[1]);", xPixels, yPixels);
			   Thread.sleep(3000);
  
	 }
	 
	 
	 public static void clickSearchbutton(WebDriver driver) throws InterruptedException {
		   Thread.sleep(3000);

			driver.findElement(By.xpath("//span[text()=' Search ']")).click();
			   Thread.sleep(3000);


	 }
	 
	 public static void clickReceiptReprint(WebDriver driver) throws InterruptedException {
			driver.findElement(By.xpath("//img[@mattooltip='Receipt Reprint']")).click();
			   Thread.sleep(3000);


	 }
	 
	 public static void clickPrintOriginalReceipt(WebDriver driver) throws InterruptedException {
			driver.findElement(By.xpath("//span[text()=' Print Original Receipt ']")).click();
			   Thread.sleep(3000);


	 }
	 
	 public static void clicktatandcpotypastvalidationNo(WebDriver driver) throws InterruptedException {
		 
		 Actions actions =new Actions (driver);
		  
		   Thread.sleep(3000);
            actions.sendKeys(Keys.TAB).perform();
			   Thread.sleep(3000);

        // Simulate pressing Ctrl+C
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		   Thread.sleep(3000);

          //  actions.sendKeys(Keys.TAB).perform();


           WebElement inputFieldd = driver.findElement(By.xpath("//input[@formcontrolname='vNum2']"));
           inputFieldd.sendKeys(Keys.CONTROL + "v");
           
		   Thread.sleep(3000);

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
	  
	  public static void clickprintbutton(WebDriver driver) throws InterruptedException {
		  
		   Thread.sleep(3000);

	  
		driver.findElement(By.xpath("//span[text()=' Print ']")).click();
		  
	  }
	  
	  
	  public static void validatesuccesspopup(WebDriver driver) throws InterruptedException {
		  
		  
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
	  }
	  
    	     public  static void validatereceiptdetails(WebDriver driver,String ReceiptNo) throws IOException, InterruptedException {       
    			//  WebDriverWait wait=new WebDriverWait(driver,25);
  
    	          //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[contains(text(), 'ReceiptNo')]")));
          		Thread.sleep(7000);

    	            // Take a screenshot of the full page
    	            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    	            BufferedImage img = ImageIO.read(screenshot);

    	            // Use Tesseract OCR to extract text from the screenshot
    	            ITesseract tesseract = new Tesseract();
    	            System.setProperty("TESSDATA_PREFIX", "C:\\selenium\\TEEMS_3.0\\IT");
    	            tesseract.setDatapath("C:\\selenium\\TEEMS_3.0\\IT");
    	            tesseract.setLanguage("eng");

    	            try {
    	                String extractedText = tesseract.doOCR(img);

    	                // Check if the expected details are in the extracted text
    	                if (extractedText.contains(ReceiptNo) ) {
    	                    System.out.println("All expected details are present in the print preview.");
    	                } else {
    	                    System.out.println("Some details are missing in the print preview.");
    	                }
    	            } catch (TesseractException e) {
    	                System.out.println("Error during OCR: " + e.getMessage());
    	            }

    	     }
	  
}
