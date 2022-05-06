package qaautomation.march2022;

import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.march2022.pages.LoginPageFactory;
import qaautomation.march2022.pages.ProfilePageFactory;

/**
 * Unit test for simple App.
 */
public class AppTestAfterPageFactory extends BaseWebTestHeadless {
	
	
	@Test
	public void loginSuccess() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
		
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
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);

		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		
		String actualText = loginPage.loginText();
		String expectedText = "Login Page";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void loginPwdFailed() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);

		String username = "tomsmith";
		String password = "SuperSecretPassword";
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLogin();
		
		String actualText = loginPage.loginFlash();
		String expectedText = "Your password is invalid!";
		Assert.assertTrue(actualText.contains(expectedText));
	}
	@Test
	public void loginUserFailed() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);

		String username = "tomsmithss";
		String password = "SuperSecretPassword!";
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLogin();
		
		String actualText = loginPage.loginFlash();
		String expectedText = "Your username is invalid!";
		Assert.assertTrue(actualText.contains(expectedText));
	}
	
}
