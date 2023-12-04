package com.selenium.first_browser_opening;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Wishcard_Page {
	
	 WebDriver driver;
          Amazon_Wishcard_Page( WebDriver driver) throws InterruptedException
			{
        	  this.driver = driver;
        	  if(driver == null) {
        		  WebDriverManager.chromedriver().setup();
        		    driver = new ChromeDriver();
        			driver.get("https://amazon.in");
        			driver.manage().window().maximize();
        	     	Thread.sleep(2000);
        	  }
			}
    public  void tap_create_wishlist() throws InterruptedException
		{
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
	        WebElement wishlist = driver.findElement(By.xpath("//span[text()='Create a Wish List']"));
	        wishlist.click();
	         
	         
		}
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

		
		}
	

}
