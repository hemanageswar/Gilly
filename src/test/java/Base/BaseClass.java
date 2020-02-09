package Base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	public static AppiumDriver driver;

	public void desiredSetUp() throws MalformedURLException {

		DesiredCapabilities d = new DesiredCapabilities();
		d.setCapability("deviceName", "emulator-5554");
		d.setCapability("platformName", "android");
		d.setCapability("platformVersion", "8.1.0");
		d.setCapability("appPackage", "com.google.android.youtube");
		d.setCapability("appActivity", "com.google.android.apps.youtube.app.WatchWhileActivity");
		URL u = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(u, d);
	}

	public void btnClick(MobileElement element) {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		element.click();
	}

	public void setText(MobileElement element, String text) {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		element.sendKeys(text);
	}

	public void quit() {
		driver.quit();
	}
}
