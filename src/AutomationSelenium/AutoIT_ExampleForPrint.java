//1. Navigate to actiTIME login page. 
//2. By default, username text box will be active. 
//3. Press Control + P using Robot class and ensure the print window popup is displayed 
//4. On the Print window, click on Cancel button by using AutoIT 

package AutomationSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class AutoIT_ExampleForPrint extends launch {

	public static void main(String[] args) throws AWTException, IOException {
		driver.get("http://localhost/login.do");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Runtime run = Runtime.getRuntime();
				run.exec("C:\\Users\\Parth\\Desktop\\qspiders\\test\\AutoITClickOnCancleButton.exe");
				
				
	}

}
