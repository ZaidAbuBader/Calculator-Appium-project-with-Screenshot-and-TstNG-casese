import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class almosafer extends Parameter {

	@BeforeTest
	public void MyBeforeTest() {
		driver.get(TheWebsite);
		driver.manage().window().maximize();
		driver.findElement(By.className("cta__saudi")).click();
	}
//
//	@Test()
//	public void ChechTheLang3WithHardAssert() {
//		String ActualButoonLang = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]"))
//				.getText();
//		HardAssert.assertEquals(ActualButoonLang, ExpectedLAngButton);
//	}
//
//	@Test()
//	public void CheckTheLAng() {
//		String ActualURL = driver.getCurrentUrl();
//		SoftAssert.assertEquals(ActualURL, "https://www.almosafer.com/en?ncr=1");
//		SoftAssert.assertAll();
//	}
//
//	@Test()
//	public void CheckTheLang2() {
//		String ActualButoonLang = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]"))
//				.getText();
//		SoftAssert.assertEquals(ActualButoonLang, ExpectedLAngButton);
//		SoftAssert.assertAll();
//	}
//
//	@Test()
//	public void CheckTheCurrency() {
//		String Actualurrency = driver
//				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button")).getText();
//		HardAssert.assertEquals(Actualurrency, ExpectedCurrency);
//	}
//
//	@Test()
//	public void CheckThePhone() {
//		String ActulaNumber = driver
//				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[2]/strong")).getText();
//		SoftAssert.assertEquals(ActulaNumber, ExpectedNumber);
//
//	}

	@Test()
	public void CheckQitafLogo() {
		WebElement MyFooter = driver.findElement(By.tagName("footer"));
		List<WebElement> TheImageOfSVG = MyFooter.findElements(By.tagName("svg"));
		
		for (int i = 0; i < TheImageOfSVG.size(); i++) {
			String SvgName = TheImageOfSVG.get(i).getAttribute("data-testid");
			System.out.println(SvgName);

			if (SvgName == null) {
				continue;
			} else if ( SvgName.contains("Footer__QitafLogo")) {
				System.out.println("hhhhhhaaaaaaaiiiiiiiiiiiiii@@@@@@@@"+ ActualValueOfQitaf);
				 //Boolean ActualValueOfQitaf=true ;
				

			}
			//HardAssert.assertEquals(ActualValueOfQitaf, true);
		}
	}

	@AfterTest
	public void MyAfterTest() {

	}

}
