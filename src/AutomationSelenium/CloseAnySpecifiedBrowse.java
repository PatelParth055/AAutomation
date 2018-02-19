package AutomationSelenium;

import java.util.Set;

public class CloseAnySpecifiedBrowse extends launch {

	public static void main(String[] args) {
		driver.get("https://www.naukri.com/");
		String expectedtitle = "Tech Mahindra";
		//String parentwindow = driver.getWindowHandle();
		Set<String> allwindowHandles = driver.getWindowHandles();
		int count = allwindowHandles.size();
		System.out.println("the nmber of browser is opened in your system:"+count);
		for (String window : allwindowHandles) {
			
driver.switchTo().window(window);
String title = driver.getTitle();
if (title.contains(expectedtitle))
{
driver.close();
System.out.println("specificbrowser window with title"+title+"is closed");
}
		}

	}

}
