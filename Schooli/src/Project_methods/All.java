package Project_methods;
import java.util.concurrent.TimeUnit;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class All {
	static WebDriver driver;
	

	public static void setupTest() {
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://dev.schooli.app/login");
        driver.manage().window().maximize();

}
	
	public static void login() {
    	WebElement username= driver.findElement(By.id("username"));
        WebElement password= driver.findElement(By.id("password"));
        WebElement login= driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/main/div/form/button/span[1]"));
        username.sendKeys("schooli_dev");
        password.sendKeys("asdf1234");
        login.click();
}
	
	public static void select_class() throws InterruptedException {
		Thread.sleep(1000);
		driver.navigate().to("https://dev.schooli.app/academics/classes");
		Thread.sleep(2000);
		WebElement classes= driver.findElement(By.xpath("//*[@id=\"MUIDataTableBodyRow-1\"]/td[10]/button[1]/span[1]"));
		classes.click();
	}
	
	public static void select_section() throws InterruptedException {
		Thread.sleep(1000);
		WebElement section= driver.findElement(By.xpath("//*[@id=\"MUIDataTableBodyRow-1\"]/td[10]/button[1]"));
		Thread.sleep(1000);
		section.click();
		
	}
	
	public static void exams_tab() throws InterruptedException {
		Thread.sleep(1000);
		WebElement exams= driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/header/div/div/div/div/button[6]/span[1]"));
		exams.click();
	}
	
	public static void view_Exam_and_subject() throws InterruptedException {
		Thread.sleep(1000);
		WebElement view_exam = driver.findElement(By.xpath("//*[@id=\"MUIDataTableBodyRow-1\"]/td[6]/button[1]"));
		view_exam.click();
		Thread.sleep(1000);
		WebElement edit_subject= driver.findElement(By.xpath("//*[@id=\"MUIDataTableBodyRow-0\"]/td[10]/button[2]"));
		edit_subject.click();
		
	}
	
	public static void enter_marks() throws InterruptedException {
		Thread.sleep(2000);
		WebElement score= driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/main/div/div[1]/div/table/tbody/tr[1]/td[2]/div/div/input"));
		Thread.sleep(2000);
		score.sendKeys("28");
		score.sendKeys(Keys.TAB);
		WebElement currentElement = driver.switchTo().activeElement();
		currentElement.sendKeys(Keys.TAB);
		for (int i=0; i<29;i++) {
			WebElement newElement = driver.switchTo().activeElement();
			newElement.sendKeys(getValue());
			newElement.sendKeys(Keys.TAB);
			WebElement nextElement = driver.switchTo().activeElement();
			nextElement.sendKeys(Keys.TAB);
			
			
		}
	}
	public static String getValue(){
		Random r= new Random();
		int Randomscore=0;
		Randomscore= r.nextInt(30);
		return Integer.toString(Randomscore);
		}
	
	
}