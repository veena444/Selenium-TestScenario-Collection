package seleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Handling shadow DOM element using JavascriptExecutor.
 */
public class ShadowDOMHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		String jsPath = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement pizza = (WebElement)js.executeScript(jsPath);
		pizza.sendKeys("Veg Pizza");
		
		driver.quit();

	}

}
