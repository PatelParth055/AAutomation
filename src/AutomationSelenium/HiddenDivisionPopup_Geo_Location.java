package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class HiddenDivisionPopup_Geo_Location {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",".//drivers//geckodriver.exe");
		
		FirefoxOptions option = new FirefoxOptions();
		//DesiredCapabilities cap = new DesiredCapabilities();
		FirefoxProfile profile =  new FirefoxProfile();
		profile.setPreference("geo.enabled", false);
		option.setCapability(FirefoxDriver.PROFILE, profile);
		WebDriver driver = new FirefoxDriver(option);
		
driver.get("https://www.cleartrip.com/");
driver.findElement(By.xpath("(//input[@placeholder='Pick a date'])[1]")).click(); 
Thread.sleep(3000); 
driver.findElement(By.linkText("24")).click(); 
	}

}
