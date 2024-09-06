package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/*
 * Without using By locator & WebElement more than once, fill the registration form.
 */
public class RegistrationFormUsingTAB {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		
		Actions action = new Actions(driver);
		Action act = action.sendKeys(firstName,"John")
		        .sendKeys(Keys.TAB)
		          .pause(200)
		           .sendKeys("Doe")
		             .sendKeys(Keys.TAB)
		               .pause(200)
		                 .sendKeys("john.doe21@gmail.com")
			               .sendKeys(Keys.TAB)
			                 .pause(200)
			                   .sendKeys("1234567890")
					             .sendKeys(Keys.TAB)
					               .pause(200)
					                 .sendKeys("test@123")
						               .sendKeys(Keys.TAB)
						                 .pause(200)
						                   .sendKeys("test@123")
						                     .sendKeys(Keys.TAB)
						                       .pause(200)					                      
								                 .sendKeys(Keys.TAB)
								                   .pause(200)
									                  .sendKeys(Keys.TAB)
									                     .pause(200)
										                    .sendKeys(Keys.SPACE)
										                       .pause(200)
										                          .sendKeys(Keys.TAB)
										                             .pause(200)
										                               .sendKeys(Keys.ENTER)
					                                                      .build();
		
		act.perform();
		driver.quit();
		

	}

}
