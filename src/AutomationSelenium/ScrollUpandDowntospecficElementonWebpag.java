package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollUpandDowntospecficElementonWebpag extends launch {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://docs.seleniumhq.org/");
		Thread.sleep(3000);
		driver.findElement(By.id("close")).click();
		WebElement ele = driver.findElement(By.xpath("//img[contains(@src,'applitools')]"));
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy("+x+","+y+")");
Thread.sleep(3000);
driver.close();

	}

}
