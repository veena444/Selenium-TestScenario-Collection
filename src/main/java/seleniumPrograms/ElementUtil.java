package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	private WebDriver driver;
	
	//constructor
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}	
	/**
	 * This method is used to find the web element. 
	 * @param locator
	 * @return Returns WebElement.
	 */
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	/**
	 * This method is used to enter the values in text field by passing string.
	 * @param locator
	 * @param value
	 */
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	/**
	 * This method is used to enter the values in text field by passing CharSequence.
	 * @param locator
	 * @param value
	 */
	public void doSendKeys(By locator, CharSequence...value) {
		getElement(locator).sendKeys(value);
	}
	
	/**
	 * This method is used to click on the web element.
	 * @param locator
	 */
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	/**
	 * This method is used to verify web element is displayed on the page or not.
	 * @param locator
	 * @return Returns boolean value true or false.
	 */
	
	public boolean isElementDisplayed(By locator) {
		try {
		return getElement(locator).isDisplayed();
		}
		catch(NoSuchElementException e) { //import selenium exception
			System.out.println("Element is not displayed: "+locator);
			return false;
		}
	}
	
	/**
	 * This method is used to verify web element is selected or not.
	 * @param locator
	 * @return Returns boolean value true or false.
	 */
	public boolean isElementSelected(By locator) {	
		return getElement(locator).isSelected();
	}
	
	/**
	 * This method is used to verify web element is enabled or not.
	 * @param locator
	 * @return Returns boolean value true or false.
	 */
	public boolean isElementEnabled(By locator) {	
		return getElement(locator).isEnabled();
	}
	
	/**
	 * This method is used to get the attributes of web element.
	 * @param locator
	 * @param attrName
	 * @return
	 */
	public String elementGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

}
