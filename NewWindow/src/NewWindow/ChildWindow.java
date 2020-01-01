package NewWindow;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class ChildWindow {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		String MainWindow = driver.getWindowHandle();
		Set<String> s1= driver.getWindowHandles();
		Iterator<String> i1= s1.iterator();
		
		while (i1.hasNext()){
			String ChildWindow= i1.next();
			
			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
				driver.findElement(By.name("btnLogin")).submit();
				driver.close();
				
			}
		}
		driver.switchTo().window(MainWindow);
	}

}
