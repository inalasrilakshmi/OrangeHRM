package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleIndiaGettext {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.edge.driver", "./Driverfiles/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://google.com");
		
		driver.manage().window().maximize();
		WebElement indiaElement=driver.findElement(By.className("uU7dJb"));
		String indiaElementText=indiaElement.getText();
		System.out.println("the text of india element on googlr homepage is"+ indiaElementText);
		driver.close();
		
		
		
		
	}

}
