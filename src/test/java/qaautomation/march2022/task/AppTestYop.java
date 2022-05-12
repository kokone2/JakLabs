package qaautomation.march2022.task;

import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.march2022.yoppage.HomePage;
import qaautomation.march2022.yoppage.InboxPage;
import qaautomation.march2022.yoppage.CommonPage;

/**
 * Unit test for simple App.
 */
public class AppTestYop extends BaseYop {
	
	HomePage homePage = new HomePage(driver, explicitWait);
	InboxPage inboxPage = new InboxPage(driver, explicitWait);
	CommonPage commonPage = new CommonPage(driver, explicitWait);
	
	@Test
	public void searchSuccess() {
		String input = "automationtest";
		homePage.inputSearch(input);
		homePage.clickSearch();
		String actualText = inboxPage.getInboxText();
		String expectedText = "automationtest@yopmail.com";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void getFirstMsg() {
		String input = "automationtest";
		homePage.inputSearch(input);
		homePage.clickSearch();
		commonPage.switchToMsgFrame();
		System.out.println(inboxPage.getMsg());
	}

}
