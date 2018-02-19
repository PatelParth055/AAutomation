package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample extends launch {

	public static void main(String[] args) {
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		String xp ="//h1[.='Block 1']";
		WebElement block1 = driver.findElement(By.xpath(xp));
		String xo ="//h1[.='Block 3']";
		WebElement block2 = driver.findElement(By.xpath(xo));
		Actions action = new Actions(driver);
		action.dragAndDrop(block1,block2).perform();

	}

}
