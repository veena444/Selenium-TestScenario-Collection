package seleniumPrograms;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Write a code to handle the Country drop down without Select class.
 */
public class DropDownHandlingWithoutSelectClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
//		List<WebElement> countryList = driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
//		System.out.println(countryList.size());
//		
//		for(WebElement e: countryList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.contains("India")) {
//				e.click();
//				break;
//			}
//		
//		}
		
		By countryOptions = By.xpath("//select[@id='Form_getForm_Country']/option");		
		selectDropdownValue(countryOptions);
		
		driver.quit();

	}
	
	//generic method for drop down country selection
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public static void selectDropdownValue(By locator) {
		List<WebElement> optionsList = getElements(locator);
		System.out.println("Total no. of countries in a drop down list: "+optionsList.size());
		for(WebElement e: optionsList) {
			String text = e.getText();
			System.out.println(text);

		}
		
	}

}
