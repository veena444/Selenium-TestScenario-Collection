package seleniumPrograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HttpStatusCodeCheck {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com";
		int statusCode = getStatusCode(url);
		System.out.println("HTTP status code is: " +statusCode);
		driver.quit();

	}
	
	public static int getStatusCode(String url) throws IOException {
		
	        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
	        connection.setRequestMethod("GET");
	        connection.connect();
	        return connection.getResponseCode();		

	}

}
