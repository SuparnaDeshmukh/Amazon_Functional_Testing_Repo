package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectingGetItTodayCheckbox {
//PRACTICE THIS AFTER LEARNING OF EXCEPTION HANDLING//
	@FindBy(xpath = ("//input[@id='twotabsearchtextbox']"))
	private WebElement searchbox;

	@FindBy(xpath = ("(//div//div//div[@role='button'])[2]"))
	private WebElement option2;

	@FindBy(xpath = ("(//div[@id='p_90-title'])[2]"))
	private WebElement deliveryday;

	@FindBy(xpath = ("(//div[13]//i[@class='a-icon a-icon-checkbox'])[2]"))
	private WebElement getittoday;

	@FindBy(xpath = ("//input[@id='nav-search-submit-button']"))
	private WebElement searchButton;
	
	

	@FindBy(xpath = ("//a[@class='a-size-base a-link-normal sf-collapsible-left-nav-expand-all a-text-bold']"))
	private WebElement expandAll;

	private Actions act;

	private WebDriver driver;

	private WebDriverWait wait;

	public SelectingGetItTodayCheckbox(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofMillis(1000));
		PageFactory.initElements(driver, this);
		act = new Actions(driver);

	}

	public void sendToSearchBox(String item) {
		searchbox.sendKeys(item);
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}

	public void clickonexpandAll() {
		wait.until(ExpectedConditions.visibilityOf(expandAll));
       // act.moveToElement(expandAll).click().build().perform();
		expandAll.click(); 
		System.out.println("collapse all is clicked");
	}

//	public void selectGetItToday() {
//		//wait=new  WebDriverWait(driver,Duration.ofMillis(1000));
//		wait.until(ExpectedConditions.visibilityOf(deliveryday));
//		act.moveToElement(deliveryday).moveToElement(getittoday).click().build().perform();
//        System.out.println("end");
//	}

//	public void searchMobile(String a) {
//		NavSearchMobile.sendKeys(a);
//		NavSearchMobile.sendKeys(Keys.ENTER);
//	}
//		
//	public void verifyGetItToday()
//	{
//		boolean result=getittoday.isSelected();
//		System.out.println(result);
//	}

}
