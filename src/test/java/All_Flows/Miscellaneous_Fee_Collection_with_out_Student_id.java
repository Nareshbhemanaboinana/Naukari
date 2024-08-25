package All_Flows;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;
import devAdmin.Login;

public class Miscellaneous_Fee_Collection_with_out_Student_id extends Login {
	
	
	@Test
	
	public void Miscellaneous_Fee_Collection_with_out_Student_ID() throws InterruptedException, FindFailed, HeadlessException, UnsupportedFlavorException, IOException {

		
	  //  WebDriverWait wait = new WebDriverWait(driver, 10);

	//	@Parameters({"optionText2"})
		String optionText2	 = "TDS";
			
			Faker fk = new Faker();
			Universal_methods UM=new Universal_methods ();

		  Actions actions = new Actions(driver);
		   String chequeNumber = fk.number().digits(8); // Example: Generate an 8-digit number
		    String ackNumber = fk.number().digits(10); // Example: Generate a 10-digit number
		    String neftReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
		    String rtgsReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
		    String referenceNumber = fk.regexify("[A-Z0-9]{12}"); // Example: Generate a 12-character alphanumeric string

		String Name = fk.name().firstName();
		  WebElement svenextt = driver.findElement(By.xpath("//a[@href='#/payments/misc-fee-update\']"));
					JavascriptExecutor zz = (JavascriptExecutor) driver;
					zz.executeScript("arguments[0].scrollIntoView()", svenextt);
					Thread.sleep(5000);
					zz.executeScript("arguments[0].click()", svenextt);
					Thread.sleep(6000);
				      driver.findElement(By.xpath("//input[@formcontrolname='studentName']")).sendKeys(Name);


						Thread.sleep(2000);
						zz.executeScript("window.scrollBy(0,500)");
						Thread.sleep(2000);
						
						driver.findElement(By.xpath("//span[text()=' Next ']")).click();
						Thread.sleep(2000);

					      driver.findElement(By.cssSelector("mat-select[formcontrolname='placeofSupply']")).click();			
							Thread.sleep(2000);

					      UM.selectOptionByText(driver,  "Andhra Pradesh");

							Thread.sleep(2000);

						      driver.findElement(By.cssSelector("mat-select[formcontrolname='feeTowardsId']")).click();			
								Thread.sleep(2000);

								List<WebElement> Options2s = driver.findElements(By.cssSelector("mat-option"));
								//Loop through the options to find the desired one
								//Loop through the options to find the desired one
								for (int i=0; i<=Options2s.size()-1; i++) {
									Options2s.get(2).click();
									Thread.sleep(3000); 
									break;
								 

									}
									List<WebElement> ddropdowns = driver.findElements(By.cssSelector("mat-select"));
										WebElement eeightDropdown = ddropdowns.get(2);

								        // Click on the dropdown to open it
										eeightDropdown.click();			
								        Thread.sleep(3000);
									List<WebElement> Optionspayments = driver.findElements(By.cssSelector("mat-option"));
									//Loop through the options to find the desired one


									for(WebElement Optionspayment :Optionspayments) {

									if(Optionspayment.getText().equals(optionText2)) {
									Optionspayment.click();
										String optionText =  Optionspayment.getText();
						              System.out.println("Payment Mode :"+optionText);

										  
										  
							          //  String labelContent = Optionspayment.findElement(By.className("mat-option-text")).getText();
							           // Optionspayment.click();
						              if(optionText.equals("Cash")) {
									   Thread.sleep(3000);

								//		driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallmentString);
									//	   Thread.sleep(3000);

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
						                UM.selectOptionByText(driver, "Canara Bank");
						            	
						             //   Thread.sleep(3000);
						               // driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallmentString);	
						                //Thread.sleep(3000);

						             //   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
						                break;
							            }
							            else if(optionText.equals("Credit Card")) {
							          
						                	  
						                //	Optionspayment.click();
							                Thread.sleep(3000);

						                	driver.findElement(By.xpath("//input[@formcontrolname='creditCardAckNo']")).sendKeys(ackNumber);	
						                	//   driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallmentString);	
						   	                //Thread.sleep(3000);
						   	
						   	             //   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
						                    break;
							            }
							            else if(optionText.equals("NEFT")) {
						               

						                //	Optionspayment.click();
							                Thread.sleep(3000);
						                	driver.findElement(By.xpath("//input[@formcontrolname='referrenceNo']")).sendKeys(neftReferenceNumber);	

						                //	  driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallmentString);	
							   	                Thread.sleep(3000);
							   	
							   	             //   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
							                    break;

							            }
							            else if(optionText.equals("RTGS")) {
						              
						                	//Optionspayment.click();
							                Thread.sleep(3000);
						                	driver.findElement(By.xpath("//input[@formcontrolname='referrenceNo']")).sendKeys(rtgsReferenceNumber);	
						                //	  driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallmentString);	
							   	                Thread.sleep(3000);
							   	
							   	              //  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
							                    break;

							            }
							            else if(optionText.equals("Direct Transfer to Bank")) {
						                
						               // 	Optionspayment.click();
							                Thread.sleep(3000);
						                	driver.findElement(By.xpath("//input[@formcontrolname='referrenceNo']")).sendKeys(referenceNumber);	
						                //	  driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallmentString);	
							   	                Thread.sleep(3000);
							   	
							   	              //  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
							                    break;

							            }
							            else if(optionText.equals("TDS")) {
						                	//Optionspayment.click();
							                Thread.sleep(3000);

						               // 	driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallmentString);	
						                	driver.findElement(By.xpath("//input[@formcontrolname='paymentModeRemarks']")).sendKeys("Miscellaneous_Fee_Collection");	
						   	              
						              //  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
						                break;

							            }
							            else if(optionText.equals("Others")){
							            	
							            //	Optionspayment.click();
							                Thread.sleep(3000);
						                	driver.findElement(By.xpath("//input[@formcontrolname='paymentModeRemarks']")).sendKeys("Miscellaneous_Fee_Collection");	


						                //	driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallmentString);	
						   	             //   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();

							            }
						   	         else {
						 				driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
						                Thread.sleep(3000);
						                optionText="";	   	    
						                }
									} 
									}   // Default action if option not matched
						  			Thread.sleep(4000);


								     
			driver.findElement(By.xpath("//div[text()='Others ']")).click();
  			Thread.sleep(4000);

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
				driver.findElement(By.xpath("//span[text()=' Preview Receipt ']")).click();
				Thread.sleep(2000); 

				driver.findElement(By.xpath("//span[text()=' Close ']")).click();
				   Thread.sleep(3000);

					driver.findElement(By.xpath("//span[text()=' Save and Print ']")).click();
					   Thread.sleep(2000);

					String Details =driver.findElement(By.xpath("/html/body/div[3]/div/h2")).getText();

					System.out.println(Details);
					
					String Receiptdetails = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText();
	
					System.out.println(Receiptdetails);
	
	}
	

}
