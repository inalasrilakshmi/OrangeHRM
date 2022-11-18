package Cookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBookApplication {
	@Test
	public void handlingcookies()
	{
		WebDriver driver;
		String applicationUrlAddress="https://facebook.com";
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		
		Set<Cookie>faceBookcookies=driver.manage().getCookies();
		int cookiescount=faceBookcookies.size();
		System.out.println("no of cooikes on the facebook homepage are:"+cookiescount);
		Iterator<Cookie>it=faceBookcookies.iterator();
		while(it.hasNext())
		{
			Cookie c=it.next();
			System.out.println("the name of the Cookie is:"+c.getDomain()+"+c.getName");
		}
		driver.manage().deleteAllCookies();
		faceBookcookies=driver.manage().getCookies();
		faceBookcookies.size();
		System.out.println("no of cookies on the facebook homepage are:"+cookiescount);
		driver.quit();
		}
		
	}

	
		
	
	

