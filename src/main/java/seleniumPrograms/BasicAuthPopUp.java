package seleniumPrograms;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * HasAuthentication - It is an Interface.
 * It indicates that a driver supports authenticating to a website in some way.
 * 
 * ChromiumDriver class extends RemoteWebDriver & implements HasAuthentication. It is applicable to only chromium based browsers(Chrome & Edge).
 * 
 * It has a method called register(). It attempts to apply the credentials for any request for authorization.
 */
public class BasicAuthPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		String username = "admin";
		String password = "admin";
		
	    ((HasAuthentication)driver).register( () -> new UsernameAndPassword(username,password));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		driver.quit();

	}

}
