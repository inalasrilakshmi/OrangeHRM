package OHRMApplicationTesting;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRM_LoginTest {
	public Logger logger;
	WebDriver driver;
	String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	@BeforeTest
	public void setup()
	{
		PropertyConfigurator.configure("Log4j.properties");
		logger=logger.getLogger(OHRM_LoginTest.class);
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		logger.info("chrome browser launch successful");
		driver.get(ApplicationUrlAddress);
		logger.error("sucessfully navigated to orangeHRM application login page");
		driver.manage().window().maximize();
		logger.warn("chrome browser maximized");
	}
	@Test
	public void login() throws InterruptedException
	{
		WebElement username=driver.findElement(By.id("txtname"));
		username.clear();
		username.sendKeys("srilakshmi inala");
		logger.info("successfully entered usernmae");
		WebElement password=driver.findElement(By.name("txtpassword"));
		password.clear();
		password.sendKeys("srilakshmi@09");
		logger.info("successfully entered password");
		WebElement logInButton=driver.findElement(By.className("button"));
		logInButton.click();
		logger.info("clicked on logInButton");
		WebElement WelcomeAdminElement=driver.findElement(By.linkText("WelcomeAdmin"));
		WelcomeAdminElement.click();
	    logger.info("successfully clicked on welcomeadmin");
	    Thread.sleep(10000);
	 /*  WebElement Logout=driver.findElement(By.linkText("Logout"));
	    Logout.click();
	    logger.info("successfully logout from application");
	    */
	}
@AfterTest
public void tearDown()
{
/*	driver.quit();
	logger.info("sucecessfully closed chrome browser");*/
}
}
