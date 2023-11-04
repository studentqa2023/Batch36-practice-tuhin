package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractriceDragandDrop {
public void getDragAndDrop() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver ();
	driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	driver.manage().window().maximize();
	 MasterPageFactory mpf = new  MasterPageFactory(driver);
	 Actions ac =new Actions(driver);
	// ac.dragAndDrop(mpf.getDragOslo(), mpf.getDropNorway()).perform();
	 ac.dragAndDrop(mpf.getDragWashinton(),mpf.getDropUnitedState()).perform();
}
public static void main(String[] args) {
	PractriceDragandDrop obj=new PractriceDragandDrop();
	obj.getDragAndDrop();
	
}
}
