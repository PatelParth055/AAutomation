package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class NavigateBottomOfThePage extends launch{

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://docs.seleniumhq.org/");
		Thread.sleep(3000);
		driver.findElement(By.id("close")).click();
		WebElement bottompage = driver.findElement(By.id("footer"));
int x = bottompage.getLocation().getX();
int y = bottompage.getLocation().getY();
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy("+x+","+y+")");

driver.close();
	}

}
