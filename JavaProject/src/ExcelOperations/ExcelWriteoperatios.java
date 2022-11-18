package ExcelOperations;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteoperatios {
public static void main(String[] args) throws IOException {
	FileInputStream file=new FileInputStream("./src/Excel/lakshmi.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("sheet1");
  Row row=Sheet.createRow(2);
	Cell cell=row.createCell(3);
	FileOutputStream file1=new FileOutputStream("./src/Excel/lakshmi.xlsx");
	workbook.write(file1);
	
}
}
