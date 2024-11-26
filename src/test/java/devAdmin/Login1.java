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
    
	public static String downloadPath=System.getProperty("user.dir");
    
	
	@BeforeMethod
    public void TEEMSLOGIN() throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "./SSD//chromedriver.exe");
	//	System.setProperty("webdriver.gecko.driver", "./SSD//geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "./SSD//chromedriver.exe");
	HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);


		chromePrefs.put("plugins.always_open_pdf_externally", true); // Automatically open PDF externally (bypass Save As)

		chromePrefs.put("download.default_directory", downloadPath);

		ChromeOptions options=new ChromeOptions();

		options.setExperimentalOption("prefs", chromePrefs);


		 driver=new ChromeDriver(options); 
	       //  driver = new ChromeDriver();
	       //   driver = new FirefoxDriver();
	 		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	    
     driver.get("https://dev.syngymaxim.com/TIME_Web/#/admin/schllevel");
   //  driver.get("https://teems3qa.teems.in/web/#/authentication/signin");

		driver.manage().window().maximize();
	//	Thread.sleep(3000);

       driver.navigate().refresh();
   /*
	driver.findElement(By.id("details-button")).click();
	//	Thread.sleep(2000);

		driver.findElement(By.id("proceed-link")).click();
	//	Thread.sleep(2000); 
  
        */
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	WebElement  Login= driver.findElement(By.xpath("//input[@formcontrolname='username']"));
	//Login.sendKeys(uid);
	Login.sendKeys("Chennai_Office-II");

	WebElement  pswd= driver.findElement(By.xpath("//input[@formcontrolname='password']"));
			pswd.sendKeys("Test@1231");

	//	pswd.sendKeys(psword);
		//Thread.sleep(2000);

		WebElement  Submit=driver.findElement(By.xpath("//button[@type='submit']"));
		Submit.click();
		Thread.sleep(5000);
	}
		 

	/*	
	@AfterMethod()
	public void teardown() {
		driver.quit();
	}	 
	*/
}
	
	


