package CapturingScreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tsrtchomepagescreenshots {
	

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		File tsrtcwebpage=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(tsrtcwebpage,new File("./screenshots/tsrtcHomepage.png"));
		driver.quit();
	}

}
