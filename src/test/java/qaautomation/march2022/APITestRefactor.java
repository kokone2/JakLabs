package qaautomation.march2022;

import static org.testng.Assert.assertEquals;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;

import io.restassured.response.Response;
import qaautomation.march2022.utils.DataUtility;

public class APITestRefactor extends BaseAPITest {
	
	@Test
	public void testDashboardAPI() throws FilloException {
		Response responseDashboard = given().spec(loginJsonSpec).param("status", "completed")
				.when().get("/build_cards");
		
		responseDashboard.then().assertThat()
		.body(matchesJsonSchema(DataUtility.getDataFromExcel("Schemas", "DashboardAPISchema")));
		
		assertEquals(responseDashboard.getStatusCode(),200);
				
	}
	
	@Test
	public void testDashboardWithoutToken() throws FilloException {
		Response responseDashboard = given().spec(commonJsonSpec).param("status", "completed").when()
				.get("/build_cards");

		responseDashboard.then().assertThat()
				.body(matchesJsonSchema(DataUtility.getDataFromExcel("Schemas", "DashboardNoTokenSchema")));

	}
	
	@Test
	public void testDashboardWithoutParam() throws FilloException {
		Response responseDashboard = given().spec(loginJsonSpec).when().get("/build_cards");

		responseDashboard.then().assertThat()
				.body(matchesJsonSchema(DataUtility.getDataFromExcel("Schemas", "DashboardNoParamSchema")));

	}
	
}
