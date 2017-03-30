package com.appium.android;

public class IOSDatePicker {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

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

		driver.scrollTo("Date Picker").click();

		//System.out.println(driver.findElements(By.className("UIAPickerWheel")).get(0).getAttribute("values"));

		//System.out.println(driver.findElements(By.className("UIAPickerWheel")).get(1).getAttribute("values"));

		//System.out.println(driver.findElements(By.className("UIAPickerWheel")).get(2).getAttribute("values"));

		//System.out.println(driver.findElements(By.className("UIAPickerWheel")).get(3).getAttribute("values"));

		driver.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Jan 9");

		driver.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("11");

		driver.findElements(By.className("UIAPickerWheel")).get(2).sendKeys("30");

		driver.findElements(By.className("UIAPickerWheel")).get(3).sendKeys("AM");

		Thread.sleep(5000);

		driver.quit();

		}
}
