package com.phptravel.pages;

import org.openqa.selenium.By;

import com.phptravel.core.DriverContext;

public class LandingPage extends DriverContext{

	By btnMyaccount = new By.ByCssSelector("#collapse #li_myaccount");
	
	By btnLogin = new By.ByCssSelector("#collapse #li_myaccount a[href='https://www.phptravels.net/login']");
	
	By lnkHotelPage = new By.ByCssSelector("#collapse a[title='Hotels']");
	
	By txtHotelName = new By.ByCssSelector("#select2-drop input");
	
	By btnSeach = new By.ByCssSelector("#HOTELS div.search-button button");
	
	public LandingPage() {
	}
	
	public LoginPage goToLoginPage(){
		driver.findElement(btnMyaccount).click();
		driver.findElement(btnLogin).click();
		return new LoginPage();
		
	}
	
	public String getLandingPageTitle() {
		return driver.getTitle();
	}
	
	public HotelPage goToHotelPage() {
		driver.findElement(lnkHotelPage).click();
		return new HotelPage();
	}
	
	public void enterHotelName(String Name) {
		driver.findElement(txtHotelName).sendKeys(Name);
	}
	

}
