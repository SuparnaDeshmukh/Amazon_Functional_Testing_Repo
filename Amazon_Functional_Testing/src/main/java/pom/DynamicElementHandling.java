package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicElementHandling {
	
	@FindBy(xpath =("//input[@id='twotabsearchtextbox']"))
	private WebElement searchbox;

	@FindBy(xpath =("(//div//div//div[@role='button'])[2]"))
	private WebElement option2;

	private WebDriver driver;
	
	public DynamicElementHandling(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		

		public void sendValuesToSearchBox(String value) {
			searchbox.sendKeys("purses");
		}

		public void chooseSecondOption() {
			Actions act=new Actions(driver);
			
			act.moveToElement(option2).click().build().perform();
			
		}
	
	
	
	
	
}
