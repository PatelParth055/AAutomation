package AutomationSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.navigate().to("http://google.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
	

	}

}
