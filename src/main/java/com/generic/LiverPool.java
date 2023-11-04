package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LiverPool {
	
	public static void main(String[] args) throws InterruptedException {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.navigate().to("https://www.premierleague.com/tables");
//		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();
		driver.findElement(By.xpath("//*[@class='closeBtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='league-table__team-name league-table__team-name--long long'])[4]")).click();
		
	}

}
