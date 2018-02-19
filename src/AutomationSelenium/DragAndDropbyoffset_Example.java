package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropbyoffset_Example extends launch{

	public static void main(String[] args) {
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		String xp ="//h1[.='Block 1']";
		WebElement block1 = driver.findElement(By.xpath(xp));
		String xo ="//h1[.='Block 3']";
		WebElement block3 = driver.findElement(By.xpath(xo));
		Actions action = new Actions(driver);
		action.dragAndDropBy(block1, block3.getLocation().getX()+10,block3.getSize().getHeight()+10).perform();
	

	}

}
