package orangeHRM;

import org.openqa.selenium.edge.EdgeDriver;

public class ExpectedTitleOrangeHRM {
public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "./Driverfiles/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://OrangeHRM.com");
		String expected_Title = "OrangeHRM";
		System.out.println("OrangeHRM");
		
		
}

}
