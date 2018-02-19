package AutomationSelenium;

import java.util.Set;

import org.openqa.selenium.By;

public class HandleTabs_using_getWindowHandles extends launch {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://localhost/login.do");
		String parentwindowHandle = driver.getWindowHandle();
		driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='Actimind Inc.']")).click();
Thread.sleep(3000);
Set<String> windowHandles = driver.getWindowHandles();
for (String allwindow : windowHandles) {
	driver.switchTo().window(allwindow);
}
String childtitle = driver.getTitle();
System.out.println("title of child tab is :" +childtitle);
Thread.sleep(3000);
driver.close();
driver.switchTo().window(parentwindowHandle);
driver.findElement(By.xpath("//div[text()='Login ']")).click();
driver.close();



	}

}
