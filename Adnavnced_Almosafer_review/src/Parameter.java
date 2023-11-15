import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Parameter {
	static WebDriver driver = new ChromeDriver();
	SoftAssert SoftAssert = new SoftAssert(); // this for soft assertion
	Assertion HardAssert = new Assertion();// this for Hard assertion

	String TheWebsite = "https://www.almosafer.com/en";
	static String ExpectedLAngButton = ("العربية");
	
	static String ExpectedCurrency="SAR";

	static String ExpectedNumber="+966554400000";
	static Boolean ActualValueOfQitaf ;

}
