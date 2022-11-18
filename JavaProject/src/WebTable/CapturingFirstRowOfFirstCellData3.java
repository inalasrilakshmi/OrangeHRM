package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CapturingFirstRowOfFirstCellData3 {
	WebDriver driver;
	@BeforeTest
	public void ApplicationLaunch()
	{
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
	}
@AfterTest
public void ApplicationClose() 
{
	driver.close();
}
@Test
public void CapturingFirstRowOfFirstCellData()
{
	//first row of first cell
	//"html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	String xpathExpressionpart1="html/body/div[5]/section[1]/div/section/div[1]/div"+"/table/tbody/tr[";
	String xpathExpressionpart2="]/td[";
	String xpathExpressionpart3="]";
	for(int i=1;i<=36;i++)
	{
		for(int j=1;j<=8;j++)	
		{
			WebElement webtableelement=driver.findElement(By.xpath(xpathExpressionpart1+i+xpathExpressionpart2+j+xpathExpressionpart3));
			String webElementData=webtableelement.getText();
			System.out.print( webElementData+" ");
		}
		
	System.out.println( );
}
}
}



