package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsAndLists {
	
		@FindBy(xpath = ("//span[text()='Account & Lists']"))//1
		private WebElement accountsAndLists;

		@FindBy(xpath = ("//span[text()='Your Orders']"))  //2
		private WebElement yourOrder;
		
		WebDriver driver;
//		@FindBy(xpath = ("(//div[2]//span//a//img[@class='s-image'])[1]"))   //3
//		private WebElement purse;
//		
//		@FindBy(xpath = ("//span[@id='submit.add-to-cart']"))    //4
//		private WebElement AddToCart;

		
		public  AccountsAndLists(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
			

			public void clickAccountsAndLists() {
				Actions act=new Actions(driver);
				act.moveToElement(accountsAndLists).moveToElement( yourOrder).click().build().perform();
				System.out.println("your order option is selected");
			}

//			public void clickOnSearchButton() {
//				searchbutton.click();
//			}
//		
//
//			public void chooseYourPurse() {
//				purse.click();
//			}
//
//			public void clickOnAddToCart() {
//				AddToCart.click();
//			}
	
}
