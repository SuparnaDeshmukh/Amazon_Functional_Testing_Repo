package ProductPom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductSpecification {

	@FindBy(xpath = "(//div[@data-asin='B0BQJ9HZPP']//img)[2]")
	private WebElement laptop;

	private WebDriverWait wait;
	private WebDriver driver;
	JavascriptExecutor js;

	public ProductSpecification(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver = new ChromeDriver();
		this.driver = driver;
		js = (JavascriptExecutor)driver;
		wait = new WebDriverWait(driver, Duration.ofMillis(2000));
	}

	public void clickOnlaptop() {

		js.executeScript("arguments[0].scrollIntoView(true),laptop");
		
		 wait.until(ExpectedConditions.visibilityOf(laptop));
		laptop.click();
	}

//      public void checkSpecification()
//       {
//   	     String expectedTitle=
//       }

}