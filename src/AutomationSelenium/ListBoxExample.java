package AutomationSelenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ListBoxExample extends launch {

	public static void main(String[] args) throws InterruptedException {
		driver.get("file:///C:/Users/Parth/Desktop/qspiders/test/listbox.html");
		WebElement list = driver.findElement(By.id("mtr"));
		Select s = new Select(list);
		List<WebElement> options = s.getOptions();
		int count = options.size();
		System.out.println("The number of options available in the list are :"+count);
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
		}
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("v");
		Thread.sleep(3000);
		s.selectByVisibleText("POORI");
		System.out.println("-------Print all selected options --------");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
        int size2 = allSelectedOptions.size();
        System.out.println("The selected  number of options are:"+size2);
        for (WebElement selectedoptions : allSelectedOptions) {
String text2 = selectedoptions.getText();
System.out.println(text2);
		}
        System.out.println(" Check wheather it is multiple select list box or not");
        boolean multiple = s.isMultiple();
        System.out.println(multiple +  "yes it is multiple");
        if(multiple)
        {
       WebElement firstSelectedOption = s.getFirstSelectedOption();
       String text = firstSelectedOption.getText();
       System.out.println(text +  "is the first selected option in the list box");
       s.deselectByIndex(0);
       WebElement firstSelectedOption2 = s.getFirstSelectedOption();
       String text2 = firstSelectedOption2.getText();
       System.out.println(text2 +  "NOw this is the first select option");
       s.deselectByValue("v");
       WebElement firstSelectedOption3 = s.getFirstSelectedOption();
String text3 = firstSelectedOption3.getText();
System.out.println(text3 +  "this is now the first selected items");
s.deselectByVisibleText("POORI");  
        }
	}
}
