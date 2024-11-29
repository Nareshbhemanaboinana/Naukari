package Excelindia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cleck_Index extends Save_and_Finish_Button{
	
	
	public static void Select_Index_and_click_details(WebDriver driver,int indexnumber) {
		
        driver.findElement(By.xpath("(//i[@class='fa-solid fa-ellipsis-vertical'])["+2+"]")).click();
        
        driver.findElement(By.xpath("(//*[text()='Details'])["+2+"]")).click();

		
		
	}

}
