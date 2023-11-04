package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrosserjava {
	
	public void crossBrosserLogin(String browser) {
		WebDriver driver;
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		}
			driver=new ChromeDriver();
			else if(browser.equalsIgnoreCase("fireBox")){
		}
	}
}

