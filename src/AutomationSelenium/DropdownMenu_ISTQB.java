package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DropdownMenu_ISTQB extends launch{

	public static void main(String[] args) throws InterruptedException  {
		driver2.get("http://www.istqb.in/");
		WebElement foundation = driver2.findElement(By.xpath("//span[text()='FOUNDATION']"));
		Actions action = new Actions(driver2);
		action.moveToElement(foundation).perform();
		Thread.sleep(3000);
		WebElement enrollment = driver2.findElement(By.xpath("(//span[text()='ENROLLMENT'])[1]"));
		action.moveToElement(enrollment).perform();
		Thread.sleep(3000);
		WebElement cor = driver2.findElement(By.xpath("//span[text()='CORPORATE ENROLLMENT']"));
		action.moveToElement(cor).perform();
		Thread.sleep(3000);
		 driver2.findElement(By.xpath("//span[text()='ONLINE ENROLLMENT']")).click();
		

	}

}
