package AutomationSelenium;

public class PrintInConsole extends launch {
	public static void main(String[] args) throws InterruptedException {
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("the title of page is :"+ title);
		String currenturl = driver.getCurrentUrl();
		System.out.println("the current url is:"+currenturl);
		//String pagesource = driver.getPageSource();
		//System.out.println("the page source is :"+pagesource);
		Thread.sleep(200);
	}

}
