package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractriceDropedown {
	public void getDropdown() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		Select sc = new Select(driver.findElement(By.xpath("//select")));
		//select cyprus by using visibleText();
		sc.selectByVisibleText("Cyprus");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//select Algeria by using index();
		sc.selectByIndex(3);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//select Banglades by using selectByValue();
		sc.selectByValue("BGD");
		
	}
public static void main(String[] args) {
	PractriceDropedown obj =new PractriceDropedown();
	obj.getDropdown();
	
}
}
