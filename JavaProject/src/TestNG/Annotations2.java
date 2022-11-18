package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	@BeforeTest
	public void ApplicationLaunch()
	{
		System.out.println(" gmail Application Launch successfully");
		
	}
	@Test(priority=0)
	public void InBox()
	{
		System.out.println(" gmail Application InBox functionality test successful");
		
	}
	@Test(priority=1)
	public void Composemail()
	{
		System.out.println(" gmail Application composemail functionality test successful");
		
	}
	@Test(enabled=false)
	public void drafts()
	{
		System.out.println(" gmail Application drafts functionality test successful");
		
	}
	@AfterTest
	public void close()
	{
		System.out.println("closing gmail Application ");
		
	}
	
}
