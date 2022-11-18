package Headerblock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class headerblockexample {


	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.tsrtconline.in");
		driver.manage().window().maximize();
		WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
		List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
		int headerBlockLinks_size=headerBlockLinks.size();
		System.out.println("the number of webElements in the HeaderBlock are:"+headerBlockLinks_size);
		
		for(int i=0;i<headerBlockLinks_size;i++)
		{
			String headerLinkName=headerBlockLinks.get(i).getText();
			System.out.println(i+""+headerLinkName);
			headerBlockLinks.get(i).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			driver.navigate().back();
			headerBlock=driver.findElement(By.className("menu_wrap"));
			headerBlockLinks=headerBlock.findElements(By.tagName("a"));
		}
		driver.quit();
		

	}
		
	}


