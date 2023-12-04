package com.selenium.first_browser_opening;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Chrome_browser_First {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
     	Thread.sleep(2000);
//    	driver.findElement(By.xpath("//input[@class=\"_18u87m _3WuvDp\"]")).sendKeys("7059707007");
//    	Thread.sleep(4000);
//    	driver.findElement(By.xpath("//button[text()=\"Request OTP\"]")).click();
//    	Thread.sleep(4000);
//    	driver.findElement(By.xpath("(//p[@id=\"XNCroCYWFCEZULh\"])[1]")).click();
	}

}
