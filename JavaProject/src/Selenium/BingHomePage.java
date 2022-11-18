package Selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class BingHomePage {
public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "./Driverfiles/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://bing.com");
		String actual_binghomepagetitle=driver.getTitle();
		System.out.println("The actual title of the binghomepage is:"+actual_binghomepagetitle);
		String expected_binghomepagetitle="Bing";
		System.out.println("The expected title of the binghomepage is:"+expected_binghomepagetitle);
if(actual_binghomepagetitle.equals(expected_binghomepagetitle))
{
	System.out.println("Title matched-pass");
}
else
{
	System.out.println("Title not matched-fail");
}
driver.close();
}
}
