package AutomationSelenium;

import org.openqa.selenium.JavascriptExecutor;

public class EnterText_intoDisabledTextbox extends launch {

	public static void main(String[] args) throws InterruptedException {
 driver.get("file:///C:/Users/Parth/Desktop/qspiders/test/disable.html");
 JavascriptExecutor js = (JavascriptExecutor) driver; 
 Thread.sleep(2000); 
 //enter " admin " in first textbox using javascript 
 js.executeScript("document.getElementById('t1').value='admin'"); 
 // go to inspect and check in console tab
 Thread.sleep(2000); 
 // clear  the value in second textbox using javascript 
 js.executeScript("document.getElementById('t2').value=''"); 
 //enter " manager " in second textbox using javascript 
 js.executeScript("document.getElementById('t2').value='manager'"); 
 //change the second  text box to button  type using Javascript 
 js.executeScript("document.getElementById('t2').type='button'"); 

 
 

 
	}
}
