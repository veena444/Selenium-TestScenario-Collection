package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * Right click on 'right click me' and click on 'Quit'.
 * 
 * Note: Right click & context click both are same.
 */
public class RightOrContextClick {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		doRightClick("right click me","Quit");
		driver.quit();

	}
	
	//generic method
	
	public static void doRightClick(String text, String rightClickOptions) {
		Actions action = new Actions(driver);
		action.contextClick(getElement(By.xpath("//span[text()='"+text+"']"))).perform();
		getElement(By.xpath("//span[text()='"+rightClickOptions+"']")).click();	
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
