package qaautomation.march2022.yoppage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InboxPage extends BasePage {
	By profileText = By.xpath("//div[@class='bname']");
	By mailMsg = By.xpath("//div[@id='mail']//div[1]//div[1]");

	public InboxPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		
	}
	
	public String getInboxText() {
		return getText(profileText);
		
	}
	
	public String getMsg() {
		return getText(mailMsg);
	}
}
