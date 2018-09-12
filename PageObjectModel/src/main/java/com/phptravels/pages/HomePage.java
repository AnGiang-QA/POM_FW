package com.phptravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.phptravels.base.Page;

public class HomePage extends Page{
	
	@FindBy(css = "#collapse #li_myaccount")
	@CacheLookup
	private WebElement btnMyaccount;
	
	@FindBy(css = "#collapse #li_myaccount a[href='https://www.phptravels.net/login']")
	@CacheLookup
	private WebElement btnLogin;	
	
	public LoginPage goToLoginPage(){
		btnMyaccount.click();
		btnLogin.click();
		return new LoginPage();
	}
	
	public void goToHotelsPage(){
		
	}
	
	public void validateHomeTitle(){
		
	}

}
