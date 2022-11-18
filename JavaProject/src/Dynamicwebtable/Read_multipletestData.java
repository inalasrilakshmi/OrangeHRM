package Dynamicwebtable;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class Read_multipletestData {
@Test
public void ExcelTestData()
{
	FileInputStream file=new FileInputStream("./src/Excel/sheet1.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("sheet1");
	int rowcount=Sheet.getLastRownum();
	for(int i=0;i<=rowcount;i++) 
	{
		Row row=Sheet.getRow(i);
		int cellcount=row.getLastcellnum();
		for(int j=0;j<cellcount;j++)
		{
			Cell cell=row.getcell(j);
			String data=cell.getStringcellvalue();
			System.out.println(data+" ");
		}
		System.out.println();
	}

}
}
