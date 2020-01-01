package firsttestngpackage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	 public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    String driverPath = "C:\\chromedriver.exe";
	    public WebDriver driver ; 
  @Test
  public void verifyHomepageTitle() {
	  System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.firefox.marionette", driverPath);
      driver = new ChromeDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
}
