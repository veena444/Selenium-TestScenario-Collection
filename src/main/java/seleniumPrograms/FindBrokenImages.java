package seleniumPrograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenImages {

	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/broken_images");
//
//		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
//		
//		for(WebElement e:imagesList ) {
//			String url = e.getDomAttribute("src");
//			verifyBrokenImages(url);
//		}
//		
//		driver.quit();
//		
//	}
//	
//	public static void verifyBrokenImages(String linkUrl) {
//		try {
//
//		    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(linkUrl).openConnection();
//		    httpURLConnection.setConnectTimeout(5000);
//		    httpURLConnection.connect();
//		    
//		    if(httpURLConnection.getResponseCode() != 200) {
//				System.out.println(linkUrl +" ---> " + httpURLConnection.getResponseMessage() + " is a broken image");
//			}
//		    else {
//		    	System.out.println(linkUrl +" ---> " + httpURLConnection.getResponseMessage());
//		    }
//		    
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//		}		
		
	}

}
