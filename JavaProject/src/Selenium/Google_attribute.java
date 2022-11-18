package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Google_attribute {
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.edge.driver", "./Driverfiles/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://google.com");
		
		driver.manage().window().maximize();
		System.out.println("the value of calss Attribute is:"+"gb_1 gb_2 gb_8d gb_8c");
		WebElement signInElement=driver.findElement(By.linkText("sign in"));
		String signInElementAttributevalue=signInElement.getAttribute("class");
		System.out.println(signInElementAttributevalue);
		driver.close();
		
		
		
}
}
