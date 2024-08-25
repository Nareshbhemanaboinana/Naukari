package Reports;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import devAdmin.Login1;

public class Revenue_Collection_Report extends Login1{
	
	@Test
	public void Revenue_Collection_Reports() throws InterruptedException {

		
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
				   WebElement Revenue = 	driver.findElement(By.xpath("(//h1[@class='text-center py-4'])[9]"));
					//JavascriptExecutor zz = (JavascriptExecutor) driver;
					zz.executeScript("arguments[0].scrollIntoView()", Revenue);
					Thread.sleep(5000);
					driver.findElement(By.xpath("(//button[@color='primary'])[9]")).click();
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

			zz.executeScript("window.scrollBy(0,400)");
			   Thread.sleep(3000);

				
	
		
	
	}

}
