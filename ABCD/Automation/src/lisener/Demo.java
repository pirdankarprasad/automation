package lisener;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	String TcId;
@BeforeMethod
public void driver() {
	Base_class b= new Base_class();
	b.initdriver();
}
@Test
public void TC01() {
	Reporter.log("Tc01 executed");
	 TcId="Tc01";
	Assert.fail();
}
@AfterMethod
public void Logout(ITestResult res) throws IOException {
	if (ITestResult.FAILURE==res.getStatus()) {
		
	
	Utility u=new Utility();
	u.takeScreenShot(TcId);
	Reporter.log("ScreenShot Captured");
	
	
	
}
}
}
