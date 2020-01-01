package Select_date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class date_picker {
	public static void main(String[] args) throws InterruptedException {
		setupTest();
		login();
		date_picker df= new date_picker();
		date_picker dt= new date_picker();
		date_picker cd = new date_picker();
		df.dateFrom();
		dt.dateTo();
	//	quitDriver();
		cd.getCurrentDay();
		Search();
	}
	static WebDriver driver;
    private String today;
    
    //Setup Driver
   
    public static void setupTest() {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://hrms.test/");
        driver.manage().window().maximize();
    }
    public static void login() {
    	WebElement username= driver.findElement(By.xpath("//*[@id=\"el1\"]"));
        WebElement password= driver.findElement(By.xpath("//*[@id=\"el4\"]"));
        WebElement login= driver.findElement(By.id("submit_button"));
        username.sendKeys("admin");
        password.sendKeys("admin.password");
        login.click();
        driver.get("http://hrms.test/reports/attendance-summary");
    }
  
    
    public void dateFrom() throws InterruptedException {
        //Declare a implicit wait for synchronisation
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 
        //Get Today's number
        today = getCurrentDay();
        System.out.println("Today's number: " + today + "\n");
 
        //Click and open the datepickers
        driver.findElement(By.xpath("//*[@id=\"date-from\"]")).click();
//        Thread.sleep(4000);
//        //This is from date picker table
//        WebElement dateWidgetFrom = driver.findElement(By.xpath("/html/body/script[12]"));
// 
//        //This are the rows of the from date picker table
//        //List<WebElement> rows = dateWidgetFrom.findElements(By.tagName("tr"));
// 
//        //This are the columns of the from date picker table
//        List<WebElement> columns = dateWidgetFrom.findElements(By.tagName("td"));
// 
//        //DatePicker is a table. Thus we can navigate to each cell
//        //and if a cell matches with the current date then we will click it.
//        for (WebElement cell: columns) {
//            /*
//            //If you want to click 18th Date
//            if (cell.getText().equals("18")) {
//            */
//            //Select Today's Date
//            if (cell.getText().equals(today)) {
//                cell.click();
//                break;
//            }
//        }
 
        //Wait for 4 Seconds to see Today's date selected.
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void dateTo() throws InterruptedException {
        //Declare a implicit wait for synchronisation
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 
        //Get Today's number
        today = getCurrentDay();
        System.out.println("Today's number: " + today + "\n");
 
        //Click and open the datepickers
        driver.findElement(By.id("date-to")).click();
//        Thread.sleep(4000);
//        WebElement dateWidgetFrom = driver.findElement(By.className("bootstrap-datetimepicker-widget dropdown-menu use twentyfour top"));
//        List<WebElement> columns = dateWidgetFrom.findElements(By.tagName("td"));
// 
//        for (WebElement cell: columns) {
//            if (cell.getText().equals(today)) {
//                cell.click();
//                break;
//            }
//        }
// 
//        //Wait for 4 Seconds to see Today's date selected.
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
 }
 
    //Close Driver
    public static void Search() {
       driver.findElement(By.id("submit-btn")).click();
    }
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

