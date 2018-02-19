package AutomationSelenium;

import org.openqa.selenium.By;

public class PrintVersion_AcmeLoginPage extends launch{

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://localhost/login.do");
		String version = driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME')]")).getText();
		System.out.println("The version is :" +version);
		Thread.sleep(3000);
		driver.close();

	}

}
