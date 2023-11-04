package com.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class ZooplaPractrice2{
	
	WebDriver driver;
	WebDriver wait;
	public void getLogin() {
		DriverManager dm=new DriverManager();
		driver=dm.getDriver(driver);
		driver.navigate().to("https://www.zoopla.co.uk/");
		
		 MasterPageFactory mpf=new  MasterPageFactory(driver);
		 if(mpf.getAcceptCookiesBtn().size()>0) {
			 
			 wait=new WebDriverwait(driver,Duration.ofSeconds(10) );
			 
			 
			 mpf.getAcceptCookiesBtn().get(0).click();
		 
		 }
		 //zoopla login
	mpf.getZooplaLogin().click();
	mpf.getEmailField().sendKeys(" rezwanislam@rocketmail.com");
	mpf.getZooplaPassword().sendKeys(" Boston2023!");
	mpf.getLognBtn2().click();
	
			
		 
		 
	}
	public static void main(String[] args) {
		ZooplaPractrice2 obj=new ZooplaPractrice2();
		obj.getLogin();
		
	}
}

