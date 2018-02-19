package AutomationSelenium;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PrintUniqueElementinthelistbox extends launch{

	public static void main(String[] args) {
		driver.get("file:///C:/Users/Parth/Desktop/qspiders/test/listbox.html");
		WebElement alllist = driver.findElement(By.id("mtr"));
		Select s = new Select(alllist);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println(size);
		System.out.println("Print the value in the list");
		HashSet<String>allelements = new HashSet<String>();
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
			allelements.add(text);
		}
		System.out.println(allelements);

	}

}
