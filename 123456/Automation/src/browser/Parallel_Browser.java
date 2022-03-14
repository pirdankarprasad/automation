package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.testclass.Configuration;

public class Parallel_Browser {
@Test
public void TC02() {
	Reporter.log("TC01 executed", true);
	System.setProperty("webdriver.chrome.driver", Configuration.Chromepath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Test
public void TC03() {
	Reporter.log("TC01 executed", true);
	System.setProperty("webdriver.chrome.driver", Configuration.Chromepath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
}
@Test
public void TC04() {
	Reporter.log("TC01 executed", true);
	System.setProperty("webdriver.chrome.driver", Configuration.Chromepath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com");
	
}
@Test
public void TC05() {
	Reporter.log("TC01 executed", true);
	System.setProperty("webdriver.chrome.driver", Configuration.Chromepath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
}
@Test
public void TC06() {
	Reporter.log("TC01 executed", true);
	System.setProperty("webdriver.chrome.driver", Configuration.Chromepath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
}
@Test
public void TC07() {
	Reporter.log("TC01 executed", true);
	System.setProperty("webdriver.chrome.driver", Configuration.Chromepath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.apple.com");
}
@Test
public void TC08() {
	Reporter.log("TC01 executed", true);
	System.setProperty("webdriver.chrome.driver", Configuration.Chromepath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}

}
