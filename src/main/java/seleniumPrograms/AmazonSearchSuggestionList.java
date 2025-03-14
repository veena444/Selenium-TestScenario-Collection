package seleniumPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSearchSuggestionList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='sac-autocomplete-results-container']//div[contains(@id,'sac-suggestion-row')]/div/div[@role='button']")));
		
		List<WebElement> suggestionList = driver.findElements(By.xpath("//div[@id='sac-autocomplete-results-container']//div[contains(@id,'sac-suggestion-row')]/div/div[@role='button']"));
		
		System.out.println(suggestionList.size());
		
		
		for(WebElement e:suggestionList) {
			String list = e.getDomAttribute("aria-label");
			System.out.println(list);
		}
		
		driver.quit();

	}

}



/*

How to handle disappearing elements:

Go to DOM -> Elements tab -> inside DOM press Ctrl+Shift+P -> Run -> Emulate a focused page 

 //div[@id='sac-autocomplete-results-container']//div[contains(@id,'sac-suggestion-row')]/div/div[@role='button']
*/