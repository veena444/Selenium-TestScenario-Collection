package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
 * Is it possible to enter 'null' values using sendKeys() method?
 * 
 * It will throw an exception : IllegalArgumentException: Keys to send should be a not null CharSequence
 * 
 * If we look at the implementation of sendKeys() method; it says if keysToSend is equal to null or keysToSend.length == 0 then 
 * throw an exception 'IllegalArgumentException("Keys to send should be a not null CharSequence").
 * 
 * But it is observed that when we send blank values, it doesn't show any exception.
 */
public class NullWithSendKeys {

	public static void main(String[] args) {
		BrowserUtil bUtil = new BrowserUtil();
		WebDriver driver = bUtil.launchBrowser("chrome");
		bUtil.launchURL("https://www.google.com");
		
		//sending null values
//		driver.findElement(By.name("q")).sendKeys(null);
		
		//sending blank values
		driver.findElement(By.name("q")).sendKeys("");
		
		driver.quit();
		

	}

}
