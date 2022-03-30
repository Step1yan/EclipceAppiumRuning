package com.bs.demo;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LaunchMsiteInChrome {
	public static void main (String[] args) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
        caps.setCapability("chromeOptions", ImmutableMap.of("w3c", false));
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"),caps);
        driver.get("https://www.amazon.com");
    }

}
