package com.phptravel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.phptravel.core.DriverContext;
import com.phptravel.core.DriverInit;

public class LandingPage extends DriverContext{

	By cssMyaccount = new By.ByCssSelector("#collapse #li_myaccount");
	WebElement btnMyaccount = driver.findElement(cssMyaccount);
	
	By cssLogin = new By.ByCssSelector("#collapse #li_myaccount a[href='https://www.phptravels.net/login']");
	WebElement btnLogin = driver.findElement(cssLogin);
	
	public LandingPage() {
	}
	
	public LoginPage goToLoginPage(){
		btnMyaccount.click();
		btnLogin.click();
		return new LoginPage();
		
	}
	
	public String getLandingPageTitle() {
		return driver.getTitle();
	}

}
