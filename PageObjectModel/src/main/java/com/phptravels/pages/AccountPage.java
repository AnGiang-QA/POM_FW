package com.phptravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.phptravels.base.Page;

public class AccountPage extends Page{
	
	@FindBy(css = "#collapse a[title='Hotels']")
	@CacheLookup
	private WebElement lnkHotels;	
	
	public HotelPage gotoHotelPage() {
		
		lnkHotels.click();

		return new HotelPage();
	}
	
	public String getScreenTitle() {
		return driver.getTitle();
	}
}
