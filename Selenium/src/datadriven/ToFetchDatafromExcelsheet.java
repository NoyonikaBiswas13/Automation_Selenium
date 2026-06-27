package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDatafromExcelsheet {
public static void main(String[] args) throws EncryptedDocumentException,IOException{
		
		//create file location
		FileInputStream fis= new FileInputStream("./Test data/TestScriptData.xlsx");
		
		//file specific object
		Workbook wb= WorkbookFactory.create(fis);
		String value1 = wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		System.out.println(value1);
	
}
}