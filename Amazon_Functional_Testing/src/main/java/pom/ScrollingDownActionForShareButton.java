package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScrollingDownActionForShareButton {

	@FindBy(xpath = ("//button[@class='shareButton']"))//1
	private WebElement shareButton;

	private WebDriver driver;
	JavascriptExecutor js;

	
	public  ScrollingDownActionForShareButton(WebDriver driver) {
		PageFactory.initElements(driver, this);
		js= (JavascriptExecutor)driver;
	}
		

		public void scrollingDown() {
			
			
			
			js.executeScript("arguments[0].scrollIntoView(true);",shareButton);
			
			js.executeScript("window.scrollBy(0,-500)");
			
		}

		public void clickOnShareButton() {
			shareButton.click();
		}
	

	
	
	
}
