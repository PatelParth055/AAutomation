package AutomationSelenium;

import java.util.Set;

public class ChildBrowserPopUp extends launch{

	public static void main(String[] args) {
		driver.get("https://www.naukri.com/");
		Set<String> allwindowHandles = driver.getWindowHandles();  
          int count = allwindowHandles.size();    //count the total number of browser open
System.out.println("Number of browser opened : "+count);
for (String windowhandle : allwindowHandles) {
	driver.switchTo().window(windowhandle);
	String title = driver.getTitle();
	System.out.println("window handler ID of Page:"+title+" is" +windowhandle);
	driver.close();
}
	}

}
