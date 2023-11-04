package com.generic;

import org.openqa.selenium.WebDriver;

public class ZooplaPractrice {
	WebDriver driver;
	public void getLogin() {
		DriverManager dm=new DriverManager();
		driver=dm.getDriver(driver);
		driver.navigate().to("https://www.zoopla.co.uk/");
		
	}
public static void main(String[] args) {
	ZooplaPractrice obj=new ZooplaPractrice();
	obj.getLogin();
	
}
}
