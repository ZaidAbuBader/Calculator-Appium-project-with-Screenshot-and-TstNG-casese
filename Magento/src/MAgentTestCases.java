import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import net.bytebuddy.asm.Advice.Enter;

public class MAgentTestCases extends ParametesMagento {

	@BeforeTest
	public void MyBeforeTest() {
		driver.get(MagentoWebsite);
		driver.manage().window().maximize();

	}

//	@Test(priority = 1)
//	public void SignUp() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//		WebElement CreateAccountButton = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a"));
//		CreateAccountButton.click();
//		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Zaid");
//		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Abu Bader");
//		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("zaid440@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Zaid123456");
//		driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys("Zaid123456");
//		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("zaid440@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Zaid123456");
//		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//		Thread.sleep(3000);
//		String GetTheMsg = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[1]")).getText();
//		System.out.println(GetTheMsg);
//		boolean thechecking = GetTheMsg.contains("Welcome");
//		MyAssert.assertEquals(thechecking, true);
//
//		System.out.println(thechecking);
//		Thread.sleep(3000);

	// }

//	@Test()
//	public void AssertionSignUp() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get(MagentoWebsite);
//
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("zaid440@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Zaid123456");
//		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//		Thread.sleep(3000);
//		String GetTheMsg = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[1]")).getText();
//		System.out.println(GetTheMsg);
//		boolean thechecking = GetTheMsg.contains("Welcome");
//		MyAssert.assertEquals(thechecking, true);
//
//		System.out.println(thechecking);
//
//	}
//	@Test()
//	public void SearchOnItems() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		driver.get(MagentoWebsite);
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("zaid440@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Zaid123456");
//		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//
//		Thread.sleep(3000);
//		String[] SearchedItems = { "Jacket", "t-shirt", "jeans for men", "jeans for women", "pants" };
//		Random rand = new Random();
//		int MyIndexItems = rand.nextInt(0, 5);
//
//		WebElement SearchBar = driver.findElement(By.xpath("//*[@id=\"search\"]"));
//		Thread.sleep(3000);
//
//		SearchBar.sendKeys(SearchedItems[MyIndexItems] + Keys.ARROW_DOWN + Keys.ENTER);
//
//		WebElement SearchBar2 = driver.findElement(By.xpath("//*[@id=\"search\"]"));
//		SearchBar2.clear();
//		System.out.println(SearchedItems[MyIndexItems]);
//
//		String SearchResult = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/strong")).getText();
//		boolean ResultOfSearch = SearchResult.contains(SearchedItems[MyIndexItems]);
//		MyAssert.assertEquals(ResultOfSearch, true);
//
//	}

	@Test()
	public void AddItemsToCart() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get(MagentoWebsite);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("zaid440@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Zaid123456");
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		JavascriptExecutor jse =  (JavascriptExecutor)driver;
		Thread.sleep(1500);
		jse.executeScript("window.scrollBy(0,400)");
		String [] selectedItems= { "Radiant tee", "breathe-easy tank", "argus all-weather tank", "hero hoodie", "fusion backpack" };
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[1]/div/a/span/span/img")).click();
		String [] sizeOfItems = {"XS","S","M","L","XL"};
		Random rand=new Random();
		int MySizeindex=rand.nextInt(0, 6);
		//for (int i = 0; i < sizeOfItems.length; i++) {
		WebElement SSS= driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
		
		
		//*[@id="option-label-size-143-item-167"]
		//*[@id="option-label-size-143-item-168"]
			//driver.findElements(By.className("swatch-option text")).get(0).click();
//			
//		}

		
		
//		List<WebElement> SelectTheSizeButtons = driver.findElements(By.className("swatch-attribute-options clearfix")).;
//		//for (int i = 0; i < SelectTheSizeButtons.size(); i++) {
//			SelectTheSizeButtons.click();
//			Thread.sleep(1000);}
//		

	}

	@AfterTest
	public void MYAfterTest() {

	}

}
