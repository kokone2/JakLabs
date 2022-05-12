package qaautomation.march2022.yoppage;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPage extends BasePage {

	public CommonPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		
	}
	
	public void openUrl(String url) {
		driver.get().get(url);
	}
	
	public void openNewTab() {
		driver.get().switchTo().newWindow(WindowType.TAB);
	}
	
	public void openNewWindow() {
		driver.get().switchTo().newWindow(WindowType.WINDOW);
	}

	public void switchWindow(int index) {
		Set<String> handles = driver.get().getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(handles);
		driver.get().switchTo().window(tabs.get(index));
	}

	public void navBrowserForward() {
		driver.get().navigate().forward();
	}
	
	public void navBrowserBackward() {
		driver.get().navigate().back();
	}
	
	public void navBrowserRefrash() {
		driver.get().navigate().refresh();
	}
	
	public void runJSCommand(String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript(script);
	}

	public void switchToMsgFrame() {
		driver.get().switchTo().frame(driver.get().findElement(By.xpath("//iframe[@id='ifmail']")));

	}
}
