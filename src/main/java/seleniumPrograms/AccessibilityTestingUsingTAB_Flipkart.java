package seleniumPrograms;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AccessibilityTestingUsingTAB_Flipkart {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB)
		        .pause(200)
		          .sendKeys(Keys.TAB)
		            .pause(200)
		              .sendKeys(Keys.TAB)
		                .pause(200)
		                    .sendKeys("lenovo laptop")
		                        .sendKeys(Keys.ENTER)
		                            .build()
		                               .perform();

         driver.quit();

	}


}
