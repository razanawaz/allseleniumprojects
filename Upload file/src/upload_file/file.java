package upload_file;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class file {
	static WebDriver driver;
    static String today;
	public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
      //WebDriverWait myWaitVar= new WebDriverWait(driver,5);
    	driver.manage().window().maximize(); 
    	String baseUrl = "http://dev.almumayaz.com/login";
    	driver.get(baseUrl);
  //login
    	WebElement username=driver.findElement(By.id("username"));
    	WebElement password=driver.findElement(By.id("password"));
    	WebElement login= driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/input"));
    	username.sendKeys("admin");
    	password.sendKeys("123456");
    	login.click();
    	
    	driver.get("http://dev.almumayaz.com/inventory/manageProducts");
    	WebElement Addproduct =driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div/div/a[1]"));
    	Addproduct.click();
    	Select branch= new Select(driver.findElement(By.id("branch")));
    	branch.selectByIndex(2);
    	WebElement productname= driver.findElement(By.id("name"));
    	productname.sendKeys("New vehicle product");
    	WebElement quantity= driver.findElement(By.id("quantity"));
    	quantity.sendKeys("50");
    	WebElement price= driver.findElement(By.id("price"));
    	price.sendKeys("250");
    	WebElement m_quantity= driver.findElement(By.id("min_quantity"));
    	m_quantity.sendKeys("5");
    	WebElement date =driver.findElement(By.xpath("//*[@id=\"date_added\"]"));
    	date.click();
    	WebElement dateWidgetFrom= driver.findElement(By.linkText(today));
    	dateWidgetFrom.click();
//    	file i_date= new file();
//    	i_date.dateTo();
    	Thread.sleep(2000);
    	WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileuploader_td\"]/div/input[2]"));
    	upload.sendKeys("C:\\Users\\Jansher\\Pictures\\Selling process\\download2.jpg");
    	WebElement submit =driver.findElement(By.xpath("//*[@id=\"addForm\"]/div[3]/div/div/input[1]"));
//    	submit.click();
    	

}
	public void dateTo() throws InterruptedException  {
        //Declare a implicit wait for synchronisation
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Thread.sleep(2000);
        //Get Today's number
//        today = getCurrentDay();
//        System.out.println("Today's number: " + today + "\n");
 
        //Click and open the date pickers
		Thread.sleep(2000);
        WebElement date= driver.findElement(By.id("date_added"));
        date.click();
        Thread.sleep(2000);
        WebElement dateWidgetFrom = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table"));
        List<WebElement> columns = dateWidgetFrom.findElements(By.tagName("td"));
        System.out.println("colomns : " + columns + "\n");
        for (WebElement cell: columns) {
            if (cell.getText().equals(today)) {
                cell.click();
                break;
            }
        }
 
        //Wait for 4 Seconds to see Today's date selected.
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	private String getCurrentDay(){
        //Create a Calendar Object
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
 
        //Get Current Day as a number
        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Today Int: " + todayInt +"\n");
 
        //Integer to String Conversion
        String todayStr = Integer.toString(todayInt);
        System.out.println("Today Str: " + todayStr + "\n");
 
        return todayStr;
    }
    
}