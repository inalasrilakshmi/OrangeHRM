package ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadoperation {
	public static  void main(String[] args) throws IOException {
		 //identifying the fail
		
		FileInputStream file=new FileInputStream("./src/Excel/lakshmi.xlsx");
XSSFWorkbook workbook=new XSSFWorkbook(file);
XSSFSheet sheet=workbook.getSheet("sheet1");
Row r=sheet.getRow(0);
Cell c= r.getCell(0);

String Data=c.getStringCellValue();

System.out.println("data");

	}
}

		
		
	
	
	
	
	


