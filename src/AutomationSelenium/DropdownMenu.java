package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DropdownMenu extends launch{

	public static void main(String[] args) {
		driver2.get("https://www.actimind.com");
		WebElement menu = driver2.findElement(By.xpath("//a[contains(.,'AREAS OF EXPERTISE')]"));
		Actions action = new Actions(driver2);
				action.moveToElement(menu).perform();
				driver2.findElement(By.xpath("//a[contains(.,'MS Office Plug-ins')]")).click();
				
				driver2.close();
				driver.close();
				
		
		
		

	}

}
