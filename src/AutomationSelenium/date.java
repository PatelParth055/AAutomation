package AutomationSelenium;
import java.sql.Date;


public class date extends launch {

	

	public static void main(String[] args) {
		
	Date d = new Date(92, 2, 19);
	String date1 = d.toString();
	System.out.println(date1);
			
		String date2 = date1.replaceAll("-", "/");
		System.out.println(date2);
		
	
	}
}
