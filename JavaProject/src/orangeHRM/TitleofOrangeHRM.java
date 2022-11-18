package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class TitleofOrangeHRM {
public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "./Driverfiles/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://OrangeHRM.com");
		String expected_Title = "OrangeHRM";
		String actual_Title=driver.getTitle();
		if(actual_Title.contains(expected_Title))
		{
			System.out.println(" OrangeHRM LogIn Page - Pass");
		}
		else
		{
			System.out.println(" Failed to Navigate to OrangeHRM LogIn Page - Fail");
		}
	driver.findElement(By.id("email")).sendKeys("srilakshmi.inala");
		
		driver.findElement(By.id("pass")).sendKeys("Livetech123");
		
		driver.findElement(By.name("login")).click();
		driver.close();
		
		
			
		
}	

}
