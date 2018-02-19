package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PrintToolp_Acme_RememberCheckbox extends launch {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://localhost/login.do");
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		String tooltip = checkbox.getAttribute("title");
		System.out.println(tooltip);
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
