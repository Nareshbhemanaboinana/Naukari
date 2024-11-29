package All_Flows;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sending_Multile_mails {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./SSD//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("bhemanaboinanaresh@yahoo.com");
		
		driver.findElement(By.name("signin")).click();
		//Thread.sleep(1000);
		driver.findElement(By.id("login-passwd")).sendKeys("Naresh@1231");
		
		driver.findElement(By.id("login-signin")).click();
		
	//	driver.findElement(By.cssSelector(".puree-button-link.challenge-feedback-link.not-now")).click();
		
		driver.findElement(By.id("ybarMailLink")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String>it=windows.iterator();
		
		String paranat=it.next();
		String child=it.next();

		driver.switchTo().window(child);
		
		
		
		for(int i=0;i<=5;i++) {
			WebDriverWait wait=new WebDriverWait(driver, 18);
			
			WebElement compose=	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.e_dRA")));

		compose.click();
		
		
		driver.findElement(By.id("message-to-field")).sendKeys("bhemanaboinanaresh@yopmail.com");
		
		driver.findElement(By.id("compose-subject-input")).sendKeys("TestMail");
		
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("Test sendind mail");
		
		driver.findElement(By.xpath("//*[text()='Send']")).click();
	
		Thread.sleep(3000);
		System.out.println(i);
		
		}
		}

}
