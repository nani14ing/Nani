package com.vtiger.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridPractice {

	@Test
	public void gridPractice() throws MalformedURLException {
		
		URL url=new URL("http://192.168.43.3:2222/wd/hub");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		RemoteWebDriver remote=new RemoteWebDriver(url,capabilities);
		remote.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		remote.get("https://gmail.com");
	}
}
