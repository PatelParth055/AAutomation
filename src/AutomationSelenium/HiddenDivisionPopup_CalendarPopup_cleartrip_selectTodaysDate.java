package AutomationSelenium;

//import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HiddenDivisionPopup_CalendarPopup_cleartrip_selectTodaysDate extends launch {

	public static void main(String[] args) throws InterruptedException {
		
		//Date d = new Date(0); 
		//String str = d.toString(); 
		//String[] str2 = str.split(" "); 
		//String today = str2[2]; 
		
		FirefoxOptions option = new FirefoxOptions();
		
		option.addArguments("-disable-Location");
		option.addArguments("-disable-notifications");
		option.addArguments("ignore-certificate-errors");
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//input[@placeholder='Pick a date']"));
		driver.findElement(By.xpath("(//input[@placeholder='Pick a date'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("16")).click();
		
		

	}

}
