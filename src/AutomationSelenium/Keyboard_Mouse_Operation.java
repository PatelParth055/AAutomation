package AutomationSelenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keyboard_Mouse_Operation {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/login.do");//opens acti time
		Thread.sleep(3000);
		Robot r = new Robot();
		//mouse movement into x and y cordinate
		r.mouseMove(200, 300);
		//keyboard movement 
		r.keyPress(KeyEvent.VK_CONTROL);//press ALT button on keyboard
		r.keyPress(KeyEvent.VK_F);//press F
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_F);//release f
		r.keyRelease(KeyEvent.VK_CONTROL);//release ALT
		Thread.sleep(300);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);//press w to open new tab;
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_T);//release
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		driver.close();
		driver.quit();
				
	}

}
