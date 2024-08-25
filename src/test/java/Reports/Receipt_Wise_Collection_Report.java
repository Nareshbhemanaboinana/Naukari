package Reports;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;
import devAdmin.Login;
import devAdmin.Login1;

public class Receipt_Wise_Collection_Report extends Login1 {

	@Test
	public void Receipt_Wise_Collection_Reports() throws InterruptedException {

		/* 
			String optionText2 ="Cash";
			Faker fk = new Faker();
			Universal_methods UM=new Universal_methods ();

		  Actions actions = new Actions(driver);
		   String chequeNumber = fk.number().digits(8); // Example: Generate an 8-digit number
		    String ackNumber = fk.number().digits(10); // Example: Generate a 10-digit number
		    String neftReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
		    String rtgsReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
		    String referenceNumber = fk.regexify("[A-Z0-9]{12}"); // Example: Generate a 12-character alphanumeric string
		    String mobileNo = fk.regexify("[0-9]{10}"); // Example: Generate a 12-character alphanumeric string

		    WebDriverWait wait = new WebDriverWait(driver, 10);

		String Name = fk.name().firstName();
		  WebElement svenextt = driver.findElement(By.xpath("//a[@href='#/admin/collegelevel']"));
					JavascriptExecutor zz = (JavascriptExecutor) driver;
					zz.executeScript("arguments[0].scrollIntoView()", svenextt);
					Thread.sleep(5000);
					zz.executeScript("arguments[0].click()", svenextt);
					Thread.sleep(6000);
					

					List<WebElement> dropdowns = driver.findElements(By.cssSelector("mat-select"));
					WebElement FirstDropdown = dropdowns.get(0);
					WebElement secoendDropdown = dropdowns.get(1);
					WebElement thirdDropdown = dropdowns.get(2);
					WebElement fourthDropdown = dropdowns.get(3);
					WebElement fiveDropdown = dropdowns.get(4);
					WebElement sixDropdown = dropdowns.get(5);
					//WebElement sevenDropdown = dropdowns.get(6);
					WebElement eightDropdown = dropdowns.get(7);
					WebElement nineDropdown = dropdowns.get(8);
					WebElement tenDropdown = dropdowns.get(9);

					FirstDropdown.click();
					UM.selectOptionByText(driver,  "2024");

			     

					Thread.sleep(3000);
				      driver.findElement(By.xpath("//input[@formcontrolname='sName']")).sendKeys(Name);
				      driver.findElement(By.xpath("//input[@formcontrolname='sMobileNo']")).sendKeys(mobileNo);
				      driver.findElement(By.xpath("//input[@formcontrolname='sTelephoneNo']")).sendKeys("99999999999");
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
					      driver.findElement(By.xpath("//input[@formcontrolname='sFatherMobile']")).sendKeys("9999999999");
					      driver.findElement(By.xpath("//input[@formcontrolname='sFatherEmail']")).sendKeys("Father@yopmail.com");
					      driver.findElement(By.xpath("//input[@formcontrolname='sFatherOrganization']")).sendKeys("abc");
					      driver.findElement(By.xpath("//input[@formcontrolname='sFatherDesignation']")).sendKeys("abc");
					      driver.findElement(By.xpath("//input[@formcontrolname='sGSTno']")).sendKeys("29ABCDE1234F1ZH");
							Thread.sleep(3000);
							//Thread.sleep(3000);
							zz.executeScript("window.scrollBy(0,400)");
							Thread.sleep(3000);


							//driver.findElement(By.xpath("//span[text()=' Next ']")).click();
							driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[2]/div/div/div/form/div[2]/button[2]/span[1]")).click();
					      driver.findElement(By.xpath("//textarea[@formcontrolname='sMailingAddress1']")).sendKeys("hyd");
					      driver.findElement(By.xpath("//textarea[@formcontrolname='sMailingAddress2']")).sendKeys("hyd");
							Thread.sleep(3000);
							//Thread.sleep(3000);
							//zz.executeScript("window.scrollBy(0,250)");
							Thread.sleep(3000);

					      driver.findElement(By.cssSelector("mat-select[formcontrolname='iMailingState']")).click();			
							UM.selectOptionByText(driver,  "TELANGANA");

							Thread.sleep(3000);

						      driver.findElement(By.cssSelector("mat-select[formcontrolname='iMailingCity']")).click();			
		                     Thread.sleep(3000);
		 					UM.selectOptionByText(driver,  "HYDERABAD");
						  	Thread.sleep(3000);

						      driver.findElement(By.xpath("//input[@formcontrolname='sMailingZipCode']")).sendKeys("500067");

						      driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[2]/div[1]/div/mat-checkbox/label/span[1]")).click();
			               //  Thread.sleep(4000);
								Thread.sleep(3000);
								//Thread.sleep(3000);
								zz.executeScript("window.scrollBy(0,200)");
								Thread.sleep(3000);

			                 driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
			            Thread.sleep(3000);
						  	
		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
		List<WebElement> Optionss = driver.findElements(By.cssSelector("mat-option"));
						        // Loop through the options to find the desired one
		                        
						        for (int i=0; i<=Optionss.size()-1; i++) {
						        	Optionss.get(1).click();
						        	Thread.sleep(3000); 
						        	break;
					                  

						        	}
						   
						

		             driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
			         UM.selectOptionByText(driver,  "CBSE");

							  	Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")).click();
		Thread.sleep(3000); 

		List<WebElement> Options1s = driver.findElements(By.cssSelector("mat-option"));
		// Loop through the options to find the desired one
		for (int i=0; i<=Options1s.size()-1; i++) {
			Options1s.get(1).click();
			Thread.sleep(3000); 
			break;
		      

			}
							  	Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
		Thread.sleep(3000); 

		List<WebElement> Options2s = driver.findElements(By.cssSelector("mat-option"));
		//Loop through the options to find the desired one
		//Loop through the options to find the desired one
		for (int i=0; i<=Options2s.size()-1; i++) {
			Options2s.get(1).click();
			Thread.sleep(3000); 
			break;
		   

			}
			Thread.sleep(3000);

		  	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[5]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("2016");
			
		  	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[6]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("All");
		  	
		  	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[7]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("90");
			Thread.sleep(3000);
			//Thread.sleep(3000);
			zz.executeScript("window.scrollBy(0,500)");
			Thread.sleep(3000);

		  	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[2]/div/button[2]/span[1]")).click();
						  	Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[5]/div/div/div/form/div/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
		UM.selectOptionByText(driver,  "0");
		  	
			
			Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[5]/div/div/div/form/div/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
		Thread.sleep(2000);

		UM.selectOptionByText(driver,  "0");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname='sWorkingAs']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@formcontrolname='sEmployerName']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@formcontrolname='iNewspaper']")).click();
		Thread.sleep(3000);


		List<WebElement> ofccheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
		for(WebElement ofccheckbox:ofccheckboxs ) {
			if(ofccheckbox.getText().equalsIgnoreCase("Select All")) {
				Thread.sleep(4000);
				ofccheckbox.click();
			}
		}Thread.sleep(3000);

		WebElement button = driver.findElement(By.xpath("//button[@class='mat-focus-indicator btn-space teams-primary mat-flat-button mat-button-base']"));
		button.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@formcontrolname='iKnowofTIME']")).click();
		Thread.sleep(3000);


		List<WebElement> ofccheckboxse =driver.findElements(By.cssSelector("mat-checkbox"));
		for(WebElement ofccheckbox:ofccheckboxse ) {
			if(ofccheckbox.getText().equalsIgnoreCase("Select All")) {
				Thread.sleep(4000);
				ofccheckbox.click();
			}
		}Thread.sleep(3000);
		WebElement button1 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-sources/mat-dialog-actions/div/div/button[1]/span[1]"));
		button1.click();
		Thread.sleep(5000);

		zz.executeScript("window.scrollBy(0,1000)");

		WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[5]/div/div/div/form/div/div[6]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]"));

		// Click the dropdown
		dropdown.click();

		Thread.sleep(3000);
		UM.selectOptionByText(driver,  "Morning");

		Thread.sleep(3000);
		zz.executeScript("window.scrollBy(0,500)");

		 
		      driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[5]/div/div/div/div/button[2]/span[1]")).click();
		    //  Thread.sleep(4000);
		      wait.until(ExpectedConditions.alertIsPresent());

		      Alert alert = driver.switchTo().alert();

		      // Print the text of the alert
		      String inputString = alert.getText();
		      String id = inputString.substring(inputString.indexOf(":") + 2); // Adding 2 to exclude ": " from the result

		     System.out.println("Student Enquiry ID :"+id);

		     Thread.sleep(3000);
		     alert.accept();
		      // Close the alert (accept or dismiss based on your requirement)
		    //  alert.accept(); // To accept the alert



	        

			
		    
				  WebElement svenexxst = driver.findElement(By.xpath("//a[@href='#/fresh/individualf']"));
					//JavascriptExecutor zz = (JavascriptExecutor) driver;
					zz.executeScript("arguments[0].scrollIntoView()", svenexxst);
					Thread.sleep(5000);
					zz.executeScript("arguments[0].click()", svenexxst);
					Thread.sleep(6000);
			
					driver.findElement(By.xpath("//input[@formcontrolname='enquiryID']")).sendKeys(id);
					Thread.sleep(3000);
					zz.executeScript("window.scrollBy(0,400)");
					Thread.sleep(3000);
			        actions.sendKeys(Keys.TAB).perform();
					Thread.sleep(3000);

					driver.findElement(By.xpath("//span[text()=' Next ']")).click();
					Thread.sleep(3000);


				     driver.findElement(By.cssSelector("mat-select[formcontrolname='batchCode']")).click();			

					Thread.sleep(15000);
					UM.selectOptionByText(driver,"F_Batch");
					System.out.println("Enrolled Batch is: F_Batch");
					Thread.sleep(4000);

				     driver.findElement(By.cssSelector("mat-select[formcontrolname='typeOfPayment']")).click();			
				        
				        // Click on the dropdown
						UM.selectOptionByText(driver,  "2 Installments");
						Thread.sleep(3000);

					zz.executeScript("window.scrollBy(0,400)");
					   Thread.sleep(3000);

					   String fstinstallment =driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body/div/div/div/form/mat-vertical-stepper/div[2]/div/div/div/form[1]/div/div[7]/div/div[1]/div/div/table/tbody/tr[1]/td[2]")).getText();
					   Thread.sleep(3000);

						zz.executeScript("window.scrollBy(0,400)");
						   Thread.sleep(3000);

					//   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form/div[2]/button[2]/span[1]")).click();
					  // Thread.sleep(3000);
					   // Find the radio group element
				         // Find all radio buttons within the radio group


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
		                    // Default action if option not matched
		                 
		            }// Exit the loop once the desired option is found and clicked
					
					}
					
		            Thread.sleep(3000);
					zz.executeScript("window.scrollBy(0,900)");
		            Thread.sleep(3000);



		            WebElement formFilledBy = driver.findElement(By.cssSelector("mat-select[formcontrolname='formFilledBy']"));
					Thread.sleep(3000);

			        // Click on the dropdown
				   formFilledBy.click();
				UM.selectOptionByText(driver,  "Parents");
							   Thread.sleep(3000);
		//   Thread.sleep(3000);

								driver.findElement(By.xpath("//h5[text()=' Student Signed On Rules & Regulations ']")).click();

					   Thread.sleep(3000);

						zz.executeScript("window.scrollBy(0,500)");
						   Thread.sleep(3000);

			            // Simulate pressing the Tab key
			            actions.sendKeys(Keys.TAB).perform();
						   Thread.sleep(3000);

			            // Simulate pressing Ctrl+C
			            actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
						   Thread.sleep(3000);

				          //  actions.sendKeys(Keys.TAB).perform();


			               WebElement inputField = driver.findElement(By.xpath("//input[@formcontrolname='checkvalidationNo']"));
			               inputField.sendKeys(Keys.CONTROL + "v");
			               
						   Thread.sleep(3000);
						  // Thread.sleep(3000);

							zz.executeScript("window.scrollBy(0,300)");
							   Thread.sleep(3000);

							driver.findElement(By.xpath("//span[text()=' Preview Receipt ']")).click();
							   Thread.sleep(3000);

								driver.findElement(By.xpath("//span[text()=' Close ']")).click();
								   Thread.sleep(3000);

									driver.findElement(By.xpath("//span[text()=' Save and Print ']")).click();
			               
			            WebElement Student=driver.findElement(By.xpath("/html/body/div[4]/div/h2"));
			               String StudentID=Student.getText();
			               System.out.println(StudentID);
			               
			               String ReceiptNo= driver.findElement(By.xpath("/html/body/div[4]/div/div[2]")).getText();
			               System.out.println(ReceiptNo);

			               String originalText = StudentID;

			               // Split the text by spaces
			               String[] parts = originalText.split(" ");

			               // Iterate through the parts to find the desired text
			               String desiredText = null;
			               for (String part : parts) {
			                   if (part.startsWith("ARRG")) {
			                       desiredText = part;
			                       break;
			                   }
			               }

			               // Print the desired text
			               if (desiredText != null) {
			                   System.out.println("Student ID: " + desiredText);
			               } else {
			                   System.out.println("Desired text not found in the original text.");
			               }
			               
					
			               
			              
					   driver.navigate().refresh();
					   Thread.sleep(3000); 
  */
		  WebElement Reports = 	driver.findElement(By.xpath("//a[@href='#/reports/reports-lists']"));
			JavascriptExecutor zz = (JavascriptExecutor) driver;
			zz.executeScript("arguments[0].scrollIntoView()", Reports);
			Thread.sleep(5000);
			zz.executeScript("arguments[0].click()", Reports);

			   Thread.sleep(6000);
				//driver.findElement(By.xpath("(//button[@color='primary'])[1]")).click();
						//   Thread.sleep(2000);
				driver.findElement(By.xpath("//div[text()='Collections']")).click();
				   Thread.sleep(3000);

					driver.findElement(By.xpath("(//button[@color='primary'])[1]")).click();
					   Thread.sleep(3000);

			    	driver.findElement(By.xpath("//input[@formcontrolname='iCityId']")).click();
			    	Thread.sleep(3000);
			    	List<WebElement> iCitys =driver.findElements(By.cssSelector("mat-checkbox"));
			    	for(WebElement iCity:iCitys ) {
			    		if(iCity.getText().equalsIgnoreCase("Amravati")) {
			    			Thread.sleep(4000);
			    			iCity.click();
			    		}
			    	}Thread.sleep(3000);
					driver.findElement(By.xpath("//span[text()=' Save ']")).click();
					Thread.sleep(3000);
					
			    	driver.findElement(By.xpath("//input[@formcontrolname='iFranchiseId']")).click();
			    	Thread.sleep(3000);
			    	List<WebElement> iFranchisees =driver.findElements(By.cssSelector("mat-checkbox"));
			    	for(WebElement iFranchisee:iFranchisees ) {
			    		if(iFranchisee.getText().equalsIgnoreCase("Amaravati_Franchisee-ltd")) {
			    			Thread.sleep(4000);
			    			iFranchisee.click();
			    		}
			    	}Thread.sleep(3000);
					driver.findElement(By.xpath("//span[text()=' Save ']")).click();
					Thread.sleep(3000);
			    	driver.findElement(By.xpath("//input[@formcontrolname='iOfficeId']")).click();
			    	Thread.sleep(3000);
			    	List<WebElement> iOffices =driver.findElements(By.cssSelector("mat-checkbox"));
			    	for(WebElement iOffice:iOffices ) {
			    		if(iOffice.getText().equalsIgnoreCase("Amaravati_Office-II")) {
			    			Thread.sleep(4000);
			    			iOffice.click();
			    		}
			    	}Thread.sleep(3000);

					driver.findElement(By.xpath("//span[text()=' Save ']")).click();


		Thread.sleep(3000);

		    LocalDate today = LocalDate.now();
	        LocalDate date30DaysBack = today.minusDays(30);

	        // Format for printing dates
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			   Thread.sleep(2000);

				driver.findElement(By.xpath("//input[@formcontrolname='iStartDate']")).sendKeys(date30DaysBack.format(formatter));
				   Thread.sleep(3000);

			driver.findElement(By.xpath("//input[@formcontrolname='iEndDate']")).sendKeys(today.format(formatter));



		driver.findElement(By.xpath("//span[text()=' OK ']")).click();

		   Thread.sleep(3000);

			zz.executeScript("window.scrollBy(0,600)");
			   Thread.sleep(3000);
	            int totalSum = 0;

			   
				WebElement myTable=driver.findElement(By.xpath("//table[@role='table']"));
				
				List<WebElement> trs=myTable.findElements(By.tagName("tr"));
				for(int i=0; i<=trs.size()-1;i++) {

				List<WebElement> tds= trs.get(i).findElements(By.tagName("td"));
				for(int j=0; j<=tds.size()-1;j++) {
				String statename1 =tds.get(5).getText().trim();
				//System.out.print(statename1+",,");
				 String[] parts = statename1.split("\\s+");
		            String numberPart = parts[0];

		            // Use a regular expression to extract the integer part of the string
		            String numberOnly = numberPart.replaceAll("[^0-9]", "");

		            int number = Integer.parseInt(numberOnly);

                    totalSum += number;


				break;
			}
		


				//for(WebElement tr:trs) {
				//String	data=tr.findElement(By.xpath("(//td[@role='cell'])[6]")).getText();
				//	System.out.println(data);
				}
				/*		List<WebElement> tds= trs.get(d).findElements(By.tagName("td"));
					for(int j=0; j<=tds.size()-1;j++) {
					//String statename1 =tds.get(0).getText();
					break;
				}
			
	    	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(desiredText);

		 String IDStude=  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-receipt-wise-collection-report/section/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr/td[2]")).getText();	
		
		 if(IDStude.equalsIgnoreCase(desiredText)) {
			 System.out.println("Receipt Wise Collection Report working");
		 }
		 else {
			 System.out.println("Receipt Wise Collection Report not working");

		 } */
				System.out.println(totalSum);
				Thread.sleep(3000);

				zz.executeScript("window.scrollBy(0,600)");
				Thread.sleep(3000);

				  WebElement Nextbutton = 	driver.findElement(By.xpath("(//button[@aria-label='Next page'])[1]"));
					//JavascriptExecutor zz = (JavascriptExecutor) driver;
				//	zz.executeScript("arguments[0].scrollIntoView()", Nextbutton);
					Thread.sleep(5000);
				/*	String Pagenation=driver.findElement(By.xpath("(//div[@class='mat-paginator-range-label'])[1]")).getText();
					 String[] parts = Pagenation.split("\\s+");
	                    String pagenationPart = parts[4];
			            int pgnt = Integer.parseInt(pagenationPart);
                       */
					for(int i=0;i<=20;i++) {
						int tsm =0;
		                if (Nextbutton.isDisplayed() && Nextbutton.isEnabled()) {
						Thread.sleep(3000);

						Nextbutton.click();
						   
						WebElement myTablee=driver.findElement(By.xpath("//table[@role='table']"));
						
						List<WebElement> trss=myTablee.findElements(By.tagName("tr"));
						for(int k=0; k<=trss.size()-1;k++) {

						List<WebElement> tdss= trss.get(k).findElements(By.tagName("td"));
						for(int t=0; t<=tdss.size()-1;t++) {
						String statename1 =tdss.get(5).getText().trim();
						//System.out.print(statename1+",,");
						 String[] parts = statename1.split("\\s+");
				            String numberPart = parts[0];

				            // Use a regular expression to extract the integer part of the string
				            String numberOnly = numberPart.replaceAll("[^0-9]", "");

				            int number = Integer.parseInt(numberOnly);

				            tsm += number;


						break;
						}
						}
					}
					
					else {
						break;
					}
						System.out.println(tsm);

	}


	}
}

