package checkbox;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;


public class click {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					

        driver.get("http://demo.guru99.com/test/facebook.html");
        WebElement chkFBPersist= driver.findElement(By.id("persist_box"));
        for (int i=0; i<2; i++) {											
            chkFBPersist.click(); 			
            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
        }		
		//driver.close();		
        		
	}
}
