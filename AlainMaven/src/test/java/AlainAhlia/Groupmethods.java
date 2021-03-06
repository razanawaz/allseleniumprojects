package AlainAhlia;
import java.util.List;

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
import org.testng.Assert;




public class Groupmethods {
	static WebDriver driver;
	private String Expected_name;

		
		
		@Test (priority=0, groups= {"add","verify"})
		  public void setupTest() {
			  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.get("http://jis-stage:vst%40dxb2018$@staging.juelmin.com/login");
			  driver.manage().window().maximize();
	}
		
		 @Test (priority=1, groups= {"add","verify"})
		  public void login() throws InterruptedException {
			  Thread.sleep(2000);
			  WebElement username=  driver.findElement(By.id("username"));
			  username.sendKeys("admin");
			  WebElement password= driver.findElement(By.id("password"));
			  password.sendKeys("Staging456#@2019");
			  WebElement login= driver.findElement(By.xpath("//*[@id=\"id-form\"]/tbody/tr[5]/td[1]/input[1]"));
			  login.click();  
		  
	 }
		 
		 @Test (priority=2, groups= {"add","verify"})
		  public void Addquicksale() throws InterruptedException {
			  Actions action = new Actions(driver);
			  WebElement QuickSale = driver.findElement(By.xpath("//*[@id=\"menu-home\"]/li[3]/a"));
			  Thread.sleep(2000);
			  action.moveToElement(QuickSale).moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-home\"]/li[3]/ul/li[1]/a"))).click().build().perform();
		  }
		 
		 @Test (priority=3, groups= {"add","verify"})
		  public void SelectinsuranceCompany() throws InterruptedException {
			  Select IC= new Select(driver.findElement(By.id("addRate_ins_company_id")));
			  Thread.sleep(2000);
			  IC.selectByValue("65");
		  }
		 @Test (priority=4, groups= {"add","verify"})
		  public void CustomerInfo() throws InterruptedException {
			 
			  WebElement name=  driver.findElement(By.xpath("//*[@id=\"member_memberNameEng\"]"));
			  name.sendKeys("Raza Nawaz");
			  Thread.sleep(2000);
			  Expected_name= name.getAttribute("value");
			  System.out.println("Expected name is :" +Expected_name );
		      
			  WebElement arabicname=  driver.findElement(By.id("member_memberNameArabic"));
			  arabicname.sendKeys("Raza Nawaz");
			  WebElement emiratesid=  driver.findElement(By.id("emirates_id"));
			  emiratesid.sendKeys("901234567891234");
			  WebElement email=  driver.findElement(By.id("member_email"));
			  email.sendKeys("raza.nawaz29@visualsparks.com");
			  Select code= new Select(driver.findElement(By.id("member_mobile_code")));
			  code.selectByIndex(2);
			  WebElement mobile=  driver.findElement(By.id("member_mobile"));
			  mobile.sendKeys("9876543");
			  WebElement address=  driver.findElement(By.id("member_address1_eng"));
			  address.sendKeys("New Block, Dubai");
			  WebElement Dob=  driver.findElement(By.id("member_licenceIssueYear_date"));
			  Dob.sendKeys("26/08/1971");
			  WebElement gender= driver.findElement(By.id("gender_male"));
			  gender.click();
			  Select nationality= new Select(driver.findElement(By.id("member_nationality")));
			  nationality.selectByValue("ARE");
			  Select city= new Select(driver.findElement(By.id("member_city")));
			  city.selectByValue("1000");
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
			  Select policy_type= new Select(driver.findElement(By.id("policy_type")));
			  policy_type.selectByIndex(2);
		  }
		 
		 @Test (priority=5, groups= {"add"})
		  public void Vehicleinfo() throws InterruptedException {
			  Thread.sleep(1000);
			  WebElement chassis_no=  driver.findElement(By.id("vehicle_chassis_no"));
			  chassis_no.sendKeys("123456789AUTO11");
			  WebElement Engine_no=  driver.findElement(By.id("vehicle_engine_no"));
			  Engine_no.sendKeys("24242423449");
			  Select v_city= new Select(driver.findElement(By.id("vehicle_city")));
			  v_city.selectByValue("1000");
			  Select v_plate_type= new Select(driver.findElement(By.id("useofVehicle")));
			  v_plate_type.selectByValue("17");
			  Select v_platesource= new Select(driver.findElement(By.id("vehiclePlateSource")));
			  v_platesource.selectByValue("0001");
			  Select v_plate_code= new Select(driver.findElement(By.id("vehicle_plate_code")));
			  v_plate_code.selectByValue("11th category-1152");
			  WebElement plate_no=  driver.findElement(By.id("vehicle_plate_number"));
			  plate_no.sendKeys("4534");
			  Select vehicletype= new Select(driver.findElement(By.id("tbl_juelmin_vehilce_type_vehicle_type_id")));
			  vehicletype.selectByValue("110");
			  // 103 car
			  //110 bike
			  //105 pickup
			  //111 tanker
			  
			  
			  Select cylinders= new Select(driver.findElement(By.id("vehicle_cylinders")));
			  cylinders.selectByValue("1");
     		  // 4 car
			  // 1 bike
			  // 4 pickup
			  // 6 hilux
			  
			  
			  
			  Select bodytype= new Select(driver.findElement(By.id("tbl_juelmin_bodytype_bodytime_id")));
			  bodytype.selectByValue("240");
			  // 390 car
			  // 240 bike
			  // 280 pickup
			  // 151 hilux
			  
			  
			//  Thread.sleep(1000);
			  Select make= new Select(driver.findElement(By.id("tbl_juelmin_model_tbl_juelmin_make_make_id")));
			  make.selectByValue("186");
			  // car 186
			  // bike 186
			  // pickup 199
			  // hilux 281
			  
		//	  Thread.sleep(1000);
			  Select doors= new Select(driver.findElement(By.id("vehicle_doors")));
			  doors.selectByValue("0");
			  // 4 car
			  // 0 bike
			  // 2 pickup
			  // 2 hilux
			  
			  Select seats= new Select(driver.findElement(By.id("vehicle_passenger_capacity")));
			  seats.selectByValue("2");
			  // 5 car
	    	  // 2 bike
	    	  // 3 pickup
			  // 3 hilux
			  Thread.sleep(2000);
			  Select model= new Select(driver.findElement(By.id("tbl_juelmin_model_model_id")));
			  model.selectByIndex(13);
			  // 186102 bike
			  // 199155 pickup
			  // 281460 hilux
		  
			  Select color= new Select(driver.findElement(By.id("color")));
			  color.selectByValue("005");
			  Select model_year= new Select(driver.findElement(By.id("vehicle_model_year")));
			  model_year.selectByValue("2015");
			  WebElement vehicle_value=  driver.findElement(By.id("vehicle_velue"));
			  vehicle_value.sendKeys("10000");
			  Select repair_condition= new Select(driver.findElement(By.id("comprehensive_rate_type")));
			  repair_condition.selectByValue("agency");
			  // agency
			  // nonagancy
			  Select V_mortgaged= new Select(driver.findElement(By.id("is_mortgaged")));
			  V_mortgaged.selectByIndex(2);
		  
		  }
		 
		 @Test (priority=6, groups= {"add"})
		  public void PremiumDetail() throws InterruptedException {
			 
			  Select i_driver= new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div[1]/table/tbody/tr[2]/td[2]/div[2]/div[1]/div/form/div[3]/div[4]/div[1]/div/div[1]/div[2]/select")));
			  i_driver.selectByIndex(1);
			  Select include_passenger= new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[6]/div[1]/table/tbody/tr[2]/td[2]/div[2]/div[1]/div/form/div[3]/div[4]/div[1]/div/div[2]/div[2]/select")));
		      include_passenger.selectByIndex(1);
		      WebElement Search_rates= driver.findElement(By.xpath("//*[@id=\"policy_information\"]/div[4]/div[2]/div[2]/button[1]"));
		      Search_rates.click();
		      Thread.sleep(6000);
		      WebElement f_cert_NUM = driver.findElement(By.id("is_fetched_certificate_number"));
		      f_cert_NUM.click();
		      WebElement commission = driver.findElement(By.id("juelmin_commission"));
		      commission.sendKeys("10");
	}
		 
		 @Test(priority=7, groups= {"add"})
		  public void uploadfile() {
			  WebElement id_front= driver.findElement(By.id("emirates_id_front"));
		  id_front.sendKeys("C:\\Users\\Jansher\\Desktop\\Carnama folder\\Completeprocess.png");
		  }
		  
		  @Test(priority=8, groups= {"add"})
		  public void verification() {
			  WebElement isDocAttached= driver.findElement(By.id("isDocsAttached"));
			  isDocAttached.click();
			  WebElement isInfoCorrect= driver.findElement(By.id("isInfoCorrect"));
			  isInfoCorrect.click();
		  }
		  @Test(priority=9, groups= {"add"})
		  public void buypolicy() throws InterruptedException {
			  Thread.sleep(5000);
			  WebElement buyPolicy= driver.findElement(By.xpath("//*[@id=\"policyForm\"]/div[6]/div[4]/div/button"));
			  buyPolicy.click();
		  }
		  
		  @Test(priority=10, groups= {"verify"})
		  public void checkpolicy( ) throws InterruptedException {
			
			 // Thread.sleep(15000);
			  Actions action1 = new Actions(driver);
			  WebElement Policies= driver.findElement(By.xpath("//*[@id=\"menu-home\"]/li[5]/a"));
			  action1.moveToElement(Policies).moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-home\"]/li[5]/ul/li[1]/a"))).click().perform();
			  WebElement details= driver.findElement(By.xpath("//*[@id=\"product-table\"]/tbody/tr[2]/td[12]/a"));
			  details.click();
			  WebElement tbl = driver.findElement(By.xpath("//*[@id=\"table-content\"]/table"));
			//check all row, identification with 'tr' tag
			  List<WebElement> rows = tbl.findElements(By.tagName("tr"));

			  //row iteration
//		  for(int i=1; i<rows.size(); i++) 
//		  {
			      //check column each in row, identification with 'td' tag
			      List<WebElement> cols = rows.get(1).findElements(By.tagName("td"));

			      //column iteration
		  	   
			    String actual_name = cols.get(0).getText();
			 //   String expected_name= "Raza Nawaz";
				Assert.assertEquals(actual_name, Expected_name);
//		  }  
			  
		  }
}
