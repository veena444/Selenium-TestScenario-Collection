package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTextFieldValue {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		
		By emailId = By.id("email");
		By password = By.id("password");
		
		//get the attributes for above web elements
		
		String emailAttributeName = elementGetAttribute(emailId,"placeholder");
		System.out.println(emailAttributeName);
		
		String pwdAttributeName = elementGetAttribute(password,"placeholder");
		System.out.println(pwdAttributeName);

	}
	
	//creating generic methods for getElement, elementGetAttribute,doSendKeys
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static String elementGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	

}
