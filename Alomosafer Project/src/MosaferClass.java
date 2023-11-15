import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

@Test
public class MosaferClass extends ParametersClass {
	// Assertion MyAssert=new Assertion(); you can add assertion here to be a global
	// or you can put in parameters class that inherits every thing to here

	@BeforeTest
	public void myBeforeTest() {
		driver.get(TheWebsite);
		driver.manage().window().maximize();
	}

//////////////////////
//	@Test(description = "test number 2")
//	public void CheckTheLanguage() {
//
//		String ActualLanguage = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]"))
//				.getText();
//		MyAssert.assertEquals(ActualLanguage, ExpectedLanguageArabic, "test the language is English is done");
//	}

//////////////////////////////////////////////////////////
	public void CheckTheCurrency() {

		String ActualCurrency = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button")).getText();
		MyAssert.assertEquals(ActualCurrency, ExpectedCurrency);
	}

////////////////////////////////////////////////////////////
	public void CheckThenumber() {

		String TheActualNumber = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[2]/strong")).getText();
		MyAssert.assertEquals(TheActualNumber, ExpectedNumber);
		System.out.println(TheActualNumber + "@@@@@@@@@@@");
		System.out.println(TheActualNumber + "????????????");

//	int TheActualNumber2=Integer.parseInt(TheActualNumber);this is not worked 
//	int ExpectedNumber2=Integer.parseInt(ExpectedNumber);
//	//MyAssert.assertEquals(TheActualNumber2, ExpectedNumber2);
	}

/////////////////////////////////////////////////////////
	public void CheckQitafLogo() {
		WebElement MyFooter = driver.findElement(By.tagName("footer"));
		List<WebElement> TheNumberOfSVGinFooter = MyFooter.findElements(By.tagName("svg"));
		System.out.println(TheNumberOfSVGinFooter.size() + "   @@@@@@@@");

		for (int i = 0; i < TheNumberOfSVGinFooter.size(); i++) {
			String TheDtaTestid = TheNumberOfSVGinFooter.get(i).getAttribute("data-testid");
			System.out.println(TheDtaTestid);

			if (TheDtaTestid == null) {
				continue;
			} else if (TheDtaTestid.equals("Footer__QitafLogo"))
				// else if (TheDtaTestId.contains("Footer__QitafLogo") ) //you can use contains
				// function

				ActualvalueOfQitafIfIsThere = true;
		}
		MyAssert.assertEquals(ActualvalueOfQitafIfIsThere, true);
		 System.out.println("hello zaid i ama here");}
	
//////////////////////////////////////////////////

//	@Test()
//	public void AnotherCheckQitafLogoAnother() {
//		WebElement MyFooter222222 = driver.findElement(By.xpath("//*[@id=\"__next\"]/footer"));
//		List<WebElement> TheNumberOfSVGinFooter222 = MyFooter222222.findElements(By.tagName("svg"));
//
//		System.out.println(TheNumberOfSVGinFooter222.size() + "   $$$$$$$$");
//
//		for (int i = 0; i < TheNumberOfSVGinFooter222.size(); i++) {
//			String TheDtaTestId = TheNumberOfSVGinFooter222.get(i).getAttribute("data-testid");
//			System.out.println(TheDtaTestId);
//		}
//	}
//
//	@Test()
//	public void CheckthenumberofsvginHeader() {
//		// To find the number of svg images in the Header
//		WebElement MyHeader = driver.findElement(By.xpath("//*[@id=\"__next\"]/header"));
//		List<WebElement> ThenumberOfSVGinHeader = MyHeader.findElements(By.tagName("svg"));
//		System.out.println(ThenumberOfSVGinHeader.size() + "  KKKKKKKKK");
//
//	}
////////////////////////////////////////////////////////

//	@Test(description = "test number 5")
//	public void Hotel_Tab_is_not_Selected() {
//
//		String Expected_Value_Of_Pressing = "false";
//
//		WebElement Hotel_tab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
//
//		String Actual_Value_Of_Pressing = Hotel_tab.getAttribute("aria-selected");
//
//		System.out.println(Actual_Value_Of_Pressing + "#########");
//
//		MyAssert.assertEquals(Actual_Value_Of_Pressing, Expected_Value_Of_Pressing);
//
//	}

