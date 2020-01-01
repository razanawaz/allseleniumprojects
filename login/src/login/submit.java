package login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;


public class submit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		String URL= "http://demo.guru99.com/test/login.html";
		driver.get(URL);
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("passwd"));
		
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");
		
		System.out.println("Data enetered");
		
		email.clear();
		password.clear();
		
		System.out.println("Data cleared");
		
		WebElement login= driver.findElement(By.id("SubmitLogin"));
		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");
		login.click();
		System.out.println("Logged in Successfully");
		
		driver.close();
		
	}
}
