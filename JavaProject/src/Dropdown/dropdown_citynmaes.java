package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_citynmaes {
	private static Select select;

	public static void main(String[] args) {
		WebDriver driver;
		String applicationUrlAddress="https:/my.monsterindia.com/sponsered_popup.html";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		WebElement currentLocationBlock=driver.findElement(By.className("border_grey1"));
		List<WebElement>currentLocation_citynames=currentLocationBlock.findElements(By.tagName("option"));
		int currentLocationcities_length=currentLocation_citynames.size();
		System.out.println(currentLocationcities_length);
		for(int i=0;i<currentLocationcities_length;i++)
		{
			String cityname=currentLocation_citynames.get(i).getText();
			System.out.println(i+" "+cityname);
		}
		Select selection=new Select(currentLocationBlock);
		selection.selectByVisibleText("Benguluru/banglore");
		
		select.selectByIndex(1);
		select.selectByValue("500");
		WebElement industry=driver.findElement(By.name("industry"));
		Select select=new Select(industry);
		select.selectByIndex(1);
		select.selectByValue("4");
		select.selectByVisibleText("Banking/Accounting/Financial services");
		/*select.deselectByIndex(3);
		select.selectByValue("65");
		select.deselectByVisibleText("Automotive/Automobile/Ancillaries");
		select.deselectAll();*/
		driver.quit();
		
		
	}
}
