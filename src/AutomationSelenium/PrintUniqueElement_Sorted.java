package AutomationSelenium;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PrintUniqueElement_Sorted extends launch {

	public static void main(String[] args) {
		driver.get("file:///C:/Users/Parth/Desktop/qspiders/test/listbox.html");
		WebElement listelements = driver.findElement(By.id("mtr"));
Select s = new Select(listelements);
List<WebElement> options = s.getOptions();
int size = options.size();
System.out.println(size);
TreeSet<String> list = new TreeSet<String>();
for (WebElement webElement : options) {
	String text = webElement.getText();
	System.out.println(text);
list.add(text);
}
	System.out.println(list);
	}

}
