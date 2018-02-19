package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyUNtextboxisEnabledinAcme extends launch {

	public static void main(String[] args) {
		driver.get("http://localhost/login.do");
		WebElement userenabled = driver.findElement(By.id("username"));
		if (userenabled.isEnabled()) {
			System.out.println("Username is enabled");
		} else {
System.out.println("Username is disabled");
		}
		driver.close();
	}

}
