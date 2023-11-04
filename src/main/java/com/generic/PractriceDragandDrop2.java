package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class PractriceDragandDrop2 {
	WebDriver driver;
	
	public void practriceDrag() {
	DriverManager dm=new DriverManager();
	driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	driver=dm.getDriver(driver);
	
	MasterPageFactory obj = new MasterPageFactory(driver);
    Actions ac=new Actions(driver);
	ac.dragAndDrop(mpf., null)
	
	}
	public static void main(String[] args) {
		PractriceDragandDrop2 obj =new PractriceDragandDrop2();
		obj.practriceDrag();
	}
}
