package testngpackage;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	@DataProvider
	public Object[][]dataBank() {
		Object[][] data = new Object[2][2];
	        data[0][0]= "admin1";
			data[0][1]="manager1";
			data[1][0]="admin2";
			data[1][1]="manager2";
			return data;	
	}
	@Test(dataProvider="dataBank")
	public void useDataBank(String un,String pwd) {
		Reporter.log(un + "-->" + pwd,true);
	}

}
