package AutomationSelenium;

import org.openqa.selenium.JavascriptExecutor;



public class ScrollUpandDown  extends launch{

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://seleniumhq.com/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		for (int i = 1; i < 10; i++) 
		{
	js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(3000);
	}
		for (int i = 1; i < 10; i++) {
			js.executeScript("window.scrollBy(0,-1000)");
			Thread.sleep(3000);
			
		}

}
}