package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class PractriceDragAndDrop_2 {
	WebDriver driver;
	
	public void getDragandDrop() {
		DriverManager dm=new DriverManager();
		
		driver=dm.getDriver(driver);
		
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		MasterPageFactory mpf=new MasterPageFactory(driver);
		
		Actions ac = new Actions(driver);
		
		ac.dragAndDrop(mpf.getDragWashinton(),mpf.getDropUnitedState()).perform();
}
	public static void main(String[] args) {
		
	
	PractriceDragAndDrop_2 obj=new PractriceDragAndDrop_2();
	obj.getDragandDrop();
	}
}
