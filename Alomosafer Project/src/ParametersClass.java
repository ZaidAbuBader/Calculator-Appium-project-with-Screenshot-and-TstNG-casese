import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.Assertion;

public class ParametersClass {

	static WebDriver driver = new ChromeDriver();
	Assertion MyAssert = new Assertion();

	String TheWebsite = "https://www.almosafer.com/en";
	String ExpectedLanguageArabic = "العربية";
	String ExpectedLanguageEnglish="English";
	String ExpectedNumber = "+966554400000";
	boolean ActualvalueOfQitafIfIsThere;
	Random rand=new Random();


	String ExpectedCurrency = "SAR";

}
