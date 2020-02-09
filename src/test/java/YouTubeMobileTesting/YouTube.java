package YouTubeMobileTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class YouTube {

	public static void main(String[] args) throws MalformedURLException {


		AppiumDriver driver = new AndroidDriver<MobileElement>(u, d);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		MobileElement el1 = (MobileElement) driver.findElement(By.id("com.google.android.youtube:id/menu_search"));
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElement(By.id("com.google.android.youtube:id/search_edit_text"));
		el2.sendKeys("Selena Gomez Wolves");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView"));
		el3.click();

		MobileElement el4 = (MobileElement) driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView"));
		el4.click();
	}
}