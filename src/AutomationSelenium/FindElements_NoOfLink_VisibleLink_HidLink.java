package AutomationSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements_NoOfLink_VisibleLink_HidLink extends launch{

	public static void main(String[] args) {
		driver.get("http://localhost/login.do");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int TotalLinks = alllinks.size();
		System.out.println("Total Number oF link In actiTime page"+TotalLinks);
		int visiblelinkCount=0;
		int hiddenlinkcount=0;
		for (WebElement links : alllinks) {
			if (links.isDisplayed()) {
				visiblelinkCount++;
				String text = links.getText();
				System.out.println(visiblelinkCount+" --> "+text);
				
			} else {
				hiddenlinkcount++;
				}
			}
		System.out.println("Total Number of Visible Link -->"+visiblelinkCount);
		System.out.println("Total Number of Hidden Link -->"+hiddenlinkcount);
		driver.close();

	}

}
