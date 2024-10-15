package seleniumPrograms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * CSS pseudo elements are used to style specified parts of an element.
 * 
 *  ::before , ::after, ::has are called pseudo elements.
 */
public class PseudoElementsHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		String script = "return window.getComputedStyle(document.querySelector('label[for=\\\"input-firstname\\\"]'),'::before').getPropertyValue('content')";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String content = js.executeScript(script).toString();
		System.out.println(content);
		
		if(content.contains("*")) {
			System.out.println("FirstName is a mandatory field");
		}
		
		driver.quit();

	}
	

}
