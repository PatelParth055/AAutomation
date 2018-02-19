package AutomationSelenium;

import java.util.Set;

public class CloseMainBrowserOnly extends launch {

	public static void main(String[] args) {
		driver.get("https://www.naukri.com/");
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		int count = windowHandles.size();
		System.out.println("the number of browser opened in your system: "+count);
		for (String window : windowHandles) {
			driver.switchTo().window(window);
			String title = driver.getTitle();
			if (window.equals(windowHandle)) {
				driver.close();
				System.out.println("Main Browser window with title -->"+ title +" --> is closed");
				
			}
			
		}

	}

}
