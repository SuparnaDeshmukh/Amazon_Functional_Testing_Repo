package ProductPomTest;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ProductPom.LimitOnAddingItemToCart;
import ProductPom.RemoveElementAddedInCart;

public class VerifyLimitOnAddingItemToCart {

	
	public static void main(String[] args) {
		  WebDriver driver=new ChromeDriver();
		      	
		      	driver.manage().window().maximize();
		      	driver.get("https://www.amazon.in");
		      	
		      	
		      	RemoveElementAddedInCart obj=new RemoveElementAddedInCart(driver); 
		      	obj.sendValuesToSearchBox("purses");
		      	obj. clickOnSearchButton();
		      	obj.chooseYourPurse();
		      	
		      	 ArrayList<String> list=new ArrayList<String>(driver.getWindowHandles());
		      	 driver.switchTo().window(list.get(1));
		      	 
		      obj.clickOnAddToCart();
		      	
		      	obj.ClickOnAddToCartImage();
		      	
		      	LimitOnAddingItemToCart obj2=new LimitOnAddingItemToCart(driver);
		      	
		      	// driver.switchTo().window(list.get(2));
		      	 
		      	  obj2.selectQuantity();
		      	 
		      	
		      
}
}

