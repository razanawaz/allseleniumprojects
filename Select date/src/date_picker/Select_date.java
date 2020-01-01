package date_picker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

 
public class Select_date {
	static WebDriver driver;
    private String today;
 
    //Setup Driver
    public static void setupTest() {
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://dev.almumayaz.com/login");
        driver.manage().window().maximize();
    }
    public static void login() {
    	WebElement username= driver.findElement(By.id("username"));
        WebElement password= driver.findElement(By.id("password"));
        WebElement login= driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/input"));
        username.sendKeys("admin");
        password.sendKeys("123456");
        login.click();
        
    }
    public static void addProduct() {
    	driver.get("http://dev.almumayaz.com/inventory/manageProducts");
    	WebElement Addproduct =driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[1]/div/div/a[1]"));
    	Addproduct.click();
    	Select branch= new Select(driver.findElement(By.id("branch")));
    	branch.selectByIndex(2);
    	WebElement productname= driver.findElement(By.id("name"));
    	productname.sendKeys("Automation product");
    	WebElement quantity= driver.findElement(By.id("quantity"));
    	quantity.sendKeys("50");
    	WebElement price= driver.findElement(By.id("price"));
    	price.sendKeys("250");
    	WebElement m_quantity= driver.findElement(By.id("min_quantity"));
    	m_quantity.sendKeys("5");
    }
   
    public void datePickerTest() {
        //Declare a implicit wait for synchronization
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
 
        //Get Today's number
        today = getCurrentDay();
        System.out.println("Today's number: " + today + "\n");
 
        //Click and open the datepickers
        driver.findElement(By.id("date_added")).click();
 
        //This is from date picker table
        WebElement dateWidgetFrom = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table"));
 
        //This are the rows of the from date picker table
        //List<WebElement> rows = dateWidgetFrom.findElements(By.tagName("tr"));
 
        //This are the columns of the from date picker table
        List<WebElement> columns = dateWidgetFrom.findElements(By.tagName("td"));
 
        //DatePicker is a table. Thus we can navigate to each cell
        //and if a cell matches with the current date then we will click it.
        for (WebElement cell: columns) {
            /*
            //If you want to click 18th Date
            if (cell.getText().equals("18")) {
            */
            //Select Today's Date
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
    
    public static void uploadFile() {
    	WebElement upload = driver.findElement(By.xpath("//*[@id=\"fileuploader_td\"]/div/input[2]"));
    	upload.sendKeys("C:\\Users\\Jansher\\Pictures\\Selling process\\download2.jpg");
    }
 
    
    public static void submit() {
    	WebElement submit =driver.findElement(By.xpath("//*[@id=\"addForm\"]/div[3]/div/div/input[1]"));
    	submit.click();
    }
    //Close Driver
    
    public static void quitDriver() {
        driver.quit();
    }
 
    //Get The Current Day
    private String getCurrentDay (){
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
