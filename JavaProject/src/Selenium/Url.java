package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Url {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Webdriverfiles\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.navigate().to("https://www.bing.com");
	
}
}
