import java.time.Duration;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AlMosafer_2_Class extends Parameters222 {
	@BeforeTest
	public void MyBeforeTest() {
		driver.get(TheWebsite);
		driver.manage().window().maximize();

	}

	@Test(description = "Test Number 1")
	public void Check_Default_Language_Is_English() {
		String ActualLanguage = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]"))
				.getText();
		MyAssert.assertEquals(ActualLanguage, Expected_Arabic_lang);
	}
	// String ExpectedButtonLang = ActualLanguage.getText();// we can declare
	// webelement then convert it to string by using gettext();

	@Test(description = "Test Number 2") // @@@@@@@@@@ Another way by using current URL @@@@@@@@@@@@@
	public void Check22_Default_Language_Is_English22() {
		String EnglishUrl = "https://www.almosafer.com/en";
		String currentURL = driver.getCurrentUrl();
		MyAssert.assertEquals(currentURL, EnglishUrl);
	}

	@Test(description = "Test Number 3")
	public void Check_The_Currency() {
		String AtualCurrency = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button")).getText();
		MyAssert.assertEquals(AtualCurrency, ExpectedCurrency);
	}

	@Test(description = "Test Number 4")
	public void Check_The_Title() {
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		MyAssert.assertEquals(ActualTitle, ExpectedTitle);

	}

	@Test(description = "Test Number 5")
	public void Check_The_ContactNumber() {
		String ActualContact = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[2]/strong")).getText();
		System.out.println(ActualContact);
		MyAssert.assertEquals(ActualContact, ExpectedContact);

	}

	@Test(description = "Test Number 6")
	public void Check_Qitaf_Logo() {
		WebElement Footer = driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[3]"));
		List<WebElement> SvgTagInFooter = Footer.findElements(By.tagName("svg"));
		System.out.println(SvgTagInFooter.size());

		for (int i = 0; i < SvgTagInFooter.size(); i++) {
			String Checkattribute = SvgTagInFooter.get(i).getAttribute("data-testid");
			System.out.println(Checkattribute);

			if ((Checkattribute != null) && Checkattribute.contains("Qitaf")) {
				System.out.println("@@@@@@@@@@   Hello zaid");
				MyAssert.assertEquals(Checkattribute, "Footer__QitafLogo");
			}
		}
	}

//		WebElement Header = driver.findElement(By.xpath("//*[@id=\"__next\"]/header"));
//
//		List<WebElement> imgInFooter=Header.findElements(By.tagName("img"));
//		System.out.println(imgInFooter.size()+"@@@@@@@@@@#######");
//		
//		for (int i=0;i<imgInFooter.size();i++) {
//			String thenameofimageInFooter=imgInFooter.get(i).getAttribute("src");
//			System.out.println(thenameofimageInFooter);
//		}

//		List<WebElement> ImageInSite=driver.findElements(By.tagName("img"));
//		System.out.println(ImageInSite.size());
//		for (int i=0;i<ImageInSite.size();i++) {
//			String thenameofimage=ImageInSite.get(i).getText();
//			System.out.println();
//		}

