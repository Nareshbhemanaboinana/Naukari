package Reports;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Components.Universal_methods;
import devAdmin.Login1;

public class Discount extends Login1{
	
	@Test
	public void Discounts() throws InterruptedException {

		Universal_methods UM=new Universal_methods ();

		
		  WebElement Reports = 	driver.findElement(By.xpath("//a[@href='#/reports/reports-lists']"));
			JavascriptExecutor zz = (JavascriptExecutor) driver;
			zz.executeScript("arguments[0].scrollIntoView()", Reports);
			Thread.sleep(5000);
			zz.executeScript("arguments[0].click()", Reports);

			   Thread.sleep(6000);
				//driver.findElement(By.xpath("(//button[@color='primary'])[1]")).click();
						//   Thread.sleep(2000);
				driver.findElement(By.xpath("//div[text()='Others']")).click();
				   Thread.sleep(3000);
				   WebElement Revenue = 	driver.findElement(By.xpath("(//h1[@class='text-center py-4'])[8]"));
					//JavascriptExecutor zz = (JavascriptExecutor) driver;
					zz.executeScript("arguments[0].scrollIntoView()", Revenue);
					Thread.sleep(5000);
					driver.findElement(By.xpath("(//button[@color='primary'])[8]")).click();
					   Thread.sleep(3000);

			    	driver.findElement(By.xpath("//input[@formcontrolname='city']")).click();
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

					
			    	driver.findElement(By.xpath("//input[@formcontrolname='franchise']")).click();
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
			    	driver.findElement(By.xpath("//input[@formcontrolname='office']")).click();
			    	Thread.sleep(3000);
			    	List<WebElement> iOffices =driver.findElements(By.cssSelector("mat-checkbox"));
			    	for(WebElement iOffice:iOffices ) {
			    		if(iOffice.getText().equalsIgnoreCase("Amaravati_Office-II")) {
			    			Thread.sleep(4000);
			    			iOffice.click();
			    		}
			    	}
			    	Thread.sleep(3000);

					driver.findElement(By.xpath("//span[text()=' Save ']")).click();
			    	Thread.sleep(3000);

						    LocalDate today = LocalDate.now();
					        LocalDate date30DaysBack = today.minusDays(30);

					        // Format for printing dates
					        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
							   Thread.sleep(2000);

								driver.findElement(By.xpath("//input[@formcontrolname='dateFrom']")).sendKeys(date30DaysBack.format(formatter));
								   Thread.sleep(3000);

							driver.findElement(By.xpath("//input[@formcontrolname='dateTo']")).sendKeys(today.format(formatter));
							   Thread.sleep(3000);

							zz.executeScript("window.scrollBy(0,400)");
							   Thread.sleep(3000);


						driver.findElement(By.xpath("//span[text()=' OK ']")).click();

						   Thread.sleep(3000);

							zz.executeScript("window.scrollBy(0,400)");
							   Thread.sleep(3000);

		
	}

}
