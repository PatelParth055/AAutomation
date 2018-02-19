package AutomationSelenium;
import java.io.IOException;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class takecreenshot extends launch {

	public static void main(String[] args)throws IOException {
		driver.get("http://www.gmail.com");
		TakesScreenshot t = (TakesScreenshot) driver;
		java.io.File scfile = t.getScreenshotAs(OutputType.FILE);
		File destfile = new File(".\\screenshot\\gmail.com.png");
		FileUtils.copyFile(scfile,destfile);

	}	}
