package All_Flows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import okio.Timeout;

public class sending_mails {
	
	@Test
	public void sending_mail() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./SSD//chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, Timeout.sec);
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("createacc")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Bhemanaboi");
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Nanaresh");
		driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("BhemanaboiNanaresh");
		
		driver.findElement(By.id("usernamereg-password")).sendKeys("Naresh@1231");
		WebElement drop=driver.findElement(By.id("usernamereg-month"));
		Select sc=new  Select(drop);
	
		sc.selectByVisibleText("July");
		
		driver.findElement(By.id("usernamereg-day")).sendKeys("28");
		
		driver.findElement(By.id("usernamereg-year")).sendKeys("1994");
		
		driver.findElement(By.id("reg-submit-button")).click();

		
	}

}
