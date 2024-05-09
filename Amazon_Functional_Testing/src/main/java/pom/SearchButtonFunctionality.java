package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchButtonFunctionality {
	
	@FindBy(xpath = ("//input[@type='text']"))
	private WebElement searchbox;

	@FindBy(xpath = ("//input[@type='submit']"))
	private WebElement searchbutton;

	
	public SearchButtonFunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		

		public void sendValuesToSearchBox(String value) {
			searchbox.sendKeys("purses");
		}

		public void clickOnSearchButton() {
			searchbutton.click();
		}
	
	
	
	
//	driver.get("https://www.amazon.in");
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	driver.manage().window().maximize();
//	WebElement searchbox=driver.findElement(By.xpath("//input[@type='text']"));
//	searchbox.click();
//	searchbox.sendKeys("Laptop");
//	WebElement searchbutton=driver.findElement(By.xpath("//input[@type='submit']"));
//	searchbutton.click();
//	
}
