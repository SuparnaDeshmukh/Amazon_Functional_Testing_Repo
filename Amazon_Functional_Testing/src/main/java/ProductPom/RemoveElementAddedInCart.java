package ProductPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveElementAddedInCart {

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
	

	public RemoveElementAddedInCart(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		

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
	
	public void ClickOnDeleteButton()
	{
		deleteButton.click();
		System.out.println("your iteam is deleted from cart");
	}


}
