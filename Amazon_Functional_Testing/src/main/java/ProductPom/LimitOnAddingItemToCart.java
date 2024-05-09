package ProductPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LimitOnAddingItemToCart {

	@FindBy(xpath = ("//input[@id='twotabsearchtextbox']")) // 1
	private WebElement searchbox;

	@FindBy(xpath = ("//input[@id='nav-search-submit-button']")) // 2
	private WebElement searchbutton;

	private WebDriver driver;
	
	@FindBy(xpath = ("//span[@id='submit.add-to-cart']"))    //4
	private WebElement AddToCart;
	
	
	@FindBy(xpath = ("//span[@id='nav-cart-count']"))    //4
	private WebElement AddToCartImage;
	
	@FindBy(xpath = ("//input[@value='Delete']"))    //4
	private WebElement deleteButton;
	
	
	
	@FindBy(xpath = ("(//div[2]//span//a//img[@class='s-image'])[1]"))   //3
	private WebElement option2;
	
	
	@FindBy(xpath = ("//span[@id='a-autoid-0-announce']"))    //4
	private WebElement QuantityButton;
	

	@FindBy(xpath = ("//a[@id='quantity_10']"))    //4
	private WebElement Quantity10;
	
	private Actions act;
	
	
	public   LimitOnAddingItemToCart (WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		act=new Actions(driver);

	}
	
	public void sendValuesToSearchBox(String value) {
		searchbox.sendKeys(value);
	}

	public void clickOnSearchButton() {
		searchbutton.click();
	}
	
	
	public void chooseYourPurse() {
		option2.click();
	}

	public void clickOnAddToCart() {
		AddToCart.click();
	}
	
	public void ClickOnAddToCartImage()
	{
		AddToCartImage.click();
	}
	
	public void selectQuantity()
	{
		for( int i=0;i<100;i++)
		{
			
			act=new Actions(driver);

			act.moveToElement(QuantityButton).click().perform();;
			 act.moveToElement(Quantity10).click().build().perform();
			QuantityButton.click();
			QuantityButton.clear();
			QuantityButton .sendKeys("5");
		}
	}
	
	
}
