package AutomationSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_Example extends launch{

	public static void main(String[] args) {
		driver.get("file:///C:/Users/Parth/Desktop/qspiders/test/table.html");
		// print the total number of ROWS present 
		List<WebElement> row = driver.findElements(By.xpath("//tr"));
		int count = row.size();
		System.out.println("The total number of rows is "+count);
		// print the total number of COLUMNS present 
List<WebElement> column = driver.findElements(By.xpath("//th"));
		int ccount = column.size();
		System.out.println("The total number of columns is "+ccount);
		// print the total number of CELLS present 
		List<WebElement> allcell = driver.findElements(By.xpath("//th|//td"));
		int cellno = allcell.size();
		System.out.println("Total number of cell is"+cellno);
		// print ONLY the NUMERIC values present 
		// Count the TOTAL number of NUMERIC values present 
		// print the SUM of all the numeric values in the table
		int countnumvalue=0;
		int sum=0;
		for (WebElement cell : allcell) {
			String cellvalue = cell.getText();
			try {
				int number = Integer.parseInt(cellvalue);
				System.out.println(""+number);
				countnumvalue++;
				sum=sum+number;
			} catch (Exception e) {
				
			}
			System.out.println("Total Count of Numberic Value is :"+countnumvalue);
			System.out.println("The Sum Of Numberic value is : "+sum);
			
			
			
		}
		

	}

}
