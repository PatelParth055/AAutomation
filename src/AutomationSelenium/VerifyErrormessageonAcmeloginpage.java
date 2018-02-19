package AutomationSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyErrormessageonAcmeloginpage extends launch {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		WebElement errMsg = driver.findElement(By.xpath("//span[contains(.,'invalid')]"));
		String errtext = errMsg.getText();
		System.out.println("Error msg is : " +errtext);
		String colortext = errMsg.getCssValue("color");
		String colorasHex = org.openqa.selenium.support.Color.fromString(colortext).asHex();
		System.out.println("color in HEX  : " + colorasHex);
		if (colorasHex.equals("#ce0100")) {
			System.out.println("Error msg is RED");
			
		} else {
System.out.println("Error msg is NOTRED");
		}
		
		String fontsize = errMsg.getCssValue("font-size");
		String fontweight = errMsg.getCssValue("font-weight");
		
System.out.println("fontsize: " +fontsize);
System.out.println("fontweight: "+fontweight);
Thread.sleep(3000);
		driver.close();

	}

}
