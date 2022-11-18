
package com.Fabook.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LogInTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		String expected_Title = "Facebook";
		String actual_Title=driver.getTitle();
		driver.manage().window().maximize();
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println(" Facebook LogIn Page - Pass");
		}
		else
		{
			System.out.println(" Failed to Navigate to Facebook LogIn Page - Fail");
		}
		
		driver.findElement(By.id("email")).sendKeys("9100925732");
		
		driver.findElement(By.id("pass")).sendKeys("Ks9100925732@");
		
		//driver.findElement(By.id("u_0_5_bs")).click();
		
		driver.findElement(By.name("login")).click();

	                       	// OR
		
		//WebElement logInButton=driver.findElement(By.name("login"));
		// logInButton.click();
			
		 driver.close();
	}
	

}

