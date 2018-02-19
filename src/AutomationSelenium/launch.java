package AutomationSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch {

	static {
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	}
   static    WebDriver driver = new FirefoxDriver();
   static  WebDriver driver2 = new ChromeDriver();

		

	}


