package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_yourorders_Hellosignin {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver", "./Driverfiles/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://Amazon.in");
		
		driver.manage().window().maximize();
		WebElement hellosigninElement=driver.findElement(By.id("nav_link_accountlist"));
			Actions act=new Actions(driver);
		act.moveToElement(hellosigninElement).perform();
		WebElement yourordersElement=driver.findElement(By.linkText("your orders"));
		yourordersElement.click();
		Thread.sleep(10000);
		
		
		
}

}
