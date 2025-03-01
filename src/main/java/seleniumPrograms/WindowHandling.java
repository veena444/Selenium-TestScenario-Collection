package seleniumPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");//parent window
		
		String parentWindowID = driver.getWindowHandle();
		
		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		
		Actions action = new Actions(driver);
		action.click(executiveProfile).perform();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while(it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);			
			System.out.println(driver.getTitle());
			
			if(!windowID.equals(parentWindowID)) {
				driver.close();
			}
			Thread.sleep(2000);
			driver.switchTo().window(parentWindowID);
			
		}

	}

}
