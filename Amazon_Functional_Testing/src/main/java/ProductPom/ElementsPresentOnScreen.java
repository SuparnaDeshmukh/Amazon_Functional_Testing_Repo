package ProductPom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPresentOnScreen {

	private WebDriver driver;
    private Actions act;
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchBox;

	//@FindBy(xpath = "//div[@class='autocomplete-results-container']")
	private List<WebElement> elements;

	@FindBy(xpath = ("(//div//div//div[@role='button'])[2]"))
	private WebElement option2;
	
	
	@FindBy(xpath = ("//input[@id='nav-search-submit-button']"))  //2
	private WebElement searchbutton;
	 
//	@FindBy(xpath = ("//img[@class='s-image']"))  //2
//	private WebElement count;
	 

	// Constructor
	public ElementsPresentOnScreen(WebDriver driver) {
		this.driver = driver;
		act=new Actions(driver);
		PageFactory.initElements(driver, this);
		

	}

	public void checkAutoSuggestion(String a) {
		searchBox.sendKeys("mobile");

	}	//act.moveToElement(option2).click().build().perform();
	
	public void clickOnSearchButton() throws InterruptedException {
		Thread.sleep(4000);
		searchbutton.click();
		
		
	
		elements=driver.findElements(By.xpath("//img[@class='s-image']"));
		
		int count=elements.size();
		
		
		System.out.println("no of product present on screen is"+ count);

	}

}
