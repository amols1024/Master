package com.selenium.first_browser_opening;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePageAmazon {
	public static Properties Amazon_Sign_in_Page_SignIn_properties = new Properties ();
	public static FileInputStream fis;
	public static WebDriver driver = null;
	public void launchAndMoveToHomePage() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
     	Thread.sleep(2000);
     	try {
    	fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\com.selenium.first\\src\\main\\resources\\Amazon_Sign_In_Page.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		Amazon_Sign_in_Page_SignIn_properties.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public boolean isPresent(By by)
	{
		try {
		    driver.findElement(by);
		return true;
	    }catch(NoSuchElementException e)
	         {
		         return false;
	         }
		
	}
	
   public void VerifyTextPresent(String text)
   {
      driver.getPageSource().contains(text);
	   
   }
	
  public void clickOnButton(String xpath)
  {
	  driver.findElement(By.xpath(xpath)).click();
  }
}
