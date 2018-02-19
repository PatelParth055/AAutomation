package AutomationSelenium;

public class EnterTexntoFocussedElement  extends launch{

	public static void main(String[] args) {
driver.get("http://localhost/login.do");
//entering text into the focused element
driver.switchTo().activeElement().sendKeys("admin");

	}

}

