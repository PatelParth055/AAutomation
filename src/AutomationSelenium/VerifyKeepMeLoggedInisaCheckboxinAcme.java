package AutomationSelenium;

import org.openqa.selenium.By;

public class VerifyKeepMeLoggedInisaCheckboxinAcme extends launch {

	public static void main(String[] args) {
		driver.get("http://localhost/login.do");
		String checkbox = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("type");
		System.out.println(checkbox);
		if (checkbox.equalsIgnoreCase("checkbox")) {
	System.out.println("This is a checkbox ");		
		} else {
			System.out.println("NOT a checkbox");

		}
driver.close();
	}

}
