package All_Flows;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Update_Resume_foundit {
	public WebDriver driver;

	@Test(retryAnalyzer=Retry.class)
	public void updating_Foundit_Resume() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SSD//chromedriver.exe");


		  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080");
	        options.addArguments("--window-size=1920,1080");
		

		 driver=new ChromeDriver(options); 
	   WebDriverWait wait = new WebDriverWait(driver, (10));

		driver.get("https://www.foundit.in/rio/login");
		driver.manage().window().maximize();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//div[@class='loginWith']")).click();
	Thread.sleep(3000);

	driver.findElement(By.id("signInName")).sendKeys("bhemanaboinanaresh@gmail.com");
	Thread.sleep(3000);

	driver.findElement(By.id("password")).sendKeys("Naresh@123");
	Thread.sleep(3000);

	driver.findElement(By.id("signInbtn")).click();
	Thread.sleep(5000);

	driver.navigate().refresh();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//img[@alt='Bhemanaboina Naresh']")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//a[@href='/seeker/profile']")).click();
	JavascriptExecutor zz = (JavascriptExecutor) driver;

	Thread.sleep(5000);
	zz.executeScript("window.scrollBy(0,300)");
	Thread.sleep(2000);

    File file = new File("./Resume//Naresh Resume 4 years exp in manual and Automation.pdf"); 
    String filePath = file.getAbsolutePath();

    WebElement uploadElement = driver.findElement(By.id("inline-resume"));

   
    uploadElement.sendKeys(filePath);
	Thread.sleep(2000);

    WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Thanks for uploading your resume. You are now one ')]")));

    // Get the text from the popup
    String popupText = popup.getText();

    // Print the text of the popup
    if(popupText.equalsIgnoreCase("Thanks for uploading your resume. You are now one step closer in your job search.")) {


        System.out.println("Resume has been successfully uploaded.");
        }
        else {
            throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

        }
    
    driver.close();
	}
}
