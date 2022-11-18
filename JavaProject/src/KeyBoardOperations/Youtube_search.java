package KeyBoardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class Youtube_search {
	WebDriver driver;
@BeforeTest
public void ApplicationLaunch() {
	
	String applicationUrlAddress="https://www.youtube.com/";
	System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(applicationUrlAddress);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
}
	@Test
	public void search() throws InterruptedException
	{
		WebElement searchElement=driver.findElement(By.name("search_query"));
		searchElement.sendKeys("national anthem");
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
	}
}

      