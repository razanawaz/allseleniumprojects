package test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class brokenlinks {

	private static WebDriver driver= null;
	
	public static void main(String args[])
	{
		String homepage= "https://trello.com";
		String url="";
		
		HttpURLConnection huc= null;
		int respcode=200;
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(homepage);
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		Iterator<WebElement> it= links.iterator();
		
		while (it.hasNext()) {
			url=it.next().getAttribute("href");
			System.out.println("url");
			if(url == null || url.isEmpty()){
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
				}
				            
			if(!url.startsWith(homepage)){
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
				}
		
			
			try {
				huc = (HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				respcode = huc.getResponseCode();
				if(respcode >= 400){
	                System.out.println(url+" is a broken link");
	            	}
	            else{
	                System.out.println(url+" is a valid link");
	            	}
			    
			    }
				catch (MalformedURLException e) {
                e.printStackTrace();
                
				} 
				catch (IOException e) {  
                e.printStackTrace();
				} 
			
				}
	
		
		 driver.quit();
	}
	
}
