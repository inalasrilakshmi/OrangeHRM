package Dynamicwebtable;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Driver;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import ExcelOperations.XSSF;
import ExcelOperations.xssfworkbook;
import net.bytebuddy.implementation.bytecode.Throw;

public class DynamicWebTableData {
	private static final BufferedOutputStream WorkBook = null;

	@Test
	public void CapturingDynamicWebTableData()
	{
        WebElement webtable=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table"));
		List<WebElement>rows=webtable.findElements(By.tagName("tr"));
		int rowscount=rows.size();
		System.out.println("the number of rows of the webtable are:"+rowscount);
		FileInputStream file=new FileInputStream("./src/Excel/sheet1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		for(int i=0;i<rowscount;i++)
		{
			Row row=Sheet.createRow(i);
			List<WebElement>cells=rows.get(i).findElements(By.tagName("td"));
			int cellscount=cells.size();
			for(int j=0;j<cellscount;j++)
			{
				String data=cells.get(j).getText();
				System.out.println(data+" ");
				Cell cell=row.createCell(j);
				 cell.setcellValue(data);
				
			}
			System.out.println();
		FileOutputStream file1=new FileOutputStream("./src/Excel/sheet1.xlsx");
			WorkBook.write(file1);
			}

		}
}
