package qaautomation.march2022;

import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.march2022.pages.LoginPage;
import qaautomation.march2022.pages.ProfilePage;

/**
 * Unit test for simple App.
 */
public class AppTestAfterPOM extends BaseWebTest {
	
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	ProfilePage profilePage = new ProfilePage(driver, explicitWait);
	
	@Test
	public void loginSuccess() {
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLogin();
		String actualText = profilePage.getProfileText();
		String expectedText = "You logged into a secure area!";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void noClickLogin() {
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		String actualText = loginPage.loginText();
		String expectedText = "Login Page";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void loginFailed() {
		String username = "tomsmith";
		String password = "SuperSecretPassword";
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLogin();
		String actualText = loginPage.loginFlash();
		String expectedText = "Your password is invalid!";
		Assert.assertTrue(actualText.contains(expectedText));
	}
}
