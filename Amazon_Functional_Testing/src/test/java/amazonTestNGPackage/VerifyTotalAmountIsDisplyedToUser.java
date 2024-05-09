package amazonTestNGPackage;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browsersetting.Browsers;
import cartPagePom.IncreaseInQuantityNumberOnAddingSameItem;
import cartPagePom.TotalAmountIsDisplayedToUser;
import pom.AccountsAndLists;

public class VerifyTotalAmountIsDisplyedToUser  extends Browsers{
	private WebDriver driver;
	private TotalAmountIsDisplayedToUser tamount;
	private IncreaseInQuantityNumberOnAddingSameItem qty;
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
		tamount = new TotalAmountIsDisplayedToUser(driver);
		qty=new IncreaseInQuantityNumberOnAddingSameItem(driver);
	}

	@BeforeMethod

	public void Signup() {
		System.out.println("beforemethod");
		driver.get("https://www.amazon.in/stores/page/A3398561-D71B-4ECB-928E-CBC894B64EEE");
	}

	@Test
	public void verifyTotalAmountDisplayed() throws InterruptedException// @test
	{
		// wait.until(ExpectedConditions.visibilityOf(aal.accountsAndLists));
		Thread.sleep(20000);
		
		qty.sendValuesToSearchBox(" casio watches");
		qty.clickOnSearchButton();
		qty.chooseYourWatch();
		

		ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
		qty.clickOnquantityButton();
		qty.clickOnAddToCart();
		qty.clickOnskipButton();
		qty.clickOnAddToCartImage();

		qty.checkqtyButton();
		
		tamount.checksubtotal();

	
	}

	@AfterMethod
	public void CaptureScreenshotofFailedTest() {
		System.out.println("aftermethod");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
		tamount = null;

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

	

