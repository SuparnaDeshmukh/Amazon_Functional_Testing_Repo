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

import ProductPom.RemoveElementAddedInCart;
import browsersetting.Browsers;
import pom.AddToCartScenario;

public class VerifyAddToCartScenario  extends Browsers{

	private WebDriver driver;
	private  AddToCartScenario add;

	// private WebDriverWait wait;
	// @BeforeSuite
	@Parameters("browser")
	@BeforeTest

	public void launchBrowser(String browserName) throws InterruptedException {
		System.out.println("Before  Test");
		System.out.println(browserName);
		if (browserName.equals("Chrome")) {
			driver = openChromeBrowser();
			Thread.sleep(3000);
		}
		if (browserName.equals("Firefox")) {
			driver = openFirefoxBrowser();
			Thread.sleep(5000);
		}
		if (browserName.equals("Edge")) {
			driver = openEdgeBrowser();
			Thread.sleep(3000);

		}
		driver.manage().window().maximize();
	}

	@BeforeClass

	public void InitilisationOfPom() {
		System.out.println("Before class");
		add = new  AddToCartScenario(driver);
	}

	@BeforeMethod
	public void Signup() {
		System.out.println("beforemethod");
		driver.get("https://www.amazon.in/stores/page/A3398561-D71B-4ECB-928E-CBC894B64EEE");
	}

	@Test(priority = 1)
	public void verifyAddToCart() throws InterruptedException
	{
		add.sendValuesToSearchBox("purses");
    	add. clickOnSearchButton();
    	add.chooseYourPurse();
    	
    	 ArrayList<String> list=new ArrayList<String>(driver.getWindowHandles());
    	 driver.switchTo().window(list.get(1));
    	 
    	add.clickOnAddToCart();
    	
  	 

	}

	@AfterMethod

	public void CaptureScreenshotofFailedTest() {
		System.out.println("aftermethod");
	}

	@AfterClass

	public void afterclass() {
		System.out.println("afterclass");
		add= null;

	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("After test");
		driver.close();
		driver = null;
		System.gc();
	}

}





