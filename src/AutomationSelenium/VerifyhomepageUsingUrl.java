package AutomationSelenium;

import org.openqa.selenium.By;

public class VerifyhomepageUsingUrl extends launch {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://localhost/login.do");
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@id='loginButton']/div[text()='Login ']")).click();
		 String expectedurl = "submit";
		 String actualurl = driver.getCurrentUrl();
		 if (actualurl.contains(expectedurl))
		 {System.out.println("home page is displayed");
			
		} else {
			System.out.println("home page is not display");

		}
	}

}
