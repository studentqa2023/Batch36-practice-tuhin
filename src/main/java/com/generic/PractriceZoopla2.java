package com.generic;

import org.openqa.selenium.WebDriver;

public class PractriceZoopla2 {
	
	WebDriver driver;
	
	public void getLoginBtn() {
		
		 DriverManager dm=new DriverManager();
		driver=dm.getDriver(driver);
		
		driver.navigate().to("https://www.zoopla.co.uk/");
	}
	
	

}
