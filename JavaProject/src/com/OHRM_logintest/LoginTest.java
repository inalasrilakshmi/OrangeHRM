package com.OHRM_logintest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import OrangeHRMBaseTest.BaseTest;

public class LoginTest extends BaseTest{
@Test
public void logintest()

{
	WebElement username=driver.findElement(By.id("txtname"));
	username.clear();
	username.sendKeys("srilakshmi inala");
	System.out.println("successfully entered usernmae");
	WebElement password=driver.findElement(By.name("txtpassword"));
	password.clear();
	password.sendKeys("Srilakshmi@09");
	System.out.println("successfully entered password");
	WebElement logInButton=driver.findElement(By.className("button"));
	logInButton.click();
	System.out.println("clicked on logInButton");


}
}