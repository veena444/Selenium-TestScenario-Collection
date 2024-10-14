package seleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Handling SVG elements in Selenium:
 * 
 * SVG stands for Scalar Vector Graph. It can be identified with the tagname <svg> in the DOM.
 * Normal xpath never works with SVG elements. We need a special xpath for that.
 * 
 * To create a xpath for SVG element, we have //*[local-name()='svg']. The local-name function is mandatory to create a xpath for SVG element.
 * 
 */
public class SvgElementHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.name("q")).sendKeys("macbook pro");
		driver.findElement(By.xpath("//form[contains(@class,'_2rslOn header-form-search')]//*[local-name()='svg' and @fill='none']")).click();
		driver.quit();

	}

}
