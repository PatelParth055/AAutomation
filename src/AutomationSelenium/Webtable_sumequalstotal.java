package AutomationSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Webtable_sumequalstotal extends launch {

	public static void main(String[] args) {
		driver.get("file:///C:/Users/Parth/Desktop/qspiders/test/table2.html");
		List<WebElement> lastcell = driver.findElements(By.xpath("(//td[3])[1]|(//td[3])[2]|(//td[3])[3]"));
		int sum=0;
	
		for (WebElement cell : lastcell) {
			String cellvalue = cell.getText();
			try {
				int number = Integer.parseInt(cellvalue);
					sum=sum+number;	
			//	System.out.println("sum of the total ="+sum);
				
				}
				
			 catch (Exception e) {
				
			}}
			List<WebElement> total = driver.findElements(By.xpath("(//td[3])[4]"));
		
			for (WebElement totalcell : total) {
				String totalcellvalue = totalcell.getText();
				try {
					int totalnumber = Integer.parseInt(totalcellvalue);
					if (sum==totalnumber) {
						System.out.println("equals");
						
					} else {
						System.out.println("not equals");

					}
				}
				catch (Exception e) {
				
				}
						
					}
		
		
		
		
		
		}}
		
		
		
