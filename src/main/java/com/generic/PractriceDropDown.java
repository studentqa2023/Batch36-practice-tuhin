package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractriceDropDown {
public void getDropDown() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	select sc =new select(driver.findElement(By.xpath()))
	
}
}
