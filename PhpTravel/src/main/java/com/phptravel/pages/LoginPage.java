package com.phptravel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.phptravel.core.DriverContext;
import com.phptravel.core.DriverInit;

public class LoginPage extends DriverContext{
	
	WebDriver driver = DriverInit.getDriver();

	By txtEmail = new By.ByCssSelector("#loginfrm input[name='username']");
	
	By txtPassword = new By.ByCssSelector("#loginfrm input[name='password']");

	By btnLogin = new By.ByCssSelector("#loginfrm input[name='password']");
	
	public LoginPage() {
//		driver = DriverInit.getDriver();
	}
	
	public AccountPage login(String email, String password) {
		
		driver.findElement(txtEmail).sendKeys(email);
		driver.findElement(txtPassword).sendKeys(email);
		driver.findElement(btnLogin).click();
		
		return new AccountPage();
	}
	
	public void signUp() {
		
	}
	

}
