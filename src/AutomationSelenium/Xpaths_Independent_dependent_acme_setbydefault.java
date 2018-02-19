package AutomationSelenium;

import org.openqa.selenium.By;

public class Xpaths_Independent_dependent_acme_setbydefault extends launch {

	public static void main(String[] args) throws InterruptedException {
		 driver.get("http://localhost/login.do");
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@id='loginButton']/div[text()=\"Login \"]")).click();
		 driver.findElement(By.xpath("(//div[@class='popup_menu_arrow'])[1]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[.='Billing Types']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[.='Billable']/../..//a[.='set by default']")).click();
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("//a[.='Non-Billable']/../..//a[.='set by default']")).click();
		 Thread.sleep(2000);
		 driver.close();

	}

}
