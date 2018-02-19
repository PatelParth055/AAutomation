package AutomationSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutosuggestionEx_GoogleSearch extends launch{

	public static void main(String[] args) throws InterruptedException {
		driver2.get("https://www.google.com");
		driver2.findElement(By.id("lst-ib")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> alloptoins = driver2.findElements(By.xpath("//*[contains(text(),'selenium')]"));
 int count = alloptoins.size();
 System.out.println("number of values present in dropdown"+count);
 String expectedstring = "selenium interview questions";
 for (WebElement options : alloptoins) {
	String text = options.getText();
	System.out.println(""+text);
 
	if (text.equalsIgnoreCase(expectedstring)) {
		options.click();
		
		
		
		
	}
}
 
	}

}
