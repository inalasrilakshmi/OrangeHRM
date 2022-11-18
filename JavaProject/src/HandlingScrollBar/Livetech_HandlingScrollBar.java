package HandlingScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Livetech_HandlingScrollBar {
	@Test
	public void scrollbarhandling() {
		WebDriver driver;
		String applicationUrlAddress="https://Livetech.in";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
	//	JavascriptExecutor js=((JavascriptExecutor)driver);
	//	js.executeScript("window.scrollto(0,900)");
		((JavascriptExecutor)driver).executeScript("window.scrollto(0,900)");
				
	}

}
