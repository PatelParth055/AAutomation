package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathUsingAribute extends launch {

	public static void main(String[] args) throws InterruptedException {
		
		driver.get("http://localhost/login.do");
		String user ="//input[@id='username']";
		driver.findElement(By.xpath(user)).sendKeys("admin");
		String pass ="//input[@name=\"pwd\"]";
		driver.findElement(By.xpath(pass)).sendKeys("manager");
		WebElement clock = driver.findElement(By.xpath("//img[contains(@src,'timer')]"));
		String widthvalue= clock.getAttribute("width");
		System.out.println("the width is :"+widthvalue);
		String hightvalue = clock.getAttribute("height");
		System.out.println("the height is"+hightvalue );
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]//div[contains(text(),'Login ')]")).click();
		Thread.sleep(300);
		driver.close();
		

	}

}
