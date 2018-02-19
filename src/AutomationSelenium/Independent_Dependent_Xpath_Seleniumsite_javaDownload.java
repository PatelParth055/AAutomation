package AutomationSelenium;

import org.openqa.selenium.By;

public class Independent_Dependent_Xpath_Seleniumsite_javaDownload extends launch {
	public static void main(String[] args) {
		 driver.get("http://docs.seleniumhq.org/download/");
		 String xp="//td[text()='Java']/..//a[.='Download']";
		driver.findElement(By.xpath(xp)).click();
		
	}
	

}
