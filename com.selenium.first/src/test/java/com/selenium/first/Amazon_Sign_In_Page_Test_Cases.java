package com.selenium.first;

import com.selenium.first_browser_opening.Amazon_Sign_in_Page_SignIn;
import com.selenium.first_browser_opening.BasePageAmazon;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Amazon_Sign_In_Page_Test_Cases extends BasePageAmazon{

	@BeforeTest
	public void movetohomepage()
	{
		try {
			System.out.println("Step 1 :  Launch browser and move to home page");
			launchAndMoveToHomePage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
	     System.out.println("Browser launch error");
		}
	}
	
	@Test
	public void Validate_test_box_functionality_in_sign_in_page_with_correct_input() throws InterruptedException
	{
		System.out.println("Step 2 - 3 :  hover on account and list button and tap on sign button");
		Amazon_Sign_in_Page_SignIn amazonSignIn = new Amazon_Sign_in_Page_SignIn();
	    System.out.println("4. validate sign in page");
		Assert.assertTrue(amazonSignIn.tap_sign_in());
		System.out.println("5. enter correct test data in text box");
		amazonSignIn.addEmail("abc@gmail.com");
		Assert.assertEquals(amazonSignIn.getValueFromTest(), "abc@gmail.com");
		amazonSignIn.clickOnButton(Amazon_Sign_in_Page_SignIn_properties.getProperty("Continue"));
	}

}
