package com.appium.android;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaucnSafaiOnRealiOSdevice {
	//1) Install the SafariLauncher on your real ios device

	//2) Install the Debug Proxy

	// brew install ios-webkit-debug-proxy

	//3) Settings Change(Settings->Safari->Advanced->Web Inspector)

	//4) Run Proxy

	//ios_webkit_debug_proxy -c 5e66e1067a0afea89be55a2d06322a98344023bb:27753

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

	DesiredCapabilities capabilities=new DesiredCapabilities();

	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);

	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1");

	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Srikanth Vejendla's iPhone");

	capabilities.setCapability("udid","5e66e1067a0afea89be55a2d06322a98344023bb");

	capabilities.setCapability("app","com.srikanth.safariauncher");

	capabilities.setCapability("safariAllowPopups",false);

	capabilities.setCapability("safariIgnoreFraudWarning",true);

	IOSDriver driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

	Thread.sleep(5000);

	Set<String> contextHandles=driver.getContextHandles();

	for(String contextHandle:contextHandles){

	if(contextHandle.contains("WEBVIEW")){

	driver.context(contextHandle);

	}

	}

	driver.get("http://google.com");

	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	Thread.sleep(5000);

	driver.quit();

	}

	 
}
