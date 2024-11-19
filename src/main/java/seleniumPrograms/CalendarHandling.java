package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();
		selectDate(19);
//		selectFutureDate("November 2024", 30);
//		selectPreviousDate("February 2024", 29);

		driver.quit();

	}

	public static void selectFutureDate(String expMonthYear, int day) {
		if (!isValidDate(expMonthYear, day)) {
			return;
		}

		String actMonYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();

		while (!actMonYear.equalsIgnoreCase(expMonthYear)) {
			// click on next icon
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		}

		selectDate(day);

	}

	public static void selectPreviousDate(String expMonthYear, int day) {
		if (!isValidDate(expMonthYear, day)) {
			return;
		}

		String actMonYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();

		while (!actMonYear.equalsIgnoreCase(expMonthYear)) {
			// click on next icon
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			actMonYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		}

		selectDate(day);

	}
	

	public static boolean isValidDate(String expMonthYear, int day) {
		if (day <= 0 || day > 31 || (expMonthYear.contains("February") && day > 29)) {
			System.out.println("Invalid date..." + day);
			return false;
		}

		if (expMonthYear.contains("February") && day == 29) {
			int year = Integer.parseInt(expMonthYear.split(" ")[1]);
			if (!(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
				System.out.println("Invalid date: February 29 is not in a leap year");
				return false;
			}
		}
		return true;
	}

	public static void selectDate(int day) {
		driver.findElement(By.xpath("//a[text()='" + day + "']")).click();

	}
}
