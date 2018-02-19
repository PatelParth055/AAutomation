package AutomationSelenium;

import java.io.IOException;

import org.openqa.selenium.By;

public class FileUploadAutoIT_HandleWindowPopup extends launch{

	public static void main(String[] args) throws InterruptedException, IOException {
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
		driver.findElement(By.xpath("(//input[@uploader='uploader'])[2]")).click();
		Thread.sleep(3000);
		Runtime run = Runtime.getRuntime();
run.exec("C:\\Users\\Parth\\Desktop\\qspiders\\test\\AutoITFileUploadDemo.exe");


		

	}

}
