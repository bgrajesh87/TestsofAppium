package com.appium.android;

public class IOSSliders {
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

		driver.scrollTo("Sliders").click();

		WebElement slider=driver.findElements(By.className("UIASlider")).get(0);

		intpercent=0;

		if(!(percent > 85 && percent < 95)){

		slider.sendKeys("0.9"); //85-95

		String strpercent=slider.getAttribute("value");//91%

		String[] extractPercent=strpercent.split("%");

		percent=Integer.parseInt(extractPercent[0]);

		System.out.println(slider.getAttribute("value"));

		}else{

		System.out.println(slider.getAttribute("value"));

		System.out.println("Value not in Range");

		}

		//slider.sendKeys("0.9");//Approx Value

		//System.out.println(slider.getAttribute("value"));

		driver.quit();

		}
}
