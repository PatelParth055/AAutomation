package testngpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class LaunchFirefoxAndChromeTogether {
	static {
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	}
	WebDriver driver;
	@Test
	@Parameters({"browser"})
	public void loginFFandChrome(String browser) throws IOException, InterruptedException{
		if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
driver = new ChromeDriver();
		}
		FileInputStream configpath = new FileInputStream(".\\testdata\\config.properties");
				Properties prop = new Properties();
				prop.load(configpath);
				String url = prop.getProperty("URL");
				driver.get(url);
				WebElement un = driver.findElement(By.id("username"));
				for (int i = 0; i < 10; i++) {
					un.sendKeys("admin"+i);
					Thread.sleep(3000);
					un.clear();	
				}
		driver.close();
		
	}
}

