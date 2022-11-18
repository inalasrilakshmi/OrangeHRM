package Selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class GoogleURLAddress {
private static String expected_googlehomepageurladdress;

public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "./Driverfiles/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://google.com");
		String actual_googlehomepageurladdress=driver.getCurrentUrl();
		System.out.println("The current actual url address after launching googlehome page is:"+actual_googlehomepageurladdress);

		String expetecd_googlehomepageurladdress="google.com";
		System.out.println("The expected url address of googlehome page is:"+expected_googlehomepageurladdress);
		if(actual_googlehomepageurladdress.contains(expetecd_googlehomepageurladdress))
		{
			System.out.println("Url matched-pass");
		}
		else
		{
			System.out.println("Url not matched-fail");
			
		}
		driver.close();
		
}


}
