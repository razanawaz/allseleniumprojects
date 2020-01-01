package All_methods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

@Test
public class NewTest {
	static WebDriver driver;
	
	@Test (priority=0)
	  public void setupTest() {
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://jis-stage:vst%40dxb2018$@staging.juelmin.com/login");
		  driver.manage().window().maximize();
  }
	  @Test (priority=1)
	  public void login() throws InterruptedException {
		  Thread.sleep(2000);
		  WebElement username=  driver.findElement(By.id("username"));
		  username.sendKeys("admin");
		  WebElement password= driver.findElement(By.id("password"));
		  password.sendKeys("Staging456#@2019");
		  WebElement login= driver.findElement(By.xpath("//*[@id=\"id-form\"]/tbody/tr[5]/td[1]/input[1]"));
		  login.click();  
	  
  }
	  @Test (priority=2)
	  public void Addquicksale() throws InterruptedException {
		  Actions action = new Actions(driver);
		  WebElement QuickSale = driver.findElement(By.xpath("//*[@id=\"menu-home\"]/li[3]/a"));
		  Thread.sleep(2000);
		  action.moveToElement(QuickSale).moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-home\"]/li[3]/ul/li[1]/a"))).click().build().perform();
	  }
	  
	  @Test (priority=3)
	  public void SelectinsuranceCompany() throws InterruptedException {
		  Select IC= new Select(driver.findElement(By.id("addRate_ins_company_id")));
		  Thread.sleep(2000);
		  IC.selectByValue("61");
	  }
	  
	  @Test (priority=4)
	  public void CustomerInfo() throws InterruptedException {
		  Thread.sleep(1000);
		  Select Title= new Select(driver.findElement(By.id("oic_title")));
		  Title.selectByValue("1");
		  WebElement name=  driver.findElement(By.id("member_memberNameEng"));
		  name.sendKeys("Raza Nawaz");
		  WebElement arabicname=  driver.findElement(By.id("member_memberNameArabic"));
		  arabicname.sendKeys("Raza Nawaz");
		  WebElement emiratesid=  driver.findElement(By.id("emirates_id"));
		  emiratesid.sendKeys("901234567891234");
		  WebElement email=  driver.findElement(By.id("member_email"));
		  email.sendKeys("raza.nawaz@visualsparks.com");
		  Select code= new Select(driver.findElement(By.id("member_mobile_code")));
		  code.selectByIndex(2);
		  WebElement mobile=  driver.findElement(By.id("member_mobile"));
		  mobile.sendKeys("9876543");
		  WebElement address=  driver.findElement(By.id("member_address1_eng"));
		  address.sendKeys("New Block, Dubai");
		  WebElement Dob=  driver.findElement(By.id("member_licenceIssueYear_date"));
		  Dob.sendKeys("26/08/1971");
		  Select nationality= new Select(driver.findElement(By.id("member_nationality")));
		  nationality.selectByValue("47007928-14a8-e611-80cd-005056bd47e8");
		  Select city= new Select(driver.findElement(By.id("member_city")));
		  city.selectByValue("80256058-f8a8-e611-80cd-005056bd47e8");
		  WebElement TCF=  driver.findElement(By.id("member_tcf"));
		  TCF.sendKeys("12345678");
		  WebElement Pobox=  driver.findElement(By.id("po_box_no"));
		  Pobox.sendKeys("54000");
		  Select language= new Select(driver.findElement(By.id("speaking_language")));
		  language.selectByIndex(1);
		  WebElement license=  driver.findElement(By.id("member_licenceNo"));
		  license.sendKeys("123456754322");
		  WebElement l_isssuedate=  driver.findElement(By.id("driver_licence_expiry_date"));
		  l_isssuedate.sendKeys("26/08/2017");
		  WebElement l_expirydate=  driver.findElement(By.id("driver_licence_expiry_date_new"));
		  l_expirydate.sendKeys("26/08/2022");
		  Select oic_driving_experience= new Select(driver.findElement(By.id("oic_driving_experience")));
		  oic_driving_experience.selectByIndex(1);
		  Select policy_type= new Select(driver.findElement(By.id("policy_type")));
		  policy_type.selectByIndex(1);
	  }
	  
	  @Test (priority=5)
	  public void Vehicleinfo() throws InterruptedException {
		  Thread.sleep(1000);
		  WebElement chassis_no=  driver.findElement(By.id("vehicle_chassis_no"));
		  chassis_no.sendKeys("123456789543AUTO");
		  WebElement Engine_no=  driver.findElement(By.id("vehicle_engine_no"));
		  Engine_no.sendKeys("24242423449");
		  Select v_city= new Select(driver.findElement(By.id("vehicle_city")));
		  v_city.selectByValue("80256058-f8a8-e611-80cd-005056bd47e8");
		  Select v_plate_type= new Select(driver.findElement(By.id("useofVehicle")));
		  v_plate_type.selectByValue("8");
		  Select v_plate_code= new Select(driver.findElement(By.id("vehicle_plate_code")));
		  v_plate_code.selectByValue("11th category-1152");
		  WebElement plate_no=  driver.findElement(By.id("vehicle_plate_number"));
		  plate_no.sendKeys("4534");
		  plate_no.sendKeys(Keys.TAB);
		  WebElement model_year = driver.switchTo().activeElement();
		  //model year
		  Select m_year= new Select(model_year);
		  m_year.selectByIndex(18);
		  model_year.sendKeys(Keys.TAB);
		  Thread.sleep(1000);
		  //make
		  WebElement make = driver.switchTo().activeElement();
		  Select make_1= new Select(make);
		  Thread.sleep(1000);
		  make_1.selectByValue("0AF86550-09A9-E611-80CD-005056BD47E8");
		  make.sendKeys(Keys.TAB);
		  //model
		  Thread.sleep(1000);
		  WebElement model = driver.switchTo().activeElement();
		  Select model_1= new Select(model);
		  model_1.selectByValue("7CFEFCB5-09A9-E611-80CD-005056BD47E8");
		  model.sendKeys(Keys.TAB);
		  //model_specifier
		  Thread.sleep(1000);
		  WebElement model_specifier = driver.switchTo().activeElement();
		  Select model_specifier_1= new Select(model_specifier);
		  model_specifier_1.selectByIndex(1);
		  model_specifier.sendKeys(Keys.TAB);
		  //body type
		  Thread.sleep(2000);
		  WebElement body_type = driver.switchTo().activeElement();
		  Select body_type_1= new Select(body_type);
		  body_type_1.selectByIndex(1);
		  body_type.sendKeys(Keys.TAB);
		  // Engine Capacity
		  Thread.sleep(2000);
		  WebElement engine_capacity = driver.switchTo().activeElement();
		  Select engine_capacity_1= new Select(engine_capacity);
		  engine_capacity_1.selectByIndex(1);
		  engine_capacity.sendKeys(Keys.TAB);
		  // Cylinders
		  Thread.sleep(1000);
		  WebElement cylinders = driver.switchTo().activeElement();
		  Select cylinders_1= new Select(cylinders);
		  cylinders_1.selectByIndex(1);
		  cylinders.sendKeys(Keys.TAB);
		  //Seating Capacity
		  Thread.sleep(1000);
		  WebElement seating = driver.switchTo().activeElement();
		  Select seating_1= new Select(seating);
		  seating_1.selectByIndex(1);
		  seating.sendKeys(Keys.TAB);
		  //Color
		  Thread.sleep(1000);
		  WebElement color = driver.switchTo().activeElement();
		  Select color_1= new Select(color);
		  color_1.selectByIndex(1);
		  
		  WebElement Vehicle_value= driver.findElement(By.id("vehicle_velue"));
		  Vehicle_value.sendKeys("55100");
		  WebElement mortgaged= driver.findElement(By.id("is_mortgaged"));
		  Select V_mortgaged= new Select(driver.findElement(By.id("is_mortgaged")));
		  V_mortgaged.selectByIndex(2);
		  mortgaged.sendKeys(Keys.TAB);
	  }
	  @Test (priority=6)
	  public void PremiumDetail() {
		  WebElement inclue_driver = driver.switchTo().activeElement();
		  Select i_driver= new Select(inclue_driver);
		  i_driver.selectByIndex(1);
		  Select include_passenger= new Select(driver.findElement(By.xpath("//*[@id=\"policy_information\"]/div[4]/div[1]/div/div[2]/div[2]/select")));
	      include_passenger.selectByIndex(1);
//	      WebElement Search_rates= driver.findElement(By.xpath("//*[@id=\"policy_information\"]/div[4]/div[2]/div[2]/button[1]"));
//	      Search_rates.click();
	      // Method 1 for wait 
//	      WebDriverWait wait = new WebDriverWait(driver,20);
//	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
	   // nt.sendKeMethod 2 for wait
//	      WebElement discount = (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
//	      discouys("20");
	  }
	  @Test(priority=7)
	  public void uploadfile() {
		  WebElement id_front= driver.findElement(By.id("emirates_id_front"));
		  id_front.sendKeys("C:\\Users\\Jansher\\Desktop\\Carnama folder\\Completeprocess.png");
	  }
	  
	  @Test(priority=8)
	  public void verification() {
		  WebElement isDocAttached= driver.findElement(By.id("isDocsAttached"));
		  isDocAttached.click();
		  WebElement isInfoCorrect= driver.findElement(By.id("isInfoCorrect"));
		  isInfoCorrect.click();
	  }
}
