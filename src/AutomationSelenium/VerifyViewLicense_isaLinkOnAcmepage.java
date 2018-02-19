package AutomationSelenium;

import org.openqa.selenium.By;

public class VerifyViewLicense_isaLinkOnAcmepage extends launch {

	public static void main(String[] args) {
		driver.get("http://localhost/login.do");
		String tagName = driver.findElement(By.id("licenseLink")).getTagName();
		if (tagName.equals("a")) {
			System.out.println("This is a link");
			
		} else {
			System.out.println("This is not a link");

		}
		driver.close();
	 

	}

}
