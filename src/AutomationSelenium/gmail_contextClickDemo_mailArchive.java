package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class gmail_contextClickDemo_mailArchive  extends launch{

	public static void main(String[] args) throws InterruptedException {
		driver2.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin"
				+ "");
		driver2.findElement(By.xpath("//input[@type='email']")).sendKeys("parthpatel055@gmail.com");
		driver2.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		driver2.findElement(By.xpath("//input[@type='password']")).sendKeys("surekhapatel");
		driver2.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
String xp ="//span[contains(.,'Why are Selenium testing jobs decreasing')][1]";
WebElement mail = driver2.findElement(By.xpath(xp));
System.out.println(mail.getText());
Actions action = new Actions(driver2);
action.contextClick(mail).perform();
Thread.sleep(3000);
driver2.findElement(By.xpath("//div[@class='J-N-JX aDE aDD']")).click();


		
		

	}

}
