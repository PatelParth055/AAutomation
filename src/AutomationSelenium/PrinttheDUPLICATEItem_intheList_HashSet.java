package AutomationSelenium;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PrinttheDUPLICATEItem_intheList_HashSet extends launch {

	public static void main(String[] args) {
		driver.get("file:///C:/Users/Parth/Desktop/qspiders/test/listbox.html");
		WebElement listbox = driver.findElement(By.id("mtr"));
Select s = new Select(listbox);
List<WebElement> alloptions = s.getOptions();
int count = alloptions.size();
System.out.println("Number of element in the list"+count);
HashSet<String>allelement = new HashSet<String>();
for (int i = 0; i < count; i++) {
	String text = alloptions.get(i).getText();
	if (!allelement.add(text)) {
		System.out.println(text + "is the duplicate item in list box");
	}
}
System.out.println(allelement.size());
System.out.println(allelement);

	}

}
