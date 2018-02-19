package AutomationSelenium;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PrintListValues_SortedOrder extends launch {

	public static void main(String[] args) throws InterruptedException {
		driver.get("file:///C:/Users/Parth/Desktop/qspiders/test/listbox.html");
		WebElement listElement = driver.findElement(By.id("mtr"));
		Select s = new Select(listElement);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println("The size is "+size);
		ArrayList<String>list = new ArrayList<String>();
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
			
			list.add(text);	
		}
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Print the value in sorted order");
		for (String value: list) {
System.out.println(value);	

		}
	}
}


