package excel_sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1_getStringData
{
	
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("C:\\selenium\\30julyeve.xlsx");
	String value = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(value);
	
	
	
//	Workbook s1 = WorkbookFactory.create(file);
//	Sheet s2 = s1.getSheet("sheet1");
//	Row s3 = s2.getRow(0);
//	Cell s4 = s3.getCell(1);
//	 String value = s4.getStringCellValue();
//	 System.out.println(value);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
}
