package Base;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.ITestResult;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import java.io.IOException;
    import utils.screenshotutil;


	public class BaseTest {
		
		public WebDriver driver;
		@BeforeMethod
		public void setup() {
			
			driver = new ChromeDriver();
			driver.get("https://www.bannerhealthfoundation.org/");
			driver.manage().window().maximize();
			
		}
		
		@AfterMethod
		public void teardown(ITestResult result) throws IOException, InterruptedException {
			if(result.getStatus()== ITestResult.FAILURE) {
				screenshotutil.captureScreenshot(driver, result.getName());
		}
			Thread.sleep(2000);
			//driver.close();
}
}