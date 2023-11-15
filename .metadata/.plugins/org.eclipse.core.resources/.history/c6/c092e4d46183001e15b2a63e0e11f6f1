package poem_advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class MyAppiumClass {
	AndroidDriver driver;
	DesiredCapabilities caps = new DesiredCapabilities();

	@BeforeTest
	public void Mysetup() {
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Andriod");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"ZaQa");
		
		              // This is only when we need to use mobile application
		File CalculatorApp = new File("src/Applications/calculator.apk");
		caps.setCapability(MobileCapabilityType.APP, CalculatorApp.getAbsolutePath());

	}
	
	@Test()
	public void TestCalclulatorApp() throws MalformedURLException {
    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
    driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
    driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
    driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
    driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
    driver.findElement(By.id("com.google.android.calculator:id/digit_7")).click();
    driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
    



	
	}
		
		
		
		
		
		
		// This is only when we need to use mobile browser
//		caps.setCapability("chromedriverExecutable", "D:\\ChromeWebDriverZ1\\chromedriver.exe");
//		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");

//	}
	
//	@Test()
//	public void OpenBrowserAndUseGoogle() throws MalformedURLException {
//		
//		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
//		driver.get("https://www.google.com");
//		driver.findElement(By.id("XSqSsc")).sendKeys("Linkedin"+Keys.ENTER);
//
//	}





	@AfterTest
	public void PostTesting() {

	}

}
