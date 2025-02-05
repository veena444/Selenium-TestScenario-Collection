package seleniumPrograms;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v131.network.model.Response;
import org.openqa.selenium.devtools.v131.network.Network;



public class StatusCodeCheckUsingDevTools {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		
		devTools.createSession();
		
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		
		devTools.addListener(Network.responseReceived(), response -> {
			Response res = response.getResponse();
			System.out.println("URL: " + res.getUrl() + " | Status Code: " + res.getStatus());
		});
		
		driver.get("https://www.google.com");
		driver.quit();

	}

}
