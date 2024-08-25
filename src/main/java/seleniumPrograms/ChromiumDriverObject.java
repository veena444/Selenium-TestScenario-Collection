package seleniumPrograms;

import org.openqa.selenium.chromium.ChromiumDriver;

/*
 * Is this valid?
 * 
 * ChromiumDriver driver = new ChromiumDriver();
 * 
 * If we see the driver object creation hierarchy, it is valid. But if we check the actual implementation of ChromiumDriver class,Constructor is 
 * defined as 'protected' and it prevents the user from creating the object.
 */
public class ChromiumDriverObject {

	public static void main(String[] args) {
//		ChromiumDriver driver = new ChromiumDriver();

	}

}
