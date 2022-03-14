package lisener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testclass.Configuration;

public class Base_class {
public WebDriver initdriver() {
	System.setProperty("webdriver.chrome.driver", Configuration.Chromepath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		return driver;
	}
}

