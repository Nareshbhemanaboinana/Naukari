package All_Flows;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import Components.Universal_methods;
import devAdmin.Login;

public class Update_Resume {
	
	@Test
	public void updating_Noukary_Resume() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SSD//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.id("usernameField")).sendKeys("bhemanaboinanaresh@gmail.com");
	Thread.sleep(3000);

	driver.findElement(By.id("passwordField")).sendKeys("Naresh@123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	Thread.sleep(3000);

	driver.navigate().refresh();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//*[text()='View']")).click();
	Thread.sleep(3000);

    driver.findElement(By.xpath("//span[@data-title='delete-resume']")).click();
	Thread.sleep(3000);

    WebElement deleteButton = driver.findElement(By.xpath("/html/body/div[6]/div[7]/div/div/button")); // Using class name

    // Click the delete button
    deleteButton.click();
	JavascriptExecutor zz = (JavascriptExecutor) driver;

	Thread.sleep(5000);
	Thread.sleep(2000);
	zz.executeScript("window.scrollBy(0,300)");
	Thread.sleep(2000);
    File file = new File("./Resume//(Naresh) Resume 3+yers manual &automation testing ().pdf"); // Replace with the actual file name
    String filePath = file.getAbsolutePath();

    WebElement uploadElement = driver.findElement(By.id("attachCV"));

   
    uploadElement.sendKeys(filePath);
    
    
    
    
    WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='msg']")));
    String messageText = messageElement.getText();

   // if(messageText.equalsIgnoreCase("Resume has been successfully uploaded.")) {
     if(messageText.equalsIgnoreCase("has been  uploaded.")) {
	
    System.out.println("Resume has been successfully uploaded.");
    }
    else {
        throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

    }

	

	
	}
	}


