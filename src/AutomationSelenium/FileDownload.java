package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",".//drivers//geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		String key = "browser.helperApps.neverAsk.saveToDisk";
		String value="application/x-zip-compressed";
		profile.setPreference(key,value);
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		
		profile.setPreference("browser.download.folderList", 2);   // 0 - save to desktop, 1 - save to download folder( default), 2 - save to any other //location
		profile.setPreference("browser.download.dir","F:\\test\\");  //save the file to the given folder location
		//DesiredCapabilities cap = DesiredCapabilities.firefox();
		//cap.setCapability(FirefoxDriver.PROFILE, profile);
		WebDriver driver = new FirefoxDriver(option);
		driver.get("http://docs.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[text()='Java']//following-sibling::td[3]/a")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
