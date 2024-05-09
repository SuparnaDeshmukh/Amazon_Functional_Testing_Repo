package cartPagePom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IncreaseInQuantityNumberOnAddingSameItem {

	@FindBy(xpath = ("//input[@id='twotabsearchtextbox']"))//1
	private WebElement searchbox;

	@FindBy(xpath = ("//input[@id='nav-search-submit-button']"))  //2
	private WebElement searchbutton;
	
	

	@FindBy(xpath = ("(//div[@data-asin='B00JAK1PMI']//img)[1]"))   //3
	private WebElement watches;
	
	@FindBy(xpath = ("//span[@id='submit.add-to-cart']"))    //4
	private WebElement addToCart;
	
	@FindBy(xpath = ("//select[@id='quantity']"))    //4
	private WebElement quantityButton;
	
	
	@FindBy(xpath = ("//span[@id='nav-cart-count']"))    //4
	private WebElement addToCartImage;
	
	
	@FindBy(xpath = ("//span[@id='a-autoid-0-announce']"))    //4
	private WebElement qtyButton;
	
	@FindBy(xpath = ("//span[@id='attachSiNoCoverage']"))    //4
	private WebElement skipButton;
	 
	
	private WebDriverWait wait;

    private WebDriver driver;
	
	
	
	
	public   IncreaseInQuantityNumberOnAddingSameItem(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		wait=new  WebDriverWait(driver,Duration.ofMillis(3000));
	}
		

		public void sendValuesToSearchBox(String value) {
			searchbox.sendKeys(value);
		}

	public void clickOnSearchButton() {
		searchbutton.click();
	}

	public void chooseYourWatch() {
		watches.click();
	}

	public void clickOnAddToCart() {
		addToCart.click();
	}
	
	public void clickOnquantityButton()
	{
		Select s=new Select(quantityButton);
		s.selectByValue("3");
		
		quantityButton.click();
	}
	public void clickOnskipButton()
	{
		wait.until(ExpectedConditions.visibilityOf(skipButton));
		skipButton.click();
	}
	public void clickOnAddToCartImage() throws InterruptedException
	{
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOf(addToCartImage));
		addToCartImage.click();
	}

	public void checkqtyButton()
	{
		boolean result=qtyButton.isDisplayed();
		System.out.println(result);
	
	}


	
	    
	
	
}
