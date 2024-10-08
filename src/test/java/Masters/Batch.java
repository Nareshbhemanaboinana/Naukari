package Masters;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import devAdmin.Login;
import devAdmin.Login1;

public class Batch extends Login {

	@Test
	public void ADD_Batch() throws InterruptedException {
		Faker fk = new Faker();
		 //  String Name = fk.name().firstName();
        int randNo = fk.number().numberBetween(1, 100);

			  WebElement svenext = driver.findElement(By.xpath("//a[@href='#/masters/batch\']"));
				JavascriptExecutor zz = (JavascriptExecutor) driver;
				zz.executeScript("arguments[0].scrollIntoView()", svenext);
				Thread.sleep(5000);
				zz.executeScript("arguments[0].click()", svenext);
				Thread.sleep(6000);
			
				
				
			
			  	
			  	List<WebElement> dropdowns = driver.findElements(By.cssSelector("mat-select"));
			  	WebElement FirstDropdown = dropdowns.get(0);
			  	WebElement secoendDropdown = dropdowns.get(1);
			  	WebElement ThirdDropdown = dropdowns.get(2);
			  	WebElement fourDropdown = dropdowns.get(3);
			  	WebElement fiveDropdown = dropdowns.get(4);
			  	WebElement sixDropdown = dropdowns.get(5);

				
			  	ThirdDropdown.click();
				Thread.sleep(3000);
				List<WebElement> options=driver.findElements(By.cssSelector("mat-option"));

				for(int j=4; j<=options.size()-1;j++) {
			        int randomNumber = fk.number().numberBetween(1, options.size()-1);

					options.get(randomNumber).click();
					fourDropdown.click();
					Thread.sleep(3000);
			  		List<WebElement> secooptions=driver.findElements(By.cssSelector("mat-option"));

					     if(secooptions.size()==1)  {
					 		Thread.sleep(3000);
					    	//driver.navigate().refresh();
					  	WebElement secoendtime=driver.findElement(By.cssSelector("mat-option"));
					 		Thread.sleep(3000);
					 		secoendtime.click();
					 		Thread.sleep(3000);

						  	ThirdDropdown.click();

					 				}
					     
					      else {

					    	  for(int k=1; k<=secooptions.size()-1;k++) {
						    		 secooptions.get(k).click();
						    			Thread.sleep(3000);

						    		break;


			     }
					    		break;

							
						}

				}	
				
 
				
				String Batch_Name=ThirdDropdown.getText();
			  	
				String Batch_code=fourDropdown.getText();
	
	
			  	
			      driver.findElement(By.xpath("//input[@formcontrolname='sName']")).sendKeys(Batch_Name+"_Batch_"+randNo);
			      driver.findElement(By.xpath("//input[@formcontrolname='sCode']")).sendKeys(Batch_Name+randNo);
			  	zz.executeScript("window.scrollBy(0,500)");

			      	  	
			  	System.out.println("Batch Name :"+Batch_Name+"_Batch_"+randNo);
			  	System.out.println("Batch Code :"+Batch_Name+randNo);

				
		
				
	
	// Get today's date
			    LocalDate today = LocalDate.now();

		        // Format for printing dates
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		        // Print today's date
		      //  System.out.println("Today's Date: " + today.format(formatter));

		        // Calculate date after 30 days
		        LocalDate dateAfter30Days = today.plusDays(30);

		        // Print date after 30 days
		      //  System.out.println("Date after 30 days: " + dateAfter30Days.format(formatter));

	driver.findElement(By.xpath("//input[@formcontrolname='sBatchStartDate']")).sendKeys(today.format(formatter));

			
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@formcontrolname='sBatchFinishDate']")).sendKeys(dateAfter30Days.format(formatter));
	   
	    

	
	fiveDropdown.click();
		List<WebElement> options090=driver.findElements(By.cssSelector("mat-option"));

		for(int j=4; j<=options090.size()-1;j++) {
			options090.get(j).click();

			break;
		}
	Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-batch/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[2]/div[3]/mat-checkbox/label/span[1]")).click();

		driver.findElement(By.xpath("//input[@formcontrolname='iMinimumCapacity']")).sendKeys("40");
		driver.findElement(By.xpath("//input[@formcontrolname='iMaximumCapacity']")).sendKeys("100");
		//driver.findElement(By.xpath("//input[@formcontrolname='iMaximumCapacity']")).sendKeys("100");
		driver.findElement(By.xpath("//input[@formcontrolname='iPreferredCapacity']")).sendKeys("60");
		sixDropdown.click();
	    List<WebElement> mmmatOptions = driver.findElements(By.cssSelector("mat-option"));
	    // Loop through the options to find the desired one
	    for (WebElement option : mmmatOptions) {
	        if (option.getText().equals("2024")) {
	            // Click on the desired option
	            option.click();
	            break; // Exit the loop once the desired option is found and clicked
	        }
	    }
		Thread.sleep(3000);


		driver.findElement(By.xpath("//input[@formcontrolname='fFullPaymentAmount']")).sendKeys("1500");
		driver.findElement(By.xpath("//input[@formcontrolname='iMaxInstallments']")).sendKeys("2");
		Thread.sleep(3000);

		zz.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-batch/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[3]/div/mat-tab-group/div/mat-tab-body/div/div/table/tbody/tr[1]/td[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(today.format(formatter));

			
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-batch/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[3]/div/mat-tab-group/div/mat-tab-body/div/div/table/tbody/tr[2]/td[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(dateAfter30Days.format(formatter));
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-batch/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[4]/div/button[1]/span[1]")).click();
		Thread.sleep(3000);
	
		WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
	      String popups = popup.getText();

		     // String backgroundColor = popup.getCssValue("background-color");
	            if (popups.equalsIgnoreCase("Batch Successfully Created !")) {
	            	WebElement ppopup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
	  	          
	        		
   			   String ppopups = ppopup.getText();
   			     // System.out.println("Background color: " + backgroundColor);

   			      // Print the success message
   			      System.out.println(" message: " + ppopups);
   			

	            }
	            else {

	         		WebElement ppopup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
	          
	        		
	        			   String ppopups = ppopup.getText();
	        			     // System.out.println("Background color: " + backgroundColor);

	        			      // Print the success message
	        			      System.out.println(" message: " + ppopups);
	        		          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");
   
	        	 

	            }
	
	}
}
