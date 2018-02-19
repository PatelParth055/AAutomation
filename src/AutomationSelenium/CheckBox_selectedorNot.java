package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox_selectedorNot extends launch{
	public static void main(String[] args) {
	driver.get("http://localhost/login.do");	
	WebElement checkbox = driver.findElement(By.name("remember"));
	checkbox.click();
	if (checkbox.isSelected()) {
		System.out.println("checkbox is selected");
		
	} else {
System.out.println("checkbox is not selected");
	}
	}

}
