package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CapturingFirstRowOfFirstCellData1 {
	@Test
	public void CapturingFirstRowOfFirstCellData1()
	{
		WebDriver driver;
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		WebElement FirstRowOfFirstCell_Element=driver.findElement(By.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]"));
		String FirstRowOfFirstCell_data1=FirstRowOfFirstCell_Element.getText();
		System.out.println("the text of thefirst row of  first cell value is:"+ FirstRowOfFirstCell_data1);
		driver.quit();
		
	}

}
