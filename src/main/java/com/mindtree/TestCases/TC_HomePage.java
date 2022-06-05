package com.mindtree.TestCases;

import org.testng.annotations.Test;

public class TC_HomePage extends BaseClass
{
	@Test
	public void homePage() throws InterruptedException
	{	
		Thread.sleep(3000);
		log.info("Home Page Open Successfully");
	}

}
