package com.mindtree.TestCases;

import org.testng.annotations.Test;

import com.mindtree.PageObjects.LoginPage;

public class TC_LoginPage extends BaseClass
{
	@Test
	public void loginpage() throws InterruptedException
	{
		LoginPage pk=new LoginPage(driver);
		log.info("Home page open successfully");
		
		pk.loginHover();
		log.info("Login window hover successfully");
		
		pk.loginClk();
		log.info("click on login btn successfully");
		
		pk.popUpWindow();
		log.info("go to pop up windowsucessfully");
		
	    Thread.sleep(5000);
	    pk.textEmail();
		log.info("email send sucessfully");
		
		pk.textPassword();
		log.info("password send sucessfully");
		
		pk.clickLogin();
		log.info("login sucessfully");
		
			
	}
	

}
