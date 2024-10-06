package seleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * Handling multiple menu.
 */
public class BigBasketMultiMenuHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		
		By level1 = By.xpath("//*[@id='headlessui-menu-button-:R5bab6:']/div/span[1]");
		By level2 = By.xpath("//a[@role='none'][normalize-space()='Fruits & Vegetables']");
		By level3 = By.linkText("Fresh Fruits");
		By level4 = By.linkText("Banana, Sapota & Papaya");
		
		parentToChildMenu(level1,level2,level3,level4);
		driver.quit();

	}
	
	//generic methods
	
	public static void parentToChildMenu(By level1, By level2, By level3, By level4) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		getElement(level1).click();
		Actions action = new Actions(driver);
		action.moveToElement(getElement(level2)).perform();
		action.moveToElement(getElement(level3)).perform();
		getElement(level4).click();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