//	@Test(description = "Test Number 7")
//	public void HotelIsNotChecked() {
//		WebElement HotelButton = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
//		String ExpectedValueOfHotelButton = "false";
//		String Actualvalueofbutton = HotelButton.getAttribute("aria-selected");
//		System.out.println(Actualvalueofbutton);
//		MyAssert.assertEquals(Actualvalueofbutton, ExpectedValueOfHotelButton);
//
//	}

	@Test(description = "Test Number 8")
	public void FlightIstChecked() {
		WebElement FlightButton = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-flights\"]"));
		String Actualvalueofbutton = FlightButton.getAttribute("aria-selected");
		boolean boleanValue = Boolean.parseBoolean(Actualvalueofbutton);// convert string to boolean
		System.out.println(boleanValue + "&&&&&&&&&&&");

		if (boleanValue == true) {
			MyAssert.assertEquals(boleanValue, true);
			System.out.println(Actualvalueofbutton);
		}

	}

	@Test()
	public void FlightDepartureDate() {
		String DepartureDate = driver.findElement(By.xpath(
				"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[3]/div/div/div/div[1]/span[2]"))
				.getText();
		int ActualDateToInteger = Integer.parseInt(DepartureDate);
		System.out.println(DepartureDate + "     JJJJJJJJJJJ");

		Date TodayDte = new Date();
		System.out.println(TodayDte);
		System.out.println(TodayDte.getDate() + " NNNNNNNNNNNN");
		int ExtraDays = 1;
		int ExpectedFlightdate = TodayDte.getDate() + ExtraDays;
		MyAssert.assertEquals(ActualDateToInteger, ExpectedFlightdate);

		// int Expectedtodaytostring=TodayDte.getDate()+2; to check the assertion if its
		// correct

		///// ANOTHER IDEAS OF DATE
		LocalDate ExpectedDateinLOCALDATEFUNCTION = LocalDate.now().plusDays(3);
		System.out.println("The local date is    " + ExpectedDateinLOCALDATEFUNCTION);
		// This is suitable if we want the date as numbers only,but ,its not suitable because
		// its come the month as number
		// While in the website .the monthe typed as "May" not as number "5"

		
		///// ANOTHER IDEAS OF DATE
		Calendar todaydateEman = Calendar.getInstance(); // this is ALSO correct
		System.out.println("The date in getInstance is    " + todaydateEman.getTime());

	}

	@Test()
	public void FlightReturnDate() {
		String ActualReturnDate = driver.findElement(By.xpath(
				"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[3]/div/div/div/div[2]/span[2]"))
				.getText();
		int ActualReturnDateToInteger = Integer.parseInt(ActualReturnDate);
		System.out.println(ActualReturnDate);
		Date Todaydate22 = new Date();
		int ExpectedTodayDAte22 = Todaydate22.getDate();

		int Extradaysforreturn = 2;
		MyAssert.assertEquals(ActualReturnDateToInteger, ExpectedTodayDAte22 + Extradaysforreturn);

	}

	@Test(invocationCount = 1)
	public void checktherandomlanguagekk() {
		String[] MyUrls = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
		Random rand = new Random();
		int randlang = rand.nextInt(0, 2);
		String ExpectedArbicButton = "العربية";
		String ExpectedEnglishButton = "English";

		driver.get(MyUrls[randlang]);
		String ArabicTypedButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]"))
				.getText();
		String EnglishTypedButton = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]")).getText();

		if (driver.getCurrentUrl().contains("en")) {
			MyAssert.assertEquals(EnglishTypedButton, ExpectedArbicButton);
		} else {
			MyAssert.assertEquals(ArabicTypedButton, ExpectedEnglishButton);
		}

	}

	@Test(priority = 1, invocationCount = 4)
	public void AdddirectionCities() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String[] websitelanguage = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
		Random rand = new Random();
		int randLang = rand.nextInt(0, 2);

		String[] ArabicCities = { "جدة", "دبي" };
		int RandArabiccities = rand.nextInt(0, 2);

		String[] EnglishCities = { "Dubai", "Jeddah", "Riyadh" };
		int RandEnglishcities = rand.nextInt(0, 3);

		driver.get(websitelanguage[randLang]);

		if (driver.getCurrentUrl().contains("en")) {
			WebElement HotelTab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
			HotelTab.click();

			WebElement SearchEnglishField = driver.findElement(By.xpath(
					"//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input"));
			SearchEnglishField.sendKeys(EnglishCities[RandEnglishcities] + Keys.ARROW_DOWN);
			WebElement SearchEnglishButton = driver.findElement(
					By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[4]/button"));
			SearchEnglishButton.click();
			Thread.sleep(1500);
		} else {
			WebElement HotelTab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
			HotelTab.click();

			WebElement SearchArabicField = driver.findElement(By.xpath(
					"//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input"));
			SearchArabicField.sendKeys(ArabicCities[RandArabiccities] + Keys.ARROW_DOWN);

			WebElement SearchArabicButton = driver.findElement(
					By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[4]/button"));
			SearchArabicButton.click();
			Thread.sleep(1500);
		}
	}

//	@Test(invocationCount = 3, priority = 1)
//	public void CheckOriginAndDestination() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

//		String[] websitelanguage = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
//		Random rand = new Random();
//		int randLang = rand.nextInt(0, 2);
//
//		String[] ArabicOriginCities = { "جدة", "دبي" };
//		String[] ArabicDestinationCities = { "الرياض", "عمان", "الدمام" };
//
//		int RandOriginArabiccities = rand.nextInt(0, 2);
//		int RandDestinationArabiccities = rand.nextInt(0, 3);
//
//		String[] EnglishOriginCities = { "Dubai", "Jeddah", "Riyadh" };
//		String[] EnglishDestinationCities = { "Amman", "Cairo", "Manila" };
//		int RandEnglishOrigincities = rand.nextInt(0, 3);
//
//		int RandEnglishDestinationcities = rand.nextInt(0, 3);
//
//		driver.get(websitelanguage[randLang]);
//
//		if (driver.getCurrentUrl().contains("en")) {
//
//			WebElement SearchOriginEnglishField = driver.findElement(By.xpath(
//					"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input"));
//			SearchOriginEnglishField.sendKeys(EnglishOriginCities[RandEnglishOrigincities]);
//			Thread.sleep(1500);
//
//			WebElement SearchDestinationEnglishField = driver.findElement(By.xpath(
//					"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[3]/div[1]/div/div/input"));
//			SearchDestinationEnglishField.sendKeys(EnglishDestinationCities[RandEnglishDestinationcities]);
//
//			WebElement SearchEnglishButton = driver.findElement(By.xpath(
//					"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[2]/div/div[2]/div/button"));
//			SearchEnglishButton.click();
//			Thread.sleep(1500);
//
//		} else {
//			WebElement SearchOriginArabicField = driver.findElement(By.xpath(
//					"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div/input"));
//			SearchOriginArabicField.sendKeys(ArabicOriginCities[RandOriginArabiccities]);
//			SearchOriginArabicField.click();
//			Thread.sleep(1500);
//
//			WebElement SearchDestinationEnglishField = driver.findElement(By.xpath(
//					"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[2]/div[3]/div[1]/div/div/input"));
//			SearchDestinationEnglishField.sendKeys(ArabicDestinationCities[RandDestinationArabiccities]);
//
//			WebElement SearchArabicButton = driver.findElement(By.xpath(
//					"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[2]/div/div[2]/div/button"));
//			SearchArabicButton.click();
//			Thread.sleep(1500);
//
//		}
//
//	}

	@Test(priority = 2, invocationCount = 4)
	public void RoomSelection() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// String []roomSelection = {"1 room, 2 adults, 0 children","1 room, 1 adult, 0
		// children"};
		WebElement NumberOfVisitors = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/section[2]/div/section/div/div/div/div/div[3]/div/select"));
		Select MySelector1 = new Select(NumberOfVisitors);
		Random rand = new Random();
		int MyIndex = rand.nextInt(0, 3);
		MySelector1.selectByIndex(MyIndex);

	}

}
