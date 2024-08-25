package Enquiry;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;
import devAdmin.Login;

public class Normal_Enquiry extends Login{
	
	
	@Test
	public void  Basic_fields_for_Enquiry() throws InterruptedException {
		
		Faker fk = new Faker();
	     WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust timeout as needed
			Universal_methods UM=new Universal_methods ();
		   String MobileNumber = fk.regexify("[0-9]{9}"); // Example: Generate a 12-character alphanumeric string

		String Name = fk.name().firstName();
		  WebElement svenextt = driver.findElement(By.xpath("//a[@href='#/admin/collegelevel']"));
			JavascriptExecutor zz = (JavascriptExecutor) driver;
			zz.executeScript("arguments[0].scrollIntoView()", svenextt);
			Thread.sleep(5000);
			zz.executeScript("arguments[0].click()", svenextt);
			//Thread.sleep(6000);
			WebElement FirstDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("mat-select[role='combobox']")));

			FirstDropdown.click();
			UM.selectOptionByText(driver,  "2024");

	     
			   WebElement nameInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='sName']"))); // Wait for input field to be clickable
		        nameInput.sendKeys(Name);

			Thread.sleep(3000);
		    driver.findElement(By.xpath("//input[@formcontrolname='sMobileNo']")).sendKeys("9"+MobileNumber);

				Thread.sleep(3000);
				//Thread.sleep(3000);
				zz.executeScript("window.scrollBy(0,500)");
				Thread.sleep(3000);
				zz.executeScript("window.scrollBy(0,200)");
				Thread.sleep(2000);

				driver.findElement(By.xpath("//div[text()='Other Details']")).click();
				Thread.sleep(3000);

				driver.findElement(By.xpath("//*[text()=' Save an Enquiry ']")).click();

				
				   try {

			    	   // WebDriverWait wait = new WebDriverWait(driver, 8); // Adjust timeout as needed
				       // WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-simple-snack-bar-content']")));
				   WebElement popup = driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));

				        // Extract the text content of the success message
				        String popups = popup.getText();

				        // Print the success message
				        System.out.println( popups);
     		          throw new RuntimeException("Test failed because the popup message contain"+popups);


					   						     
				   } catch (WebDriverException e) {
					    // If alert is not present, check for the error message
					    try {
					    	  wait.until(ExpectedConditions.alertIsPresent());

						      Alert alert = driver.switchTo().alert();

						      // Print the text of the alert
						      String inputString = alert.getText();
						      String id = inputString.substring(inputString.indexOf(":") + 2); // Adding 2 to exclude ": " from the result

						     System.out.println("Strudent Enquiry is : "+id);

						     Thread.sleep(3000);
						     alert.accept();
					    } catch (TimeoutException ex) {
					        System.out.println("No alert or error message was present.");
	        		          throw new RuntimeException("Test failed because the No alert or error message was present.");

					    }
					}

					      // Close the alert (accept or dismiss based on your requirement)
					    //  alert.accept(); // To accept the alert



	
					      // Close the alert (accept or dismiss based on your requirement)
					    //  alert.accept(); // To accept the alert

				   

	}
}
