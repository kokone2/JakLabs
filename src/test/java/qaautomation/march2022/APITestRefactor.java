package qaautomation.march2022;

import static org.testng.Assert.assertEquals;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class APITestRefactor extends BaseAPITest {
	
	@Test
	public void testDashboardAPI() {
		Response responseDashboard = given().spec(loginJsonSpec).param("status", "completed")
				.when().get("/build_cards");
		
		assertEquals(responseDashboard.getStatusCode(),200);
				
	}
	
	
}
