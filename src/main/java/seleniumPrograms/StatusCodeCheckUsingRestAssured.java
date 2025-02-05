package seleniumPrograms;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StatusCodeCheckUsingRestAssured {

	public static void main(String[] args) {
		Response response = RestAssured.get("https://www.google.com");
		System.out.println("HTTP status code is: "+ response.getStatusCode());

	}

}