	//////////////////////////////////////////////////////////////////////////
//	@Test(description = "test number 6")
//	public void FlightTabIsPressing() {
//
//		WebElement FlightTab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-flights\"]"));
//		String ActualFlightTabIsPressed = FlightTab.getAttribute("aria-selected");
//		String ExpectedFlightTabPressed = "true";
//		System.out.println(ActualFlightTabIsPressed + "@@@@@@@@@@@@");
//		MyAssert.assertEquals(ActualFlightTabIsPressed, ExpectedFlightTabPressed);
//	}
//	//////////////////////////////////



//	@SuppressWarnings("deprecation")
//	@Test(description = "test number =7")
	// public void CheckFlightDate() {
//		Date TodayTime = new Date();
//		System.out.println(TodayTime + "     &&&&&&&&&&");
//		System.out.println(TodayTime.getDay() + "    @@@@@@@");
//		int NumberOfDaysExtra = 1;
//		int ActualdayofMounth = TodayTime.getDay();
//
//		String TheDayOnTheWebsite = driver.findElement(By.xpath(
//				"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[3]/div/div/div/div[1]/span[2]"))
//				.getText();
//		int TheDayOnTheWebsiteAsInteger = Integer.parseInt(TheDayOnTheWebsite);
//		MyAssert.assertEquals(TheDayOnTheWebsiteAsInteger, ActualdayofMounth + NumberOfDaysExtra);
	                     
	///// ANOTHER IDEAS OF DATE
	// LocalDate ExpectedDate=LocalDate.now().plusDays(1);its not suitable because
	// its come the month as number
	// While in the website .the monthe typed as "May" not as number  "5"
	
//			Calendar todaydateeman=Calendar.getInstance(); this is correct
//			System.out.println(todaydateeman.getTime()+"!!!!!!!!!!!!!!!");
//
//	}
	
	
	
	
	
	

//	@SuppressWarnings("deprecation test number 8")
//	@Test()
//	public void CheckReturntDate() {
//		// LocalDate ExpectedDate=LocalDate.now().plusDays(1);its not suitable because
//		// its come the month as number
//		// and in the website .the monthe typed as May not 5
////			Calendar todaydateeman=Calendar.getInstance(); this is correct
////			System.out.println(todaydateeman.getTime()+"!!!!!!!!!!!!!!!");
//
//		Date TodayTime = new Date();
//		System.out.println(TodayTime + "     &&&&&&&&&&");
//		System.out.println(TodayTime.getDay() + "    @@@@@@@");
//
//		int NumberOfDaysExtra = 2;
//		int ActualdayofMounth = TodayTime.getDay();
//
//		String TheDayOnTheWebsite = driver.findElement(By.xpath(
//				"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[3]/div/div/div/div[2]/span[2]"))
//				.getText();
//		int TheDayOnTheWebsiteAsInteger = Integer.parseInt(TheDayOnTheWebsite);
//		MyAssert.assertEquals(TheDayOnTheWebsiteAsInteger, ActualdayofMounth + NumberOfDaysExtra);
//
//	}
	@Test(description = "test number 9")

	public void RandomCheckTheWebsiteLanguage() {

		String MyUrls[] = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
		int MyLandindex = rand.nextInt(0, 2);
		driver.get(MyUrls[MyLandindex]);
		
		if (driver.getCurrentUrl().contains("ar")) {
			String Lang = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]"))
					.getText();
			MyAssert.assertEquals(Lang, ExpectedLanguageEnglish);
			
		} else {
			String Lang = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]"))// also

