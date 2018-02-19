package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class RemoveValuefromText_usingClearMethod extends launch{

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		String value= driver.findElement(By.id("username")).getAttribute("value");
		System.out.println("value present in textbox : "+value);
		driver.findElement(By.id("username")).clear(); 
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin1212");
		Thread.sleep(3000);
		//This line will actually delete the value if there is no space in the text entered
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		// if there is a space between two words in the username field, we have to use the below lines of code 
Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("test 123");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("username")).sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		driver.close();
		
	}

}
