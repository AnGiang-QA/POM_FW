package com.phptravel.core;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverContext {
	
	public static WebDriver driver;
	
	public static void initialazation() {
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

}
