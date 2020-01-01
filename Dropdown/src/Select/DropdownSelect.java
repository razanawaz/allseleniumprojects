package Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class DropdownSelect {
	public static void main(String[] args) { 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		String baseUrl= "http://demo.guru99.com/test/newtours/register.php";
		WebDriver driver= new ChromeDriver();
		driver.get(baseUrl);
		
		Select country= new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("PAKISTAN");
		
}
}
