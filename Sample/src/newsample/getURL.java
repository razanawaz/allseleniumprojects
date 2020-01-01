package newsample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;


public class getURL {
	public static void main(String[] args) throws InterruptedException, IOException {

	
    WebDriver driver = new ChromeDriver();
    System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    driver.get("http://jis-stage:vst%40dxb2018$@staging.juelmin.com/login");
    driver.manage().window().maximize();
    WebElement username=  driver.findElement(By.id("username"));
	username.sendKeys("admin");
	WebElement password= driver.findElement(By.id("password"));
	password.sendKeys("Staging456#@2019");
	WebElement login= driver.findElement(By.xpath("//*[@id=\"id-form\"]/tbody/tr[5]/td[1]/input[1]"));
	login.click();
	}   
}

	
