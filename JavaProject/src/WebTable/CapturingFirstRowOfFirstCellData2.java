package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CapturingFirstRowOfFirstCellData2 {
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
	String part1="html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	String part2="1]/td[1]";
	for(int i=1;i<=36;i++)
	{
		//WebElement tableElement=driver.findElement(By.xpath(part1+i+part2));
		
	WebElement tableElement=driver.findElement(By.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[1]"));
        String data=tableElement.getText();
        System.out.println(data);
	}
}
}
