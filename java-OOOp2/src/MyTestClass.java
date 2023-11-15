import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTestClass {

	public static void main(String[] args) throws InterruptedException {
		// WebDriver driver=new WebDriver();

		// WebDriver driver=new ChromeDriver();
		// Webdriver driver=new ChromeDriver();
		// WebDriver driver2=new EdgeDriver();
		// driver2.get("https://www.youtube.com/watch?v=uDeRerXf-v0&list=PLUDwpEzHYYLv9v8aRuNi67vZ81cW2ksze&index=3
		// ");

		WebDriver driver = new ChromeDriver();
		// WebDriverManager.chromedriver().setup();

		// New Manner
		Parameterss Myobject = new Parameterss(); // System.out.println(Myobject.MyPassowrd);

		driver.get(Myobject.Myurl);

		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(Myobject.Username);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Myobject.Passowrd);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		// Old manner
		/*
		 * driver.get("https://www.saucedemo.com/");
		 * driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(
		 * "standard_user");
		 * driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce"
		 * ); driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		 */

	}

}
