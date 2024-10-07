package seleniumPrograms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * In the below application verify whether the fields are mandatory or not.
 * 
 */
public class VerifyFieldsMandatoryOrNot {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String firstNameJS = "return window.getComputedStyle(document.querySelector('label[for=\\\"input-firstname\\\"]'),'::before').getPropertyValue('content')";
		String lastNameJS = "return window.getComputedStyle(document.querySelector('label[for=\\\"input-lastname\\\"]'),'::before').getPropertyValue('content')";
		String emailJS = "return window.getComputedStyle(document.querySelector('label[for=\\\"input-email\\\"]'),'::before').getPropertyValue('content')";
		String telephoneJS = "return window.getComputedStyle(document.querySelector('label[for=\\\"input-telephone\\\"]'),'::before').getPropertyValue('content')";
		String passwordJS = "return window.getComputedStyle(document.querySelector('label[for=\\\"input-password\\\"]'),'::before').getPropertyValue('content')";
		String passwordConfirmJS = "return window.getComputedStyle(document.querySelector('label[for=\\\"input-confirm\\\"]'),'::before').getPropertyValue('content')";
		
		verifyFieldIsMandatory(firstNameJS,"FirstName");
		
		verifyFieldIsMandatory(lastNameJS,"LastName");
		
		verifyFieldIsMandatory(emailJS,"Email");
		
		verifyFieldIsMandatory(telephoneJS,"Telephone");
		
		verifyFieldIsMandatory(passwordJS,"Password");
		
		verifyFieldIsMandatory(passwordConfirmJS,"PasswordConfirm");
		
		driver.quit();

	}
	
	public static void verifyFieldIsMandatory(String jsScript, String fieldName) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String content = js.executeScript(jsScript).toString();
		System.out.println(content);
		if(content.contains("*")) {
			System.out.println(fieldName + " is a mandatory field");
		}
		else {
			System.out.println(fieldName + " is not a mandatory field");
		}
	}

}
