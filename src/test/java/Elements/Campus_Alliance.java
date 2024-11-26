package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import devAdmin.Login1;

public class Campus_Alliance extends Login1{
	

	
	public static void viewandclickcampusalliance(WebDriver driver) throws InterruptedException {
		
		 WebElement svenextt = driver.findElement(By.xpath("//a[@href='#/admin/campus']"));
			JavascriptExecutor zz = (JavascriptExecutor) driver;
			zz.executeScript("arguments[0].scrollIntoView()", svenextt);
			Thread.sleep(5000);
			zz.executeScript("arguments[0].click()", svenextt);

		
	}
	
	public static void enternameofinstitute(WebDriver driver, String Name) {
		
		driver.findElement(By.xpath("//input[@formcontrolname='sCampusName']")).sendKeys(Name);

	}
	
	public static void entercampusgroupcode(WebDriver driver, String Name) {
		
		driver.findElement(By.xpath("//input[@formcontrolname='sGroupCode']")).sendKeys(Name+"D");

	}
	
	public static void enterassigntocampus(WebDriver driver, String Name) {
		 WebDriverWait wait = new WebDriverWait(driver, (10));

		WebElement insnme=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='sGroupName']")));
		insnme.sendKeys(Name+"-Institute");			

	}
	
	public static void AddCoordinatordetails(WebDriver driver,String Name) throws InterruptedException {

		driver.findElement(By.xpath("//img[@src='assets/images/times/add.png']")).click();
		driver.findElement(By.xpath("//input[@formcontrolname='sName']")).sendKeys(Name);

		driver.findElement(By.xpath("//input[@formcontrolname='sDesignation']")).sendKeys("Marketing Head");
		
		driver.findElement(By.xpath("//input[@formcontrolname='sEmail']")).sendKeys(Name+"@yopmail.com");

		driver.findElement(By.xpath("//input[@formcontrolname='sMobileNo']")).sendKeys("9988778899");

		driver.findElement(By.xpath("//input[@formcontrolname='sAlternateNo']")).sendKeys("9988778899");

		driver.findElement(By.xpath("//span[text()=' Submit ']")).click();
		Thread.sleep(3000);

	}

}
