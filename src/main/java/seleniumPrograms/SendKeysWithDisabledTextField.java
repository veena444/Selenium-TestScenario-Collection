package seleniumPrograms;

/*
 * What happens when we try to enter the value in disabled text field?
 * 
 * It will throw an exception; 'ElementNotInteractableException: element not interactable'
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithDisabledTextField {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		By password = By.id("pass");
		
		//try to enter the value in disabled text field
		
		driver.findElement(password).sendKeys("test@123");//ElementNotInteractableException		

	}

}
