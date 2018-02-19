package AutomationSelenium;

public class Print_windowHandle extends launch {

	public static void main(String[] args) {
		driver.get("http://localhost/login.do");
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		driver.close();

	}

}//4294967297
