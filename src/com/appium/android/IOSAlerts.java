package com.appium.android;

public class IOSAlerts {
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

		driver.scrollTo("Alert Controller").click();

		driver.findElement(By.name("Simple")).click();

		//Alert simpleAlert=driver.switchTo().alert();

		//simpleAlert.accept();

		if(driver.findElement(By.className("UIAAlert")).getAttribute("label").equals("A Short Title Is Best")){

		driver.findElement(By.name("OK")).click();

		}

		Thread.sleep(3000);

		driver.quit();

		}
}
