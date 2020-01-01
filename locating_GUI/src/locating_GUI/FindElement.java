package locating_GUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	
	    public static void main(String[] args) {
	    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	    	WebDriver driver = new ChromeDriver();
	        String baseUrl = "http://dev.almumayaz.com/sales_dashboard";
	        String tagName = "";
	        
	        driver.get(baseUrl);
	      //  tagName = driver.findElement(By.id("email")).getTagName();
	      //  System.out.println(tagName);
	        driver.close();
	        System.exit(0);
	}
	}

