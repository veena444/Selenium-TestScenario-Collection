package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElementIsSelected {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By privacyPolicyCheckBox = By.name("agree");
		
		//Before clicking on check box
//		boolean beforeClick = isElementSelected(privacyPolicyCheckBox);
//		System.out.println(beforeClick); //false
		
		//after clicking on check box
		getElement(privacyPolicyCheckBox).click();
		boolean afterClick = isElementSelected(privacyPolicyCheckBox);
		System.out.println(afterClick); //true
		

	}
	
	//creating generic methods for getElement & isElementSelected
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean isElementSelected(By locator) {	
			return getElement(locator).isSelected();
		}

}
