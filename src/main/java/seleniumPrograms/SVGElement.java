package seleniumPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
/*
 * Print all the states, click on 'Virginia' for the below mentioned url.
 */
public class SVGElement {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		String svgPath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']//*[name()='path']";
		List<WebElement> stateList = driver.findElements(By.xpath(svgPath));
		
		Actions action = new Actions(driver);
		for(WebElement e: stateList) {
			action.moveToElement(e).perform(); 
			String nameAttr = e.getAttribute("name");
			System.out.println(nameAttr);
			if(nameAttr.contains("Virginia")) {
				action.click(e).perform();
				break;
			}
			
		}
		
		driver.quit();

	}

}
