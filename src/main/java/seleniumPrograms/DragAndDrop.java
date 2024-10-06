package seleniumPrograms;
/*
 * Drag and drop can be achieved using Actions class.
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		By sourceElement = By.id("draggable");
		By targetElement = By.id("droppable");
		
		Actions action = new Actions(driver);
		
		//1.Using dragAndDrop
//		action.dragAndDrop(driver.findElement(sourceElement), driver.findElement(targetElement)).perform();
		
		//2. We will click & hold the element first and then release it
		action.clickAndHold(driver.findElement(sourceElement))
		        .moveToElement(driver.findElement(targetElement))
		           .build()
		             .perform();
		
		driver.quit();

	}

}
