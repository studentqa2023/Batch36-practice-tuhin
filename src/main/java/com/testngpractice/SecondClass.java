package com.testngpractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.generic.DriverManager;

public class SecondClass {
	
	WebDriver driver;
	@Test
	public void getLogin() {
		DriverManager dm=new DriverManager();
		driver=dm.getDriver(driver);
		driver.navigate().to("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		

}
}