package Dynamicwebtable;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RowsAndCellsMayChange extends Applicationalaunch {
	@Test
	public void CapturingDynamicWebTableData()
	{
WebElement webtable=driver.findElement( By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table"));
		List<WebElement>rows=webtable.findElements(By.tagName("tr"));
		int rowscount=rows.size();
		System.out.println("the number of rows of the webtable are:"+rowscount);
		for(int i=0;i<rowscount;i++)
		{
		List<WebElement>cells=rows.get(i).findElements(By.tagName("td"));
		int cellscount=cells.size();
		for(int j=0;j<cellscount;j++)
		{
			String data=cells.get(j).getText();
			System.out.print(data+" ");
			
		}
		System.out.println();
		}

}
}
