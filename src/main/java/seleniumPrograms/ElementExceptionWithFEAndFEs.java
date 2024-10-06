package seleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * What is the difference between findElement & findElements method in Selenium?
 * 
 * 
 * findElement(): 
 * 1.It is used to uniquely identify the web element in the page.
 * 2.It returns the first matching web element when locator finds multiple web element.
 * 3.It throws 'NoSuchElementException' if the element is not found.
 * 
 * findElements():
 * 1.It is used to identify list of web elements in the page.
 * 2.It returns a collection of matching elements.
 * 3.It returns an empty list if matching element is not found.
 */
public class ElementExceptionWithFEAndFEs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//entering the wrong className
		By logo = By.className("img-responsive11");
		
		//find the web element using findElement() method
		
//		driver.findElement(logo); //NoSuchElementException
		
		//find the web element using findElements() method
		
		List<WebElement> logos = driver.findElements(logo); //empty list
		System.out.println(logos.size());
		
		driver.quit();

	}

}
