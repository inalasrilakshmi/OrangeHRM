package Selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class NavigateToAnApplication {
public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "./Driverfiles/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://facebook.com");
		driver.navigate().to("http://bing.com");
}
		

}
