package seleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTableWithPagination {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);

		WebElement table = driver.findElement(By.xpath("//div[@class='elementor-widget-container']/h2[text()='System Distribution Details']"));
		jsUtil.scrollIntoView(table);
		Thread.sleep(2000);

//		singleCountrySelection("Ukraine");
//		multipleCountrySelection("India");
		selectTwoCountries("United States","Hong Kong");

		driver.quit();
		
	}
	
	//select single country
	public static void selectSingleCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	//single country selection
	public static void singleCountrySelection(String countryName) {
		
		while(true) {
			//if the element is on the 1st page itself		
			if(driver.findElements(By.xpath("//td[text()='"+countryName+"']")).size()>0) {
				selectSingleCountry(countryName);
				break;				
			}
			else {
				//pagination logic
				//if country is not available on the first page, click on Next
				WebElement next = driver.findElement(By.linkText("Next"));
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("Pagination is over..country not found...");
					break;
				}
				next.click();
			}
		}
		
	}
	
	
	//select multiple checkboxes
	
	public static void selectMultipleCountry(String countryName) {
		List<WebElement> elements = driver.findElements(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']"));
		for(WebElement e : elements) {
			e.click();
		}
	}	
	
	//multiple country selection 
	public static void multipleCountrySelection(String countryName) {
		
		while(true) {	
			if(driver.findElements(By.xpath("//td[text()='"+countryName+"']")).size()>0) {
				selectMultipleCountry(countryName);
			}
				WebElement next = driver.findElement(By.linkText("Next"));
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("Pagination is over..country not found...");
					break;
				}
				next.click();				
		}
		
	}	
	
	//select 2 countries
	
	public static void selectTwoCountries(String countryName1, String countryName2) {
		
		while(true) {	
			if(driver.findElements(By.xpath("//td[text()='"+countryName1+"']")).size()>0) {
				selectSingleCountry(countryName1);
			}
			if(driver.findElements(By.xpath("//td[text()='"+countryName2+"']")).size()>0) {
				selectSingleCountry(countryName2);
			}
				WebElement next = driver.findElement(By.linkText("Next"));
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("Pagination is over..country not found...");
					break;
				}
				next.click();				
		}

	}
	
}
