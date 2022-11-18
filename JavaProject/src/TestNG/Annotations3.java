package TestNG;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class Annotations3 {
	@BeforeMethod
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
	@AfterMethod
	public void close()
	{
		System.out.println("closing gmail Application ");
		
	}
	
}


