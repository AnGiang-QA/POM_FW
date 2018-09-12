package com.phptravels.base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public Page() {
		if(driver == null) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		DesiredCapabilities Capabilities = DesiredCapabilities.chrome();
		Capabilities.setJavascriptEnabled(true);
		options.merge(Capabilities);
		
		ChromeDriverService service = new ChromeDriverService.Builder()
				.usingDriverExecutable(new File(("D:\\WorkSpaces\\FW\\PageObjectModel\\src\\test\\resources\\com\\phptravels\\executables\\chromedriver.exe")))
				.usingAnyFreePort()
				.build();
		
		driver = new ChromeDriver(service, options);
		
		driver.get("https://www.phptravels.net/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		wait = new WebDriverWait(driver, 10);
		}
		PageFactory.initElements(driver, this);
	}
	
}
