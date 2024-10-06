package seleniumPrograms;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * We can achieve accessibility testing using Actions class with Keys.TAB
 */
public class AccessibilityTestingUsingTAB_Amazon {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB)
		        .pause(200)
		          .sendKeys(Keys.TAB)
		            .pause(200)
		              .sendKeys(Keys.TAB)
		                .pause(200)
		                  .sendKeys(Keys.TAB)
		                    .pause(200)
		                      .sendKeys(Keys.TAB)
		                         .pause(200)
		                           .sendKeys("apple watch")
		                             .sendKeys(Keys.ENTER)
		                               .build()
		                                 .perform();

         driver.quit();

	}

}
