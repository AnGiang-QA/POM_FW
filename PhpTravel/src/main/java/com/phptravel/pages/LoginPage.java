package com.phptravel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.phptravel.core.DriverInit;

public class LoginPage {
	
	WebDriver driver = DriverInit.getDriver();

	By cssEmail = new By.ByCssSelector("#loginfrm input[name='username']");
	WebElement txtEmail = driver.findElement(cssEmail);
	
	By cssPassword = new By.ByCssSelector("#loginfrm input[name='password']");
	WebElement txtPassword = driver.findElement(cssPassword);

	By cssLogin = new By.ByCssSelector("#loginfrm input[name='password']");
	
	public LoginPage() {
//		driver = DriverInit.getDriver();
	}

	WebElement btnLogin = driver.findElement(cssLogin);
	
	public AccountPage login(String email, String password) {
		txtEmail.sendKeys(email);
		
		txtPassword.sendKeys(password);
		
		btnLogin.click();
		
		return new AccountPage();
	}	
	

}
