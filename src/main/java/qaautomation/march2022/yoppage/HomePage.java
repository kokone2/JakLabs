package qaautomation.march2022.yoppage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	By inputText = By.xpath("//input[@id='login']");
	By searchButton = By.xpath("//button[@title='Check Inbox @yopmail.com']");
	By bannerText = By.xpath("//span[@class='notmobile']");

	public HomePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		
	}
	
	public void inputSearch(String user) {
		setText(inputText, user);
		
	}
	
	public void clickSearch() {
		clickAndWait(searchButton);
		
	}
	
	public String homeText() {
		return getText(bannerText);
		
	}
	
}
