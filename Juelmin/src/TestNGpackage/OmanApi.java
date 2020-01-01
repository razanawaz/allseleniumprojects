package TestNGpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class OmanApi {
	static WebDriver driver;
	@Test (priority=0)
  public void setupTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("http://dev.almumayaz.com/");
      WebDriverWait wait = new WebDriverWait(driver, 10); 
//      wait.until(ExpectedConditions.alertIsPresent());
//      driver.switchTo().alert().sendKeys("jis-stage" + Keys.TAB + "JIStaging@2019#!");
//      driver.switchTo().alert().accept();
//      driver.manage().window().maximize();
  }
 

 
// @Test (priority=1)
// public void login() {
// 	WebElement username= driver.findElement(By.id("username"));
//   WebElement password= driver.findElement(By.id("password"));
//   WebElement login= driver.findElement(By.xpath("//*[@id=\"id-form\"]/tbody/tr[5]/td[1]/input[1]"));
//   username.sendKeys("admin");
//   password.sendKeys("Staging456#@2019");
//   login.click();
//}
//
// 
  
}
