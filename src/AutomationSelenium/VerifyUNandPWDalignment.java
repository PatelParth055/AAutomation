package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyUNandPWDalignment extends launch {

	public static void main(String[] args) {
		
		driver.get("http://localhost/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
int un_x = unTB.getLocation().getX();
int un_width = unTB.getSize().getWidth();
int un_height = unTB.getSize().getHeight();
//System.out.println("xaxis :"+ un_x +  "width :"+un_width +   "height :" +un_height);
WebElement pasTB = driver.findElement(By.name("pwd"));
int pas_x = pasTB.getLocation().getX();
int pas_width = pasTB.getSize().getWidth();
int pas_height = pasTB.getSize().getHeight();
if (un_x==pas_x && un_width==pas_width && un_height==pas_height) {
	System.out.println("User name and password text box is aligned");
	
} else {
	System.out.println("username and password text box is NOT aligned");

}





	
	
	
	}

	}
