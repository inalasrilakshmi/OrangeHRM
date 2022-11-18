package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc {
	public static void main(String[] args) {
		WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		WebElement CheckAvailabiliyButton=driver.findElement(By.id("searchBtn"));
		CheckAvailabiliyButton.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.sendKeys("testing");
		
	}

}

