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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;
import devAdmin.Login;
import devAdmin.Login1;

public class Enquiry_for_mandataryfields extends Login {
	
	@Test
	public void Enquiry_for_mandatary_only_fields() throws InterruptedException {
		
		
		Faker fk = new Faker();
		Universal_methods UM=new Universal_methods ();

	  Actions actions = new Actions(driver);
	   String chequeNumber = fk.number().digits(8); // Example: Generate an 8-digit number
	    String ackNumber = fk.number().digits(10); // Example: Generate a 10-digit number
	    String neftReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
	    String rtgsReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
	    String referenceNumber = fk.regexify("[A-Z0-9]{12}"); // Example: Generate a 12-character alphanumeric string
	    String mobileNo = fk.regexify("[0-9]{9}"); // Example: Generate a 12-character alphanumeric string

	    WebDriverWait wait = new WebDriverWait(driver, 10);

	String Name = fk.name().firstName();
	  WebElement svenextt = driver.findElement(By.xpath("//a[@href='#/admin/collegelevel']"));
				JavascriptExecutor zz = (JavascriptExecutor) driver;
				zz.executeScript("arguments[0].scrollIntoView()", svenextt);
				Thread.sleep(5000);
				zz.executeScript("arguments[0].click()", svenextt);
				Thread.sleep(6000);
				

				List<WebElement> dropdowns = driver.findElements(By.cssSelector("mat-select"));
			//	WebElement FirstDropdown = dropdowns.get(0);
				WebElement secoendDropdown = dropdowns.get(1);
				WebElement thirdDropdown = dropdowns.get(2);
				WebElement fourthDropdown = dropdowns.get(3);
				WebElement fiveDropdown = dropdowns.get(4);
				WebElement sixDropdown = dropdowns.get(5);
				//WebElement sevenDropdown = dropdowns.get(6);
				WebElement eightDropdown = dropdowns.get(7);
				WebElement nineDropdown = dropdowns.get(8);
				WebElement tenDropdown = dropdowns.get(9);

				WebElement FirstDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("mat-select[role='combobox']")));

				FirstDropdown.click();
				Thread.sleep(3000);

				UM.selectOptionByText(driver,  "2024");

		     

				Thread.sleep(3000);
			     driver.findElement(By.xpath("//input[@formcontrolname='sName']")).sendKeys(Name);
			      driver.findElement(By.xpath("//input[@formcontrolname='sMobileNo']")).sendKeys("9"+mobileNo);
			      driver.findElement(By.xpath("//input[@formcontrolname='sTelephoneNo']")).sendKeys("91"+mobileNo);
			      driver.findElement(By.xpath("//input[@formcontrolname='sEmail']")).sendKeys(Name+"@yopmail.com");
			      driver.findElement(By.xpath("//input[@formcontrolname='DOC']")).sendKeys("07/06/1994");
			      secoendDropdown.click();
					UM.selectOptionByText(driver,  "Male");

			    	Thread.sleep(3000);
					zz.executeScript("window.scrollBy(0,500)");
					Thread.sleep(3000);

			      thirdDropdown.click();
					UM.selectOptionByText(driver,  "OBC");

			     	Thread.sleep(3000);

			      fourthDropdown.click();
					UM.selectOptionByText(driver,  "MBA");

			    	Thread.sleep(3000);

			      fiveDropdown.click();
					UM.selectOptionByText(driver,  "Finance");
	  
			         
					driver.findElement(By.xpath("//span[text()=' Next ']")).click();
					driver.findElement(By.xpath("//input[@formcontrolname='sFatherName']")).sendKeys("Father");
				  	//Thread.sleep(3000);
						zz.executeScript("window.scrollBy(0,400)");
						Thread.sleep(3000);


						//driver.findElement(By.xpath("//span[text()=' Next ']")).click();
						driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[2]/div/div/div/form/div[2]/button[2]/span[1]")).click();
				      driver.findElement(By.xpath("//textarea[@formcontrolname='sMailingAddress1']")).sendKeys("hyd");
				      driver.findElement(By.xpath("//textarea[@formcontrolname='sMailingAddress2']")).sendKeys("hyd");
						Thread.sleep(3000);
						//Thread.sleep(3000);
						zz.executeScript("window.scrollBy(0,250)");
						Thread.sleep(3000);

				      driver.findElement(By.cssSelector("mat-select[formcontrolname='iMailingState']")).click();			
						Thread.sleep(3000);

				      UM.selectOptionByText(driver,  "TELANGANA");

						Thread.sleep(3000);

					      driver.findElement(By.cssSelector("mat-select[formcontrolname='iMailingCity']")).click();			
	                     Thread.sleep(3000);
	 					UM.selectOptionByText(driver,  "HYDERABAD");
					  	Thread.sleep(3000);

					      driver.findElement(By.xpath("//input[@formcontrolname='sMailingZipCode']")).sendKeys("500067");

					    //  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[2]/div[1]/div/mat-checkbox/label/span[1]")).click();
		               //  Thread.sleep(4000);
							Thread.sleep(3000);
							//Thread.sleep(3000);
							zz.executeScript("window.scrollBy(0,200)");
							Thread.sleep(3000);

		                 driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
		            Thread.sleep(3000);
					  	
				
					//Thread.sleep(3000);
					zz.executeScript("window.scrollBy(0,500)");
					Thread.sleep(3000);


					driver.findElement(By.xpath("//div[text()='Other Details']")).click();
					Thread.sleep(3000);

				driver.findElement(By.xpath("//*[text()=' Save an Enquiry ']")).click();
	    //  Thread.sleep(4000);

					
					   try {

				    	   // WebDriverWait wait = new WebDriverWait(driver, 8); // Adjust timeout as needed
					       // WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-simple-snack-bar-content']")));
					   WebElement popup = driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));

					        // Extract the text content of the success message
					        String popups = popup.getText();

					        // Print the success message
					        System.out.println( popups);
	        		          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");


						   						     
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



		
	
	}

}
