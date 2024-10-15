package Reports;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Components.Universal_methods;
import devAdmin.Login1;

public class Receipt_Wise_Collection_Report extends Login1 {

	@Test
	public void Receipt_Wise_Collection_Reports() throws InterruptedException {

		Universal_methods UM=new Universal_methods();
		  WebElement RWCReports = driver.findElement(By.xpath("//a[@href='#/reports/reports-lists\']"));
		
		JavascriptExecutor JS= (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].scrollIntoView()", RWCReports);
		Thread.sleep(1000);
		JS.executeScript("arguments[0].click()", RWCReports);
		Thread.sleep(1000);
		String s="Receipt Wise Collection";

		List<WebElement>	Reports =driver.findElements(By.cssSelector(".col-md-4"));
		
		WebDriverWait wait=new  WebDriverWait (driver, 15);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-md-4")));
		
	WebElement Rep=	Reports.stream().filter(Report-> Report.findElement(By.cssSelector("h1.text-center")).getText()
			.contains(s)).findFirst().orElse(null);
		
		Rep.findElement(By.cssSelector(".mat-button-wrapper")).click(); 
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@formcontrolname='iCityId']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("mat-checkbox")));

	List<WebElement> cities=	driver.findElements(By.cssSelector("mat-checkbox"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("mat-checkbox")));
               
	for(WebElement citie: cities) {
		if(citie.getText().equals("Jaipur")){
			citie.click();
		}
	}
	   driver.findElement(By.xpath("//*[text()=' Save ']")).click();
	   Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@formcontrolname='iFranchiseId']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("mat-checkbox")));
		   Thread.sleep(1000);

	List<WebElement> Franchisee=	driver.findElements(By.cssSelector("mat-checkbox"));
	                
	for(WebElement Franchise: Franchisee) {
		if(Franchise.getText().equals("Jaipur_Franchisee")){
			Franchise.click();
		}
	}
	 
	driver.findElement(By.xpath("//*[text()=' Save ']")).click();
	
	

	
	
	
	}
}

