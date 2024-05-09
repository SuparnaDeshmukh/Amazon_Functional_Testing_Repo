package amazonTestNGPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browsersetting.Browsers;
import pom.AccountsAndLists;

public class VerifyAccountsAndLists extends Browsers {

	private WebDriver driver;
	private AccountsAndLists aal;
	//private WebDriverWait wait;

	@Parameters("browser")

	// @BeforeSuite
	@BeforeTest
	public void launchBrowser(String browserName) throws InterruptedException {
		System.out.println("Before  Test");
		System.out.println(browserName);
		if (browserName.equals("Chrome")) {
			driver = openChromeBrowser();
		}
		if (browserName.equals("Firefox")) {
			driver = openFirefoxBrowser();
			Thread.sleep(5000);
		}
		if (browserName.equals("Edge")) {
			driver = openEdgeBrowser();
			
		}
		driver.manage().window().maximize();
	}

	@BeforeClass
	public void InitilisationOfPom() {
		System.out.println("Before class");
		aal = new AccountsAndLists(driver);
		//this.driver=driver;
		//wait = new WebDriverWait(driver, Duration.ofMillis(2000));

	}

	@BeforeMethod

	public void Signup() {
		System.out.println("beforemethod");
		driver.get("https://www.amazon.in/stores/page/A3398561-D71B-4ECB-928E-CBC894B64EEE");
	}

	@Test
	public void clickAccountsAndLists() throws InterruptedException// @test
	{
		// wait.until(ExpectedConditions.visibilityOf(aal.accountsAndLists));
		Thread.sleep(20000);
		aal.clickAccountsAndLists();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void CaptureScreenshotofFailedTest() {
		System.out.println("aftermethod");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
		aal = null;

	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("After test");
		driver.close();
		driver = null;
		System.gc();
	}
	// @AfterSuite

}
