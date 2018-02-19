package testngpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGridDemo {
@Test
@Parameters({"node","browser"})
public void LaunchFirefoxAndChrome(String node,String browser) throws MalformedURLException, InterruptedException{
	URL whichsystem = new URL(node);
	DesiredCapabilities whichbrowser = new DesiredCapabilities();
	whichbrowser.setBrowserName(browser);
	WebDriver driver = new RemoteWebDriver(whichsystem,whichbrowser);
	driver.get("http://localhost/login.do");
	WebElement un = driver.findElement(By.id("username"));
	for (int i = 0; i < 10; i++) {
		un.sendKeys("admin"+i);
		Thread.sleep(3000);
		un.clear();
	
	
}
}}
