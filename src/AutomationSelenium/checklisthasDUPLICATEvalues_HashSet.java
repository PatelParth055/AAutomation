package AutomationSelenium;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class checklisthasDUPLICATEvalues_HashSet extends launch{

	public static void main(String[] args) {
		driver.get("file:///C:/Users/Parth/Desktop/qspiders/test/listbox.html");
		WebElement listelements = driver.findElement(By.id("mtr"));
Select s = new Select(listelements);
List<WebElement> alloptions = s.getOptions();
int size = alloptions.size();
System.out.println("number of elements in the list" + size);
HashSet<String>list = new HashSet<String>();
for (int i = 0; i < size; i++) {
	String text = alloptions.get(i).getText();
	System.out.println(text);
	list.add(text);
}
	int size2 = list.size();
	System.out.println("Number of elements in the hashset is :" +size2);
if (size==size2) {
	System.out.println("List box has no duplicate values");
} else {
	System.out.println("List box has duplicate values");
}	
	System.out.println(list);
	driver.close();
}


	}


