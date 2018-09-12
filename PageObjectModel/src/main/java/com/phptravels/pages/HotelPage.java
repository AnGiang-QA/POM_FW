package com.phptravels.pages;

import com.phptravels.base.Page;

public class HotelPage extends Page{
	
	public String getScreenTitle() {
		return driver.getTitle();
	}

}
