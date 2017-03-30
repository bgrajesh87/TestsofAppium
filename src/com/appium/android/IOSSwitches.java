package com.appium.android;

public class IOSSwitches {
	public static void main(String[] args) throws Exception {

		DesiredCapabilities capabilities=new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);

		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1");

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Srikanth Vejendla's iPhone");

		capabilities.setCapability("udid","5e66e1067a0afea89be55a2d06322a98344023bb");

		capabilities.setCapability("bundleId","com.srikanth.uicatlog");

		IOSDriver driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.findElements(By.className("UIAButton")).get(0).click();

		driver.scrollTo("Switches").click();

		//Turn Off Switch

		if(driver.findElements(By.className("UIASwitch")).get(0).getAttribute("value").equals("1")){

		driver.findElements(By.className("UIASwitch")).get(0).click();

		}

		//Turn Off Switch

		if(driver.findElements(By.className("UIASwitch")).get(0).getAttribute("value").equals("0")){

		driver.findElements(By.className("UIASwitch")).get(0).click();

		}

		driver.quit();

		}
}
