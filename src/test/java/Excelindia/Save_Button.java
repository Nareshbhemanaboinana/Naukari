package Excelindia;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Save_Button {
	
	public   WebDriver driver;

	@Test
	public void Upload_File_and_Validate_click_save_button() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./SSD//chromedriver.exe");

		driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait (driver,20);

		driver.get("https://ecw.excelindia.com/TESTR3s/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("assr41_9750@hdc.com");
		
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("a");
		
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		
		driver.findElement(By.xpath("//*[@src='./assets/images/home-icons/projects.svg']")).click();
		
		driver.findElement(By.xpath("//*[@placeholder='Search...']")).sendKeys("9750-02-CW-YE-GCEA-8286");
		
		driver.findElement(By.xpath("//*[@class='srchwrap']")).click();
		
		Thread.sleep(3000);
		
		WebElement Element=driver.findElement(By.xpath("(//*[@class='ng-star-inserted'])[7]"));
     
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", Element);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@src='assets/images/v_3dots.svg']")));
		
		driver.findElement(By.xpath("//*[@src='assets/images/v_3dots.svg']")).click();
		
		driver.findElement(By.xpath("//*[text()='Dashboard']")).click();
		
		
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".table-summary table")));

         // Locate the table element dynamically during each iteration
         WebElement tableElement = driver.findElement(By.cssSelector(".table-summary table"));

         // Get the rows dynamically
         List<WebElement> rows = tableElement.findElements(By.tagName("tr"));

         // Iterate through each row
         for (int i = 0; i < rows.size(); i++) {
             // Re-fetch the table and rows in each iteration to avoid stale references
             tableElement = driver.findElement(By.cssSelector(".table-summary table"));
             rows = tableElement.findElements(By.tagName("tr"));

             // Get the current row
             WebElement row = rows.get(i);

             // Locate the columns in the current row
             List<WebElement> columns = row.findElements(By.tagName("td"));

             // Print each column value
             for (WebElement column : columns) {
                 System.out.print(column.getText() + " | ");
             }
             System.out.println(); // New line after each row
         }

     
	
         driver.findElement(By.xpath("(//i[@class='fa-solid fa-ellipsis-vertical'])[2]")).click();
         
         driver.findElement(By.xpath("(//*[text()='Details'])[2]")).click();
         
  /* WebElement     Test1  =driver.findElement(By.xpath("(//*[@fdprocessedid='wwye4o'])"));
         
   Test1.sendKeys("5"); 
   
   WebElement     Test2  =    driver.findElement(By.xpath("(//*[@fdprocessedid='ic20do'])")).sendKeys("5");

   Test2.sendKeys("5");
         driver.findElement(By.xpath("(//*[@fdprocessedid='l8wz2'])")).sendKeys("5");  */
         
 	//	Thread.sleep(3000);
         
         


     WebElement Uploadfile= driver.findElement(By.id("acwindividualUpload"));
     
     String withoutvalidFile="C://selenium//TEEMS_3.0//Naresh Automation.pdf";
     
     Uploadfile.sendKeys(withoutvalidFile);
     
     WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
         
     
     System.out.println(popup.getText());
  		
         Thread.sleep(3000);

         String withvalidFile="C://selenium//TEEMS_3.0//90000402.pdf";
         
         Uploadfile.sendKeys(withvalidFile);
         Thread.sleep(3000);

 
     String filename=    driver.findElement(By.linkText("90000402.pdf")).getText();
  
     if(filename.contains("90000402.pdf")) {
         System.out.println("File uploaded successfully.");
         System.out.println("uploaded file Name is :"+filename);

     }
         
          driver.findElement(By.xpath("//*[text()='Save']")).click();   
         
          Thread.sleep(4000);

          WebElement backButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Back']")));
          
          // Click the element
          backButton.click();
     
		
	}

	

		
	}
	
	

