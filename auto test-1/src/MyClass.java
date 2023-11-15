import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyClass {

	public static void main(String[] args) {

		WebDriver driver;
		driver= new EdgeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("zaidabubader"+Keys.ENTER);
	//	driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).sendKeys();
		
		
		
		
		
		
	}

}
