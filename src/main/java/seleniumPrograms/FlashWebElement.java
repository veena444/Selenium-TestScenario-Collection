package seleniumPrograms;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * Flash the web element during run time using JavascriptExecutor.
 */

public class FlashWebElement {
	
	static WebDriver driver;

	public static void main(String[] args){
		driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		
		WebElement loginForm = driver.findElement(By.id("hs-login"));		
		WebElement emailAddress = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
		jsUtil.flash(loginForm);
		jsUtil.flash(emailAddress);
		jsUtil.flash(password);
		
		driver.quit();

	}

}
