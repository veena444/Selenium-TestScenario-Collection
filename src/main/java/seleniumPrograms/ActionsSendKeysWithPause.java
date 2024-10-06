package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * Enter the search value like one by one character like how the user enters in the search field.
 */
public class ActionsSendKeysWithPause {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By searchField = By.name("search");
		
		doActionsSendKeysWithPause(searchField,"macbook",500);
		driver.quit();

	}
	
	//generic method
	
	public static void doActionsSendKeysWithPause(By locator, String value, long pauseTime) {
		Actions action = new Actions(driver);
		char[] ch = value.toCharArray();
		for(char c:ch) {
			action.sendKeys(getElement(locator),String.valueOf(c)).pause(pauseTime).perform();
		}
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
