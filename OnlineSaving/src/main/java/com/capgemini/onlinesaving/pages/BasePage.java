package com.capgemini.onlinesaving.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.onlinesaving.generics.WebActionsUtil;

public class BasePage {
    
	public WebDriver driver;
	public WebActionsUtil WebActionsUtil;
	
	public BasePage(WebDriver driver, WebActionsUtil WebActionsUtil)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.WebActionsUtil=WebActionsUtil;
	}
	
	
}
