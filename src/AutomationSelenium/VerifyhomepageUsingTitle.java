package AutomationSelenium;

import org.openqa.selenium.By;

public class VerifyhomepageUsingTitle extends launch {

	public static void main(String[] args) throws InterruptedException {
		 driver.get("http://localhost/login.do");
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@id='loginButton']/div[text()='Login ']")).click();
		 String expectedTitle = "Enter Time-Track";
		 String actualTitle=driver.getTitle();
		 if (actualTitle.contains(expectedTitle))
				 {
			 System.out.println("home page is displayed");
			 }
		 else {
			System.out.println("home page is not displayed");
		}
		 
		 
		 

	}

}
