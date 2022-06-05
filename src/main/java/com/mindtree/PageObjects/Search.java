package com.mindtree.PageObjects;


import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search
{
	WebDriver ldriver;
	
	 public Search(WebDriver rdriver)
	 {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }

	 @FindBy(xpath="//*[@id=\"search\"]")
	 @CacheLookup
	 WebElement Search;
	 
	 public void search()
	 {
		 ldriver.manage().window().maximize();
		 Search.click();
		 Search.sendKeys("dining table");
	 }
	 
	 @FindBy(xpath="//*[@id=\'search_button\']/span")
	 @CacheLookup
	 WebElement Clksearch; 
	 
	 public void clksearch()
	 {
	   Clksearch.click();
	 }
	 
	 @FindBy(xpath="//*[@id=\'search-results\']/div[3]/ul/li[2]/div/a/img")
	 @CacheLookup
	 WebElement Selecttable;
	 
	 public void selecttable()
	 {
		 Set <String> s=ldriver.getWindowHandles();
			for(String i:s)
			{
				String t=ldriver.switchTo().window(i).getTitle();
				System.out.println(t);
			}
		Selecttable.click();
	 }
	 
}

