package Masters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import devAdmin.Login1;

public class School_or_College extends Login1{
	
	@Test
	public void Adding_School_or_College() throws InterruptedException { 
	
	Faker fk = new Faker();
    String fakeSchoolName = fk.university().name();
    String Schoolcode = fk.regexify("[A-Z]{2}"); // Example: Generate a 12-character alphanumeric string

	Thread.sleep(3000);
	
	WebElement svenext = driver.findElement(By.xpath("//a[@href='#/masters/school-college']"));
	JavascriptExecutor zz = (JavascriptExecutor) driver;
	zz.executeScript("arguments[0].scrollIntoView()", svenext);
	Thread.sleep(4000);
	zz.executeScript("arguments[0].click()", svenext);
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//input[@formcontrolname='sName']")).sendKeys(fakeSchoolName);
	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@formcontrolname='sCode']")).sendKeys(Schoolcode);
	Thread.sleep(3000);

    driver.findElement(By.cssSelector("mat-select[formcontrolname='iCity']")).click();
	Thread.sleep(3000);

    List<WebElement> Optionss = driver.findElements(By.cssSelector("mat-option"));
    // Loop through the options to find the desired one
  
    for (int i=0; i<=Optionss.size()-1; i++) {
    	Optionss.get(1).click();
    	Thread.sleep(3000); 
    	break;
          

    	}

	   Thread.sleep(3000);
		zz.executeScript("window.scrollBy(0,500)");
		  Thread.sleep(3000);

    driver.findElement(By.cssSelector("mat-select[formcontrolname='iAcademicLevel']")).click();
	Thread.sleep(3000);

    
    List<WebElement> Acadamiclevel = driver.findElements(By.cssSelector("mat-option"));
    // Loop through the options to find the desired one
  
    for (int i=0; i<=Acadamiclevel.size()-1; i++) {
    	Acadamiclevel.get(1).click();
    	Thread.sleep(3000); 
    	break;
          

    	}

    driver.findElement(By.xpath("//span[text()=' Save ']")).click();

	WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
    String popups = popup.getText();
    

	     // String backgroundColor = popup.getCssValue("background-color");
          if (popups.equalsIgnoreCase("School or College Successfully Created !")) {
          	//WebElement ppopup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));

        	  System.out.println(popups);

	
          }
          else {
        	  System.out.println("Test Fail");
          }
	}
}
