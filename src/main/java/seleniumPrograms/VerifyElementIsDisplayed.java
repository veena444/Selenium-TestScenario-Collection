package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElementIsDisplayed {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//verify logo is displayed on the login page
		
		//Case 1: Positive scenario : logo is present
//		By logo = By.className("img-responsive");
		
		//Case 2: Negative scenario: logo is not present
		By logo = By.className("img-responsive11");
		
		if(isElementDisplayed(logo)) {
			System.out.println("Logo is present");
		}
		else {
			System.out.println("Logo is not present");
		}
		driver.quit();

	}
	
	//creating generic methods for getElement & isElementDisplayed
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean isElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		}
		catch(NoSuchElementException e) {
			System.out.println("Element is not displayed: "+locator);
			return false;
		}
		
	}

}
