package Administration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.io.File;
import org.apache.commons.io.FileUtils;




public class Broken_links {
	public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        
        String Page = "http://hrms.test/";
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
        
        driver.get(Page);
     // login
        WebElement username= driver.findElement(By.xpath("//*[@id=\"el1\"]"));
        WebElement password= driver.findElement(By.xpath("//*[@id=\"el4\"]"));
        WebElement login= driver.findElement(By.id("submit_button"));
        username.sendKeys("admin");
        password.sendKeys("admin.password");
        login.click();
        
        driver.get("http://hrms.test/employees/all");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
        List<WebElement> links = driver.findElements(By.tagName("a"));
        Iterator<WebElement> it= links.iterator();
        
        
        
 while(it.hasNext()){
            
            url = it.next().getAttribute("href");
            
            System.out.println(url);
        
            if(url == null || url.isEmpty()){
            	System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }
            
            if(!url.startsWith(Page)){
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }
            
	
 
 try {
     huc = (HttpURLConnection)(new URL(url).openConnection());
     
     huc.setRequestMethod("HEAD");
     
     huc.connect();
     
     respCode = huc.getResponseCode();
     
     if(respCode >= 400){
         System.out.println(url+" is a broken link");
     }
     else{
         System.out.println(url+" is a valid link");
     }
         
 } 
 
 	catch (MalformedURLException e) {
     // TODO Auto-generated catch block
     e.printStackTrace();
 	} 
 	catch (IOException e) {
     // TODO Auto-generated catch block
     e.printStackTrace();
 	}
 
 }

}

//	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
//
//        //Convert web driver object to TakeScreenshot
//
//        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
//
//        //Call getScreenshotAs method to create image file
//
//                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//
//            //Move image file to new destination
//
//                File DestFile=new File(fileWithPath);
//
//               
//
//    }
 
 
}




