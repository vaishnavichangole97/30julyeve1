package excel_sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\selenium\\30julyeve.xlsx");
		boolean value = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(3).getBooleanCellValue();
		System.out.println(value);

		
		
		
		
	}

}
