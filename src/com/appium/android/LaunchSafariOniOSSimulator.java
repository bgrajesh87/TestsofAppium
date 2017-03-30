package com.appium.android;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class LaunchSafariOniOSSimulator {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities=new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");

		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.IOS);

		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1");

		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"safari");

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone Simulator");

		IOSDriver driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("http://google.com");

		Thread.sleep(4000);

		driver.quit();
}
}
