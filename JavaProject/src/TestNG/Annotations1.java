package TestNG;

import org.testng.annotations.Test;

public class Annotations1 {
	@Test(priority=1)
	
		public void applicationLaunch()
	{
		System.out.println(" gmail application launch successfully ");
		
	}
	@Test(priority=0)
	public void InBox()
	{
		System.out.println(" gmail Application InBox functionality test successful");
		
	}

	@Test(priority=3)
	public void composemail()
	{
		System.out.println(" gmail Application composemail functionality test successful");
		
	}
	@Test(enabled=false)
	public void drafts()
	{
		System.out.println(" gmail Application drafts functionality test successful");
		
	}
}