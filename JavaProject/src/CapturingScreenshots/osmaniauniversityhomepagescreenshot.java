package CapturingScreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class osmaniauniversityhomepagescreenshot {
	 public static void main(String[] args) throws IOException {
		WebDriver driver;
		String applicationUrlAddress="https://www.osmania.ac.in/";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		File osmaniawebpage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(osmaniawebpage,new File("./screenshots/osmaniauniversityHomepage.png"));
		
		driver.quit();
		
		
		
	}

}
