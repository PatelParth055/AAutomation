package AutomationSelenium;

import java.util.Set;

public class CloseALLChildbrowsersONLY extends launch {

	public static void main(String[] args) {
		driver.get("https://www.naukri.com/");
		String windowHandleID = driver.getWindowHandle();
		Set<String> allwindowHandles = driver.getWindowHandles();
		int count = allwindowHandles.size();
		System.out.println("number of browser opened in a system is :"+count);
for (String window : allwindowHandles) {
driver.switchTo().window(window);
String title = driver.getTitle();
if (!window.equals(windowHandleID)) {
	driver.close();
	System.out.println("child browser window with "+title+"is closed");
	
}

}
	
	}

}