					.getText();
			MyAssert.assertEquals(Lang, ExpectedLanguageArabic);
		}

	}

	@Test(description = "test number 10", priority = 1)

	public void CheckTheHotel() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		String MyArabicCountries[] = { "جدة", "دبي" };
		int MyArabicIndex = rand.nextInt(0, 2);

		String MyEnglishCountries[] = { "dubai", "jeddah", "riyadh" };
		int MyEngishIndex = rand.nextInt(0, 3);

		String MyUrls[] = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
		int MyLangindex = rand.nextInt(0, 2);
		driver.get(MyUrls[MyLangindex]);

		if (driver.getCurrentUrl().contains("ar")) {
			WebElement Hotel_tab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
			Hotel_tab.click();// to press on hotel tab
			Thread.sleep(1500);

			WebElement SearchField = driver.findElement(By.xpath(
					"//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input"));

			SearchField.sendKeys(MyArabicCountries[MyArabicIndex] + Keys.ARROW_DOWN);
			Thread.sleep(1500);

			WebElement searchbutton = driver.findElement(
					By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[4]/button"));
//
//			SearchField.sendKeys(Keys.ARROW_DOWN );
//			SearchField.sendKeys(Keys.ARROW_DOWN );

			searchbutton.click();

			// SearchField.sendKeys(Keys.ENTER); enter button dosnt work in the website,for
			// that we use search button
			// another example of array with daghter names and how you can call them
			// String daugternames[]= {"naya","tuleen","yara" };
//			int daghterindex=rand.nextInt(0, 3);
//			SearchField.sendKeys(daugternames[daghterindex]);
//			// SearchField.sendKeys("zaid");

		} else {
			WebElement Hotel_tab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
			Hotel_tab.click();
			Thread.sleep(1500);

			WebElement SearchField = driver.findElement(By.xpath(
					"//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input"));
			SearchField.sendKeys(MyEnglishCountries[MyEngishIndex] + Keys.ARROW_DOWN);
			Thread.sleep(1500);

			WebElement searchbutton = driver.findElement(
					By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[4]/button"));
			// SearchField.sendKeys(Keys.ARROW_DOWN );
			// SearchField.sendKeys(Keys.ARROW_DOWN );

			searchbutton.click();

			// SearchField.sendKeys("Nayazaid@@@@@@@");
		}

	}

	@Test(description = "test number 11", priority = 2)
	public void CheckTheRoomAndTheOption() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// Select MySelector = new Select(driver
		// .findElement(By.xpath("//*[@id=\"__next\"]/section[2]/div/section/div/div/div/div/div[3]/div/select")));
		WebElement NumberOfVisitors = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/section[2]/div/section/div/div/div/div/div[3]/div/select"));
		Select MySelector = new Select(NumberOfVisitors);
		int MyIndex = rand.nextInt(0, 2);
		MySelector.selectByIndex(MyIndex);
		// MySelector.getAllSelectedOptions() ,, this is used for checkbox selection
		// MySelector.selectByValue("B");            when we want randomly selection ,is better to
		// use selectbyindex not selectbyvalue
		// MySelector.selectByIndex(1); if we want to select a specific selection
		// but if we want to select randomly from two selection,we use rand.nextint( )


	}

	@Test(description = "test number 12", priority = 3)
	public void PressSearchButton() {
		WebElement PressSearchButton = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/section[2]/div/section/div/div/div/div/div[4]/button"));
		PressSearchButton.click();

	}

	@Test(description = "test number 13", priority = 4)
	public void TheLodingIsCompleted() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement SearchResult = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/section/span"));
		String SearchResultToText = SearchResult.getText();// here to convert the webelement to string

		// or you can use it directly in one line by typing String
		// SearchResult=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/section/span")).gettext();
		
		boolean ActulaResult = SearchResultToText.contains("found") || SearchResultToText.contains("وجدنا ");
//		if (ActulaResult==true ) {
//		 System.out.println(SearchResultToText+"$$#######$$$$$$$$");
		MyAssert.assertEquals(ActulaResult, true);

		// MyAssert.assertEquals(ActulaResult, false); to check the assertion if its
		// correct

	}

	@Test(description = " test number =14", priority = 5)
	public void Sorting_From_Low_to_High() throws InterruptedException {
		WebElement LowestPriceButton = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[2]/section[1]/div/button[2]"));
		LowestPriceButton.click();
		Thread.sleep(3000);
		
		List<WebElement> ThePrices = driver.findElements(By.className("Price__Value"));

		String ThePriceOfTheFirstPrice = ThePrices.get(0).getText();// for the first price in the index
		int IntegerFirstPrice = Integer.parseInt(ThePriceOfTheFirstPrice);

		String ThePriceOfTheLastPrice = ThePrices.get(ThePrices.size() - 1).getText();// for the last price in the index
		int IntegerLastPrice = Integer.parseInt(ThePriceOfTheLastPrice);

		MyAssert.assertEquals(IntegerFirstPrice < IntegerLastPrice, true);

//		for (int i=0;i<ThePrices.size();i++) {
//			String ThePriceOnTheWebsite =ThePrices.get(i).getText();
//			int EditedPriceInt=Integer.parseInt(ThePriceOnTheWebsite);
		// System.out.println(ThePriceOnTheWebsite);
		// or you can type it directly
		// System.out.println(ThePrices.get(i).getText())without declare a new variable

	}

	@Test()
	public void ArrayListCheck() {

		List<Integer> MyListFour = new ArrayList<Integer>();
		MyListFour.add(255);
		System.out.println(MyListFour.get(0));
		
		// MyListFour.clear();// this is cleared all thing
		// System.out.println(MyListFour.get(0));

	}

	@Test()
	public void checkarraylist2() {

		// List<WebElement> MyListThree = new ArrayList<WebElement>();
		List<WebElement> MyListThree = driver.findElements(By.tagName("svg"));

		System.out.println(MyListThree.size());
//		System.out.println(MyListThree.get(4));
		for (int i = 0; i < MyListThree.size(); i++) {
			String zzz = MyListThree.get(i).getAttribute("data-testid");
			System.out.println(zzz);

		}

	}

}
