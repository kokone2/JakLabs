package qaautomation.march2022.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	By username = By.xpath("//input[@id='username']");
	By password = By.id("password");
	By loginButton = By.xpath("//button[@type='submit']");
	By bannerText = By.xpath("//h2[normalize-space()='Login Page']");
	By bannerFlash = By.xpath("//div[@id='flash']");

	public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		
	}
	
	public void inputUsername(String user) {
		setText(username, user);
		
	}
	
	public void inputPassword(String pass) {
		setText(password, pass);
		
	}
	
	public void clickLogin() {
		clickAndWait(loginButton);
		
	}
	
	public String loginText() {
		return getText(bannerText);
		
	}

	public String loginFlash() {
		return getText(bannerFlash);
	}
	
}
