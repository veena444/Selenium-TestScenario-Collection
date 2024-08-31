package seleniumPrograms;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Find the language links for Google.
 */
public class FindGoogleLanguageLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By languageLinks = By.xpath("//div[@id='SIvCob']/a");
		
		List<String> languageLinksText = findLanguageLinks(languageLinks);
		System.out.println(languageLinksText);
		
		driver.quit();
		
//		List<WebElement> languageLinksList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//		int totalLangLinks = languageLinksList.size();
//		System.out.println(totalLangLinks);
//		
//		for(WebElement e: languageLinksList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("ಕನ್ನಡ")) {
//				e.click();
//				break;
//			}
//		}
		

	}

	//generic method for findingLanguageLinks
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public static List<String> findLanguageLinks(By locator) {
		List<WebElement> languageLinksList = getElements(locator);
		List<String> languageLists = new ArrayList<String>();
		for(WebElement e: languageLinksList) {
			String text = e.getText();
			if(text.length() != 0) {
				languageLists.add(text);
			}
			
		}
		return languageLists;
			
		
	}
}
