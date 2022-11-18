package RadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class echoechoapplicationgroup2 {
	public static void main(String[] args) {
		
		WebDriver driver;
		String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		WebElement radioButtonsBlock=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/"+"div/span/form/table[3]/tbody/tr/td"));
		List<WebElement>group2RadioButtons=radioButtonsBlock.findElements(By.name("group2"));
		int group2RadioButtonslength=group2RadioButtons.size();
		System.out.println("Number of Radio Buttons in group2 are:"+ group2RadioButtonslength);
		for(int i=0;i<group2RadioButtonslength;i++)
		{
			 group2RadioButtons.get(i).click();
		
			for(int j=0;j<group2RadioButtonslength;j++)
			 {
				 System.out.println(group2RadioButtons.get(j).getAttribute("value")+""+group2RadioButtons.get(j).getAttribute("checked"));
				 
			 }
			 System.out.println();
		}
		driver.quit();
		
				 
			 }
			 
			 
		
	


	}


