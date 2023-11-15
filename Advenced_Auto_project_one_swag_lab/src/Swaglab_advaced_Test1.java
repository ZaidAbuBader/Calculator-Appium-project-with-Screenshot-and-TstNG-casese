import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Swaglab_advaced_Test1 {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void MyBeforeTest() {
		driver.get("https://www.saucedemo.com/");
	}

//	@Test()
//	public void MyTestOne() {
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
//
//		// using CSS selector
//		driver.findElement(By.cssSelector("[data-test=\'login-button\']")).click();
//		// driver.findElement(By.name("login-button")).click();
//
//		// driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
//
//	}
//
//	@Test()
//	public void MyTesttwo_AddAllToCart() throws InterruptedException {
//		List<WebElement> AddToCart = driver.findElements(By.className("btn_primary"));
//		for (int i = 0; i < AddToCart.size(); i++) {
//			AddToCart.get(i).click();
//		}
//		Thread.sleep(3000);
//
//		driver.findElement(By.className("shopping_cart_link")).click();
//		Thread.sleep(3000);
//
//		driver.findElement(By.id("checkout")).click();
//
//		driver.findElement(By.id("first-name")).sendKeys("zaid");
//		driver.findElement(By.id("last-name")).sendKeys("Abu Bader");
//		driver.findElement(By.id("postal-code")).sendKeys("123456");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.name("finish")).click();
//
//		String FinishedText = driver.findElement(By.className("complete-header")).getText();
//
//		boolean CheckTheMsgContains = FinishedText.contains("Thank you");
//
//		SoftAssert Assetr1 = new SoftAssert();
//		Assetr1.assertEquals(FinishedText, "Thank you for your order!");
//		Assetr1.assertAll();
//
//		SoftAssert Assetr2 = new SoftAssert();
//		Assetr2.assertEquals(CheckTheMsgContains, true);
//		Assetr2.assertAll();
//
//	}

	@Test()
	public void TestThress() throws InterruptedException {

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("[data-test=\'login-button\']")).click();
		List<WebElement> AddToCart = driver.findElements(By.className("btn_primary"));
		for (int i = 0; i < AddToCart.size(); i++) {
			AddToCart.get(i).click();
		}

		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("zaid");
		driver.findElement(By.id("last-name")).sendKeys("Abu Bader");
		driver.findElement(By.id("postal-code")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();

		String Total = driver.findElement(By.className("summary_total_label")).getText();
		System.out.println(Total);

		String[] NewString = Total.split("\\$");// the $ divide the ARRAY TO TWO PARTS ,ONE BEFOE WITH INDEX 0,AND ONE
												// AFTER WITH INDEX 1
		System.out.println(NewString[0]);
		System.out.println(NewString[1]);
		SoftAssert NumAssert = new SoftAssert();
		NumAssert.assertEquals(NewString[1], "140.34");
		NumAssert.assertAll();

//		// another example of using split ,but for . expression not $
		String[] DotString = Total.split("\\.");
		System.out.println(DotString[0]);
		System.out.println(DotString[1]);
		SoftAssert dotAssert = new SoftAssert();
		dotAssert.assertEquals(DotString[1], "34");
		dotAssert.assertAll();

//		// Assertion for URL
		String ActualURL = driver.getCurrentUrl();
		System.out.println(ActualURL);
		String ExpectedURL = "https://www.saucedemo.com/checkout-step-two.html";
		SoftAssert URLAssert = new SoftAssert();
		URLAssert.assertEquals(ActualURL, ExpectedURL);
		URLAssert.assertAll();

		URLAssert.assertEquals(true, true);
		URLAssert.assertAll();

		URLAssert.assertEquals(3, 3);
		URLAssert.assertAll();

	}
//@Test()public void HardAssert() {
//	
//	driver.findElement(By.id("user-name")).sendKeys("standard_user");
//	driver.findElement(By.name("password")).sendKeys("secret_sauce");
//	driver.findElement(By.cssSelector("[data-test=\'login-button\']")).click();
//	List<WebElement> AddToCart = driver.findElements(By.className("btn_primary"));
//	for (int i = 0; i < AddToCart.size(); i++) {
//		AddToCart.get(i).click();}
//
//	driver.findElement(By.className("shopping_cart_link")).click();
//	driver.findElement(By.id("checkout")).click();
//	driver.findElement(By.id("first-name")).sendKeys("zaid");
//	driver.findElement(By.id("last-name")).sendKeys("Abu Bader");
//	driver.findElement(By.id("postal-code")).sendKeys("123456");
//	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
//	
//	String Total=driver.findElement(By.className("summary_total_label")).getText();
//	System.out.println(Total);
//	
//	String [] NewString=Total.split("\\$");// the $ divide the ARRAY TO TWO PARTS ,ONE BEFOE WITH INDEX 0,AND ONE AFTER WITH INDEX 1
//	System.out.println(NewString[0]);
//	System.out.println(NewString[1]);
//	//assert.assertEquals(NewString[1], "140.34");
//	
//	// another example of using split ,but for . expression not $
//	String [] DotString=Total.split("\\.");
//	System.out.println(DotString[0]);
//	System.out.println(DotString[1]);
//	
//	//assert.assertEquals(DotString[1], "34")	
//	
//	// Assertion for URL
//	String ActualURL=driver.getCurrentUrl();
//	System.out.println(ActualURL);
//	String ExpectedURL="https://www.saucedemo.com/checkout-step-two.html";
//	assert URLAssert=new Assertion();
//
//	
//	URLAssert.assertEquals(false, true);
//
//	URLAssert.assertEquals(3,4 );



	@AfterTest
	public void MtAfterTest() {
	}

}
