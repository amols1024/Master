package com.selenium.first_browser_opening;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Sign_in_Page_SignIn extends BasePageAmazon {
	static BasePageAmazon base = new BasePageAmazon();
  
 

	
	public static boolean tap_sign_in() throws InterruptedException
	{
		base.isPresent(By.xpath("(//a[@class=\"nav-a nav-a-2   nav-progressive-attribute\"])[1]"));
		WebElement signin = null;
     	try
     	{
          signin =	driver.findElement(By.xpath("(//a[@class=\"nav-a nav-a-2   nav-progressive-attribute\"])[1]"));
     	}
     	catch(Exception E)
     	{
     		System.out.println("Sign in not available");
     		
     	}
     	Actions act = new Actions(driver);
    	act.moveToElement(signin).build().perform();
   	    Thread.sleep(2000);
        WebElement signinButton = driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
        signinButton.click();
        
        return true;
         
	}
	
	public void addEmail(String email)
	{
	
		WebElement email_box = driver.findElement(By.xpath(Amazon_Sign_in_Page_SignIn_properties.getProperty("email_input_box")));
		email_box.sendKeys(email);
	}
	
	public String getValueFromTest()
	{
		WebElement email_box = driver.findElement(By.xpath(Amazon_Sign_in_Page_SignIn_properties.getProperty("email_input_box")));
		String email_value = email_box.getAttribute("value");
	
		
		return email_value;
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


	}

}
