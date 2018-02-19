package AutomationSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextClickusingAconsClass extends launch {

	public static void main(String[] args) throws InterruptedException, AWTException {
	driver2.get("http://localhost/login.do");
	WebElement link = driver2.findElement(By.linkText("Actimind Inc."));
	Actions actions = new Actions(driver2);
	actions.contextClick(link).perform();
	Thread.sleep(3000);
	//driver2.close();
	Robot r = new Robot();
			r.keyPress(KeyEvent.VK_W);
			r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(3000);
		driver2.close();

	}

}
