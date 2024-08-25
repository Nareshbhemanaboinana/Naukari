package Reports;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import devAdmin.Login1;

public class Course_Wise_Collection_Report extends Login1{
	
	@Test
	public void Course_Wise_Collection_Reports() throws InterruptedException {

		WebDriverWait     wait = new WebDriverWait(driver, 15);

		
WebElement Reports = 	driver.findElement(By.xpath("//a[@href='#/reports/reports-lists']"));
JavascriptExecutor zz = (JavascriptExecutor) driver;
zz.executeScript("arguments[0].scrollIntoView()", Reports);
Thread.sleep(5000);
zz.executeScript("arguments[0].click()", Reports);

Thread.sleep(6000);

	driver.findElement(By.xpath("//div[text()='Collections']")).click();
	   Thread.sleep(3000);

 List<WebElement> reportElements = driver.findElements(By.xpath("//h1"));

 // Iterate through the list of report elements
 for (WebElement reportElement : reportElements) {
     String reportTitle = reportElement.getText();

     // Print the report title
   if(reportTitle.contains("Course Wise Collection")) {
       System.out.println("Found report: " + reportTitle);

     // Locate the corresponding "View" button and click it
     WebElement viewButton = reportElement.findElement(By.xpath("following::button[contains(@routerlink,'/reports')]"));
     viewButton.click();
			   Thread.sleep(2000);
			   break;

   }
   
 }
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
}Thread.sleep(3000);

driver.findElement(By.xpath("//span[text()=' Save ']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@formcontrolname='course']")).click();
Thread.sleep(3000);
List<WebElement> ofccheckboedxs =driver.findElements(By.cssSelector("mat-checkbox"));
for(WebElement ofccheckbox:ofccheckboedxs ) {
if(ofccheckbox.getText().equalsIgnoreCase("MBA")) {
	Thread.sleep(4000);
	ofccheckbox.click();
}
}Thread.sleep(3000);

driver.findElement(By.xpath("//span[text()=' Save ']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@formcontrolname='iSubCourseId']")).click();
Thread.sleep(3000);
List<WebElement> ofccheckboxs1 =driver.findElements(By.cssSelector("mat-checkbox"));
for(WebElement ofccheckbox:ofccheckboxs1 ) {
if(ofccheckbox.getText().equalsIgnoreCase("Finance")) {
	Thread.sleep(4000);
	ofccheckbox.click();
}
}Thread.sleep(2000);

driver.findElement(By.xpath("//span[text()=' Save ']")).click();
Thread.sleep(2000);

zz.executeScript("window.scrollBy(0,500)");
Thread.sleep(3000);

LocalDate today = LocalDate.now();
LocalDate date30DaysBack = today.minusDays(30);

// Format for printing dates
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@formcontrolname='dateFrom']")).sendKeys(date30DaysBack.format(formatter));
Thread.sleep(2000);

driver.findElement(By.xpath("//input[@formcontrolname='dateTo']")).sendKeys(today.format(formatter));
Thread.sleep(2000);

driver.findElement(By.xpath("//span[text()=' OK ']")).click();

Thread.sleep(3000);

zz.executeScript("window.scrollBy(0,400)");
Thread.sleep(3000);

WebElement courseElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-main-layout/app-course-wise-collection-report/section/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/table/tbody/tr/td[1]")));
String course = courseElement.getText();

   if(course.equalsIgnoreCase("MBA")) {
	   System.out.println("Test is pass");
   }
   else {
	   System.out.println("Test is Fail");

   }

	}
}
