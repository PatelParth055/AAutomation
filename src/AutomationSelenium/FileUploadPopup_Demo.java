package AutomationSelenium;

import org.openqa.selenium.By;

public class FileUploadPopup_Demo extends launch{

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("C:\\Users\\Parth\\Desktop\\Instructions.txt");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@ng-click='item.upload()']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
