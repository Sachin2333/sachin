package com.mindtree.TestCases;
import org.testng.annotations.Test;

import com.mindtree.PageObjects.Search;

public class TC_Search extends BaseClass
{
	@Test
	public void search()
	{
		Search ss=new Search(driver);
		log.info("home page open successfully");
		
		ss.search();
		log.info("search page open sucessfully");
		
		ss.clksearch();
		log.info("click search open");
	    
		ss.selecttable();
		log.info("select table sucessfully");
	}
	
	
}
