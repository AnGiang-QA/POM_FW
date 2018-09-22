package com.phptravel.core;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverInit {
	
	private static DriverInit instance = new DriverInit();
	protected static WebDriver driver;
	
	private DriverInit() {
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
	}
	
	public static synchronized DriverInit getDriverInit() {
		
		if(instance==null) {
			instance = new DriverInit();
		}
		return instance;
	}
	
	public static void openBroser(String url) {
		driver.get(url);
	}
	
	public static void closeBroser() {
		driver.quit();
		instance = null;
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
