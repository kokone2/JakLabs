package qaautomation.march2022.task;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIRegKolak {
	String username = "";
	String password = "";
	String email = "";
	String phone = "";
	Faker faker = new Faker();
	

	@Test
	public void testLoginAPI() {
		username = faker.name().username();
		password = faker.internet().password();
		email = faker.internet().emailAddress();
		phone = faker.phoneNumber().cellPhone();
		
		RestAssured.baseURI = "https://kolakproject.herokuapp.com";
		String createUser = "{\"username\": \"" + username + "\","
							+ "\"password\": \"" + password + "\","
							+ "\"email\": \"" + email + "\","
							+ "\"phonenumber\": \"" + phone + "\"}";
		Response responseUserCreate = RestAssured.given().contentType("application/json").body(createUser).when().post("/register");
		assertEquals(responseUserCreate.getStatusCode(),201);
				
	}
}
