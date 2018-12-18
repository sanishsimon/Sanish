package Tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class LaunchApp {
	
	private AndroidDriver driver;
	
	@Test
	public void LaunchApp() throws MalformedURLException, InterruptedException {


		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Redmi Sanish");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		capabilities.setCapability("noReset", true);

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		//this.clickSkipSignIn();
		this.clickHamburger();
		this.kindleEreader();
		this.readers();
		this.tap();
				
}
	
/*	public void clickSkipSignIn()
	{
		driver.findElementByXPath("//android.widget.Button[@index='7']").click();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}*/
	
	public void clickHamburger()
	{
		driver.findElementById("in.amazon.mShop.android.shopping:id/web_home_shop_by_department_label").click();
		System.out.println("Menu Tapped");
	}
	
	public void kindleEreader()
	{
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View[2]").click();
		System.out.println("Kindle Tapped");
	}
	public void readers()
	{
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[4]/android.view.View[2]").click();
		System.out.println("Kindle E-readers Tapped");
	}
	
	public void tap()
	{
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View").click();
		
	} 
	
	public void find()
	{
		//newTouchAction().press(364,196).moveTo(268,655).release();
	
	}
	
	
}
