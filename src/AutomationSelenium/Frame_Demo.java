package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frame_Demo extends launch{

	public static void main(String[] args) {
driver.get("file:///C:/Users/Parth/Desktop/qspiders/test/page2.html");


//using index of the frame 
//driver.switchTo().frame(0);
//driver.findElement(By.id("t1")).sendKeys("a");                  // [1] method
//driver.switchTo().defaultContent();
//driver.findElement(By.id("t2")).sendKeys("b");

//using id aribute of the frame -string 
driver.switchTo().frame("f1");
driver.findElement(By.id("t1")).sendKeys("c");                     //[ 2 ] method
driver.switchTo().defaultContent();
driver.findElement(By.id("t2")).sendKeys("d");

//using name arribute of the frame
driver.switchTo().frame("n1");
driver.findElement(By.id("t1")).sendKeys("e");                      //[3] method
driver.switchTo().defaultContent();
driver.findElement(By.id("t2")).sendKeys("f");


//using webelement aribute of the frame 
WebElement c = driver.findElement(By.className("c1"));
driver.switchTo().frame(c);
driver.findElement(By.id("t1")).sendKeys("g");                       //[4] method
driver.switchTo().defaultContent();
driver.findElement(By.id("t2")).sendKeys("h");

	}

}
