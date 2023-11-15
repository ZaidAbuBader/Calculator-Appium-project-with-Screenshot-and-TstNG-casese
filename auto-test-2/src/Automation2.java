import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		WebDriverManager.edgedriver();
		driver = new EdgeDriver();

		// WebDriver driver;
		// WebDriverManager.firefoxdriver().setup();
		// driver=new FirefoxDriver();

		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/center[2]/form/input[2]")).sendKeys("Zaid" + Keys.TAB);

		driver.findElement(By.xpath("/html/body/center[2]/form/input[3]")).sendKeys("zaid44@gmail.com" + Keys.TAB);

		driver.findElement(By.xpath("/html/body/center[2]/form/input[4]")).sendKeys("0795032341" + Keys.TAB);

		driver.findElement(By.xpath("/html/body/center[2]/form/input[5]")).sendKeys("19990");

		Thread.sleep(3000);
		// driver.findElement(By.xpath("/html/body/center[2]/form/button[1]")).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("/html/body/center[2]/form/button[1]")).click();
	}

}
