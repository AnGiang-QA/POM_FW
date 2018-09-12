package com.phptravels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.phptravels.base.Page;

public class LoginPage extends Page{
	
	@FindBy(css = "#loginfrm input[name='username']")
	@CacheLookup
	private WebElement txtEmail;

	@FindBy(css = "#loginfrm input[name='password']")
	@CacheLookup
	private WebElement txtPassword;
	
	@FindBy(css = "#loginfrm button.loginbtn")
	@CacheLookup
	private WebElement btnLogin;	

	public AccountPage doLogin(String email, String password) {
		txtEmail.sendKeys(email);
		
		txtPassword.sendKeys(password);
		
		btnLogin.click();
		
		return new AccountPage();
		
	}
	
	public String getScreenTitle() {
		return driver.getTitle();
	}

}
