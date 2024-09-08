package seleniumPrograms;
/*
 * How to handle multiple browser windows?  
 */
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserMultipleWindowHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");//parent window
		
		
		String parentWindowID = driver.getWindowHandle();
		
		//one parent & multiple child window handling
		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		WebElement newsArticle = driver.findElement(By.xpath("//footer//a[contains(text(),'News Articles')]"));
		WebElement ourPartners = driver.findElement(By.xpath("//footer//a[contains(text(),'Our Partners')]"));
		WebElement testimonials = driver.findElement(By.xpath("//footer//a[contains(text(),'Testimonials')]"));
		
		Actions action = new Actions(driver);
		action.click(executiveProfile).perform();
		action.click(newsArticle).perform();
		action.click(ourPartners).perform();
		action.click(testimonials).perform();
		
		//fetch window id's
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while(it.hasNext()){
			String windowID = it.next();
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
			if(!windowID.equals(parentWindowID)) {
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window title: "+driver.getTitle());


	}

}
