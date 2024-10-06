package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Using sendKeys() method we can send CharSequence...keysToSend.
 * 
 * CharSequence is an Interface. String,StringBuilder() & StringBuffer() implements CharSequence Interface.
 * 
 * Using CharSequence we can send multiple string values. We can combine String, StringBuilder() & StringBuffer() & pass them as a comma separated
 * values.
 * 
 *  */
public class SendKeysWithCharSequence {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement searchText = driver.findElement(By.name("q"));
		
		//1. Using String
		
//		searchText.sendKeys("Selenium");
		
		//2. Using StringBuilder()
		
//		StringBuilder text = new StringBuilder()
//				.append("Selenium")
//				.append(" ")
//				.append("Automation")
//				.append(" ")
//				.append("Learning");
//		
//		searchText.sendKeys(text);
		
		//3. Using StrngBuffer
		
		StringBuffer text = new StringBuffer()
				.append("Selenium")
				.append(" ")
				.append("Automation")
				.append(" ")
				.append("Learning");
		
		searchText.sendKeys(text);
		
	
		driver.quit();		

	}

}
