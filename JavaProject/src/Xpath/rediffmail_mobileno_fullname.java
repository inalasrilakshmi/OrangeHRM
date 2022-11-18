package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffmail_mobileno_fullname {
	public static void main(String[] args) {
		WebDriver driver;
		String applicationUrlAddress="https://register.rediff.com/register/register.php?formname=user_details";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		WebElement mobilenumber=driver.findElement(By.xpath("//*[@id='mobno']"));
		mobilenumber.sendKeys("78945621");
		WebElement fullname=driver.findElement(By.xpath("//input[starts_with(@name,'name')]"));
		fullname.sendKeys("testing");
		
	}

}
