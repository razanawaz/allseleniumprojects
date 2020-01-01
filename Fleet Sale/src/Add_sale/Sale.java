package Add_sale;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sale {
	
	static WebDriver driver;
	public static void setupTest() {
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://dev.almumayaz.com/login");
        driver.manage().window().maximize();
    }
	
	public static void login() {
		WebElement username=driver.findElement(By.id("username"));
    	WebElement password=driver.findElement(By.id("password"));
    	WebElement login= driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/input"));
    	username.sendKeys("admin");
    	password.sendKeys("123456");
    	login.click();	
	}
	
	public static void leftmenu() throws InterruptedException {
		WebElement leftmenu= driver.findElement(By.xpath("//*[@id=\"toggle-menu\"]/i"));
    	WebElement sales= driver.findElement(By.xpath("//*[@id=\"div_multilevelpushmenu\"]/div/ul/li[5]/a/i"));
    	leftmenu.click();
    	Thread.sleep(2000);
    	sales.click();
	}
	
	public static void SwitchToComSales() {
		WebElement compsale= driver.findElement(By.linkText("Comprehensive Tests"));
    	compsale.click();
	}
	
	public static void Start_New_Test() {
		WebElement Addsale= driver.findElement(By.linkText("Start New Test"));
    	Addsale.click();
	}

	public static void Add_vehicle_information() throws InterruptedException {
		Select Platecategory= new Select(driver.findElement(By.id("vehicle_plate_category")));
    	Platecategory.selectByIndex(4);
    	Select Emiratescode= new Select(driver.findElement(By.id("emirates_code")));
    	Emiratescode.selectByIndex(4);
    	Select Platecode= new Select(driver.findElement(By.id("plate_code")));
    	Platecode.selectByIndex(3);
    	WebElement PlateNo= driver.findElement(By.id("plate_no"));
    	PlateNo.sendKeys("8516");
    	Select Vehicletype= new Select(driver.findElement(By.id("vehicle_category")));
    	Vehicletype.selectByIndex(1);
    	WebElement Chassissno= driver.findElement(By.id("chassis_no"));
    	Chassissno.sendKeys("324236353459981QST");
    	WebElement Enginenumber= driver.findElement(By.id("engine_number"));
    	Enginenumber.sendKeys("5574563");
    	Select Bodytype= new Select(driver.findElement(By.id("vehicle_type")));
    	Bodytype.selectByIndex(5);
    //	myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("vehicle_make")));
    	Select Vehiclemake= new Select(driver.findElement(By.id("vehicle_make")));
    	Vehiclemake.selectByIndex(3);
    //	myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vehicle_model\"]")));
   	    Select Vehiclemodel= new Select(driver.findElement(By.xpath("//*[@id=\"vehicle_model\"]")));
    	Thread.sleep(2000);
   	    Vehiclemodel.selectByIndex(7);
     	Select Color= new Select(driver.findElement(By.id("color")));
    	Color.selectByIndex(3);
    	Select Year= new Select(driver.findElement(By.id("manufacturer")));
    	Year.selectByIndex(29);
    	Select Fueltype= new Select(driver.findElement(By.id("fuel_type")));	
    	Fueltype.selectByIndex(2);
    	Select Seating= new Select(driver.findElement(By.id("capacity")));	
    	Seating.selectByIndex(5);
    	Select Doors= new Select(driver.findElement(By.id("doors")));	
    	Doors.selectByIndex(4);
    	Select Cylinders= new Select(driver.findElement(By.id("cylinder")));	
    	Cylinders.selectByIndex(4);
    	WebElement Mileage= driver.findElement(By.id("mileage"));
    	Mileage.sendKeys("1000");
    	WebElement Weight= driver.findElement(By.id("weight"));
    	Weight.sendKeys("90");
    	Select Laneno= new Select(driver.findElement(By.id("laneNo")));
    	Laneno.selectByIndex(2);
	}
	
	public static void StartandCompleteTest() throws InterruptedException {
		//Press Start test button
    	WebElement Starttest= driver.findElement(By.xpath("//*[@id=\"addForm\"]/div[2]/div/div/input"));
    	Starttest.click();
    // Complete test
    	Thread.sleep(2000);
    	WebElement Completetest= driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/form/div[2]/div/div/a/input"));
    	Completetest.click();
    	driver.switchTo().alert().accept();
	}
	
	public static void Edit_Sale() throws InterruptedException {
		Thread.sleep(4000);
    	WebElement Editsale= driver.findElement(By.xpath("//*[@id=\"mainform\"]/div[1]/table/tbody/tr[2]/td[11]/a[2]"));
    	Thread.sleep(4000);
    	Editsale.click();
	}
	
	public static void Add_Customer_Information() {
		WebElement CustomernameArabic= driver.findElement(By.id("member_memberNameArabic"));
	   	WebElement CustomernameEnglish= driver.findElement(By.id("member_memberNameEng"));
	   	WebElement email= driver.findElement(By.id("member_email"));
	   	CustomernameArabic.sendKeys("Raza Nawaz");
	   	CustomernameEnglish.sendKeys("Raza Nawaz");
	   	email.sendKeys("razanawaz8@gmail.com");
	 	Select Mobilecode= new Select(driver.findElement(By.id("member_mobile_code")));
	    Mobilecode.selectByIndex(1);
	    WebElement MobileNumber= driver.findElement(By.id("member_mobile"));
	    MobileNumber.sendKeys("4234321");
	   	WebElement EmiratesID= driver.findElement(By.id("member_company_emirates_id_number"));
		EmiratesID.sendKeys("98248084237133");
	   	WebElement Queue= driver.findElement(By.id("que_number"));
	   	Queue.sendKeys("23345");
	   // send email check mark
	   	WebElement Sendemail= driver.findElement(By.className("checkmark"));
	   	Sendemail.click();
	   // payment method
	   	WebElement Credit= driver.findElement(By.xpath("//*[@id=\"addForm\"]/div[8]/div/div/div[3]/ins"));
	   	Credit.click();
	   	Select Creditor= new Select(driver.findElement(By.id("creditor_id")));	
	   	Creditor.selectByIndex(2);
	   // update sale
	   	WebElement Updatesale= driver.findElement(By.xpath("//*[@id=\"addForm\"]/div[11]/div/div[2]/input[11]"));
	   	Updatesale.click();
	}
	public static void SwitchToFleetTesting() throws InterruptedException {
		Thread.sleep(4000);
		WebElement fleettest= driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/div/a[4]"));
		fleettest.click();
		Select SelectCreditor= new Select(driver.findElement(By.id("creditor_id")));
		SelectCreditor.selectByIndex(5);
		WebElement searchsale= driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[3]/div[1]/div/div[9]/div/input"));
		searchsale.click();
	}
	
	
	public static void Settle_Sale() throws InterruptedException {
		Thread.sleep(2000);
		WebElement SelectAll = driver.findElement(By.xpath("//*[@id=\"mainform\"]/div[1]/table/tbody/tr[1]/th[1]/label/span"));
		SelectAll.click();
		Select Action= new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[3]/div[3]/div/div/div[1]/select")));
		Action.selectByIndex(1);
		driver.switchTo().alert().accept();
		WebElement discount= driver.findElement(By.id("discount"));
		discount.sendKeys("30");
//		WebElement generate_invoice= driver.findElement(By.xpath("//*[@id=\"settleForm\"]/div/div[7]/div/div[2]/div/input"));
//		generate_invoice.click();
	}
	
	
	
}
