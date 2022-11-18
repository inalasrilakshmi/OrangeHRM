package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleSignInClick {
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.edge.driver", "./Driverfiles/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://google.com");
		
		driver.manage().window().maximize();
	WebElement SignInElement=driver.findElementByLinkText("Sign in");
		String SignInElementText=SignInElement.getText();
		System.out.println("the text of SignIn element on googlr homepage is"+ SignInElementText);
		SignInElement.click();
		
}

}
