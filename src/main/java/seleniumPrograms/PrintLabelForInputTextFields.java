package seleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * Find the labels of Personal Details. 
 */
public class PrintLabelForInputTextFields {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement> personalDetailslabels = driver.findElements(By.xpath("//form[@class='form-horizontal']/fieldset/div/label[contains(@for,'input')]"));
		for(WebElement e: personalDetailslabels) {
			String text = e.getText();
			System.out.println(text);
		}
		driver.quit();

	}

}
