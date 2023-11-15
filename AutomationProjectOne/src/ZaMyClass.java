import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZaMyClass {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * WebDriverManager.edgedriver().setup(); driver = new EdgeDriver();
		 * Thread.sleep(3000);
		 */

		WebDriver driver;
		WebDriverManager.chromedriver().setup();// تعريف الكروم
		driver = new ChromeDriver();// تعريف الكروم
		driver.manage().window().maximize();// لتكبير الشاشه

		driver.get("file:///C:/Users/hp/OneDrive/Desktop/Automation%20Ramadan_1/index.html"); //فتح الصفحه
		
		// لاضافة البيانات في الفراغات
		driver.findElement(By.xpath("/html/body/center[2]/form/input[1]")).sendKeys("zaid abu bader");

		driver.findElement(By.xpath("/html/body/center[2]/form/input[2]")).sendKeys("zaid440@gmail.com");
		driver.findElement(By.xpath("/html/body/center[2]/form/input[3]")).sendKeys("0795032341");
		driver.findElement(By.xpath("/html/body/center[2]/form/input[4]")).sendKeys("26/01/1980");
		Thread.sleep(3000);// عمل فاصل زمني بين الاكشنز

		driver.findElement(By.xpath("/html/body/center[2]/form/button[1]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/center[2]/form/input[2]")).sendKeys("zaid440@gmail.com");

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/center[2]/form/button[2]")).click();

	}

}
