package devAdmin;




import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import USERS_ROLES.XLUtils;



public class Login1 {
	
	public   WebDriver driver;
    
	//public static String downloadPath=System.getProperty("user.dir");
    
	
	@BeforeMethod
    public void TEEMSLOGIN() throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "./SSD//chromedriver.exe");
	//	System.setProperty("webdriver.gecko.driver", "./SSD//geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "./SSD//chromedriver.exe");
		 String downloadPath = "C:\\selenium\\downloads";

		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--no-sandbox");
		 options.addArguments("--disable-dev-shm-usage");
		 options.addArguments("--disable-gpu");
		 options.addArguments("--window-size=1920,1080");
		 // Do NOT add headless mode unless necessary
	     

		 driver=new ChromeDriver(options); 
	       //  driver = new ChromeDriver();
	       //   driver = new FirefoxDriver();
	 		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	    
    driver.get("https://dev.syngymaxim.com/TIME_Web/#/admin/schllevel");
  //  driver.get("https://teems3qa.teems.in/web/#/authentication/signin");

		driver.manage().window().maximize();
	//	Thread.sleep(3000);

       driver.navigate().refresh();
       
   /*    if(driver.findElement(By.id("details-button")).isDisplayed()) {
    		driver.findElement(By.id("details-button")).click();
    			Thread.sleep(2000);

    			driver.findElement(By.id("proceed-link")).click();
    			Thread.sleep(2000); 
  
       }
       else {
    	   driver.navigate().refresh();
       } */

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	WebElement  Login= driver.findElement(By.xpath("//input[@formcontrolname='username']"));
	//Login.sendKeys(uid);
	Login.sendKeys("Jaipur_Office-I");

	WebElement  pswd= driver.findElement(By.xpath("//input[@formcontrolname='password']"));
			pswd.sendKeys("Test@1231");

	//	pswd.sendKeys(psword);
		//Thread.sleep(2000);

		WebElement  Submit=driver.findElement(By.xpath("//button[@type='submit']"));
		Submit.click();
		Thread.sleep(5000);
	}
		 

	
	@AfterMethod()
	public void teardown() {
		driver.quit();
	}	 
	
}
	
	


