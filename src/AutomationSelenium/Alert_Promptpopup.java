package AutomationSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Alert_Promptpopup extends launch{

	public static void main(String[] args) throws InterruptedException {
		driver.get("file:///C:/Users/Parth/Desktop/qspiders/test/alert.html");
		driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		alert.sendKeys("hi");
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		alert.dismiss();
		
		
		
		
	

	}

}
