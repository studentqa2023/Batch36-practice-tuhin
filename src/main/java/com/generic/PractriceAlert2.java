package com.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractriceAlert2 {
	public void getAlert() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//*[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//*[@class='btn btn-primary")).click();
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		
	}
public static void main(String[] args) {
	PractriceAlert2 obj = new PractriceAlert2();
	obj.getAlert();
}
}
