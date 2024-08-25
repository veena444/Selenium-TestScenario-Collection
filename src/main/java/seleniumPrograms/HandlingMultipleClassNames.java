package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * What happens when we try to access the web element where-in element's class name have spaces in between using className locator strategy?
 * 
 * It will throw an exception: InvalidSelectorException: Compound class names not permitted
 * 
 * When we observe, we can see two class names which is separated by space. 
 * 
 * Solution: This can be handled by using 'xpath' where we can pass multiple class names. With className only single class name is allowed.
 */
public class HandlingMultipleClassNames {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		// enter the value in 'Search' field using className
//		driver.findElement(By.className("form-control input-lg")).sendKeys("MacBook");
		
		//enter the value in 'Search' field using xpath
		driver.findElement(By.xpath("//input[@class='form-control input-lg']")).sendKeys("MacBook");
		
		driver.quit();
		

	}

}
