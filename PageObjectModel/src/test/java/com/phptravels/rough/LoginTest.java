package com.phptravels.rough;

import com.phptravels.pages.AccountPage;
import com.phptravels.pages.HomePage;
import com.phptravels.pages.HotelPage;
import com.phptravels.pages.LoginPage;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HomePage homePg = new HomePage();
		
		LoginPage loginPg = homePg.goToLoginPage();
		System.out.println(loginPg.getScreenTitle());
	
		AccountPage AccPg = loginPg.doLogin("user@phptravels.com", "demouser");
		System.out.println(AccPg.getScreenTitle());
		
		HotelPage HotelPg = AccPg.gotoHotelPage();
		System.out.println(HotelPg.getScreenTitle());
		
	}

}
