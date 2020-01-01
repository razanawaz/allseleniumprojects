package JS;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import okio.Timeout;

public class JS_Class {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize(); 
    	driver.get("https://formy-project.herokuapp.com/datepicker");
    	Thread.sleep(1000);
    	WebElement date= driver.findElement(By.id("datepicker"));
    	date.sendKeys("01/02/2020");
    	date.sendKeys(Keys.RETURN);
    	
    
    	
	}
	
}
