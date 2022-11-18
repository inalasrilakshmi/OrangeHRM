package CapturingScreenshots;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleScreenshots {
	
	

	public static void main(String[] args) {
		WebDriver driver;
		String applicationUrlAddress="https://www.osmania.ac.in/";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		WebElement selectLanguagesDropDown=driver.findElement(By.id("gtranslate_selector"));
		List<WebElement>dropDownLanguages=selectLanguagesDropDown.findElements(By.tagName("option"));
		int dropDownListLength=dropDownLanguages.size();
		System.out.println("the no of Languages in the drop down are:"+dropDownListLength);
		for(int i=0;i<dropDownListLength;i++)
		{
			String dropDownLanguage=dropDownLanguages.get(i).getText();
			System.out.println(i+" "+dropDownLanguage);
			Select selection=new Select(selectLanguagesDropDown);
			selection.selectByVisibleText(dropDownLanguage);
			selection.selectByValue(dropDownLanguages.get(i).getAttribute("value"));
			File screenshot=((TakesScreenshot)driver).getScreenshotAs(output.file);
			FileUtils.copyFile(screenshot,newfile("./osmaniauniversityscreenshots/"+dropDownLanguages+".png"));
			Thread.sleep(10000);		
		}
		
		driver.quit();
	
	}

	private static File newfile(String string) {
		// TODO Auto-generated method stub
		return null;
	}

		}

