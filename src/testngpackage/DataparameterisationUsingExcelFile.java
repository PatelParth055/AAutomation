package testngpackage;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataparameterisationUsingExcelFile{
	@Test
	public void takepadatfromexcel() throws EncryptedDocumentException, InvalidFormatException, IOException {
	FileInputStream fis = new FileInputStream(".\\testdata\\data.xlsx.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String un = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
	String pwd = wb.getSheet("Sheet1").getRow(1).getCell(1).toString();
	Reporter.log(un + "-->" + pwd, true);

	
	
	}
}
