package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) {
		
		WebDriver driver;
		String applicationUrlAddress="https://jqueryui.com/droppable";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		WebElement FrameofDragandDropElements=driver.findElement(By.className("demo_frame"));
		driver.switchTo().frame(FrameofDragandDropElements);
		WebElement dragtomyTargetElement=driver.findElement(By.id("draggable"));
		WebElement drphereElement=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(dragtomyTargetElement, drphereElement).perform();
		driver.switchTo().defaultContent();
		WebElement resizable=driver.findElement(By.linkText("Resizable"));
		resizable.click();
	}
		
	}

	


