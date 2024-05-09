package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MouseActionOnAccountsLists {

	@FindBy(xpath = ("//span[text()='Account & Lists']"))//1
	private WebElement accountsAndLists;
	
	@FindBy(xpath = ("//span[text()='Your Prime Video"))//1
	private WebElement yourPrimeVideo;
	
	private WebDriver driver;
	
	private Actions act;
	
	
	
	
	public  MouseActionOnAccountsLists(WebDriver driver) {
		PageFactory.initElements(driver, this);
		act=new Actions(driver);
		
	}
		

		public void selectAccontsAndLists() {
		    act.moveToElement(accountsAndLists).moveToElement( yourPrimeVideo).click().build().perform();
		}

		
	
	
	
	
	
}
