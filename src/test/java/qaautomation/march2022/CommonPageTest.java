package qaautomation.march2022;

import org.testng.annotations.Test;

import qaautomation.march2022.pages.CommonPage;
import qaautomation.march2022.utils.UtilityTest;

public class CommonPageTest extends BaseWebTest{
	
	CommonPage commonPage = new CommonPage(driver, explicitWait);
	
	@Test
	public void testSwitching() {
		commonPage.openNewTab();
		commonPage.switchWindow(1);
		commonPage.openUrl("https://google.com");
		commonPage.openNewWindow();
		commonPage.switchWindow(2);
		commonPage.openUrl("https://youtube.com");
		commonPage.switchWindow(0);
	
	}
	
	@Test
	public void testScroll() {
		commonPage.openNewTab();
		commonPage.switchWindow(1);
		commonPage.openUrl("https://testautomasi.com/");
		commonPage.runJSCommand("window.scrollBy(0,1000)");
		UtilityTest.hardWait(3);
	}
}
