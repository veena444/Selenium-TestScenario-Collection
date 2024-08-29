package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElementIsEnabled {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		By password = By.id("pass");
		
		boolean pwdField = isElementEnabled(password);
		System.out.println(pwdField);//false
		

	}
	
	//creating generic methods for getElement & isElementEnabled
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean isElementEnabled(By locator) {	
			return getElement(locator).isEnabled();
		}

}
