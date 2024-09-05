package seleniumPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Go to Google, search with the item 'selenium', print the suggestion list and click on 'selenium tutorial' link.
 */
public class GoogleSuggestionLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By searchField = By.name("q");
		By suggestions = By.xpath("//ul/li//div[@class='wM6W7d']/span");
		
		doSearch(searchField,suggestions,"Selenium","selenium tutorial");//valid search
//		doSearch(searchField,suggestions,"acacacacacac","training");//invalid search
		driver.quit();

	}
	
	//generic method
	
	public static void doSearch(By searchField,By suggestions, String searchKey, String matchValue) {
		driver.findElement(searchField).clear();
		driver.findElement(searchField).sendKeys(searchKey);
		
		//wait for suggestions to appear
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(suggestions));
			
			List<WebElement> suggestionList = driver.findElements(suggestions);
			int totalSuggestions = suggestionList.size();
			System.out.println("Total no. of suggestions:" +totalSuggestions);
			
			boolean matchFound=false;
			for(WebElement e: suggestionList) {
				String text = e.getText();
				System.out.println("Suggestion: "+text);
				if(text.contains(matchValue)) {
					e.click();
					matchFound=true;
					break;
				}
			}
			if(!matchFound) {
				System.out.println("No matching value found for: "+matchValue);
			}
		 			
		}catch(TimeoutException e){
			System.out.println("Suggestions didn't appear for: "+searchKey);
			
		}

	}

}
